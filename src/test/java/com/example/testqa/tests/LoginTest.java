package com.example.testqa.tests;

import com.example.testqa.pages.LoginPage;
import com.example.testqa.pages.RegisterPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Condition.*;



public class LoginTest {
    private final LoginPage loginPage = new LoginPage();

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://dev-cinescope.t-qa.ru";
    }

    @Test
    void loginFormIsVisible() {
        loginPage.openPage();
        loginPage.heading().shouldBe(visible).shouldHave(exactText("Вход"));
        loginPage.loginInput().shouldBe(visible);
        loginPage.passwordInput().shouldBe(visible);
        loginPage.submitButton().shouldBe(visible).shouldHave(exactText("Войти"));
        loginPage.registrationLink().shouldBe(visible).shouldHave(exactText("Зарегистрироваться"));
    }
    @Test
    void userCanOpenRegistration() {
        RegisterPage registerPage = loginPage.openPage().openRegistration();

        webdriver().shouldHave(url(Configuration.baseUrl +"/register"));
        registerPage.heading().shouldBe(visible).shouldHave(exactText("Регистрация"));
        registerPage.loginInput().shouldBe(visible);
        registerPage.emailInput().shouldBe(visible);
        registerPage.passwordInput().shouldBe(visible);
        registerPage.registerButton().shouldBe(visible);
    }
}
