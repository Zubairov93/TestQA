package com.example.testqa.tests;

import com.example.testqa.pages.LoginPage;
import com.example.testqa.pages.RegisterPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginTest {
    private final LoginPage loginpage = new LoginPage();

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://dev-cinescope.t-qa.ru";
    }

    @Test
    void loginFormInvisible() {
        loginpage.openPage();

        loginpage.loginInput().shouldBe(visible);
        loginpage.passwordInput().shouldBe(visible);
        loginpage.submitButton().shouldBe(visible);
        loginpage.registrationLink().shouldBe(visible);

    }
    @Test
    void userCanOpenRegistration() {
        RegisterPage registerPage = loginpage.openPage().openRegistration();

        assertTrue(WebDriverRunner.url().endsWith("/register"));
        registerPage.heading().shouldHave(text("Регистрация"));
    }

}
