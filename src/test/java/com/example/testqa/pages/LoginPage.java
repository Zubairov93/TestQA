package com.example.testqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;


public class LoginPage {
    private final SelenideElement loginInput = $("input[name = 'login']");
    private final SelenideElement passwordInput = $("input[name='password']");
     private final SelenideElement submitButton = $("button[type = 'submit']");
     private final SelenideElement registrationLink = $("a[href = '/register']");

     public LoginPage openPage(){
         open("/login");
         return this;
     }

    public SelenideElement loginInput() {
        return loginInput;
    }
    public SelenideElement passwordInput() {
        return passwordInput;
    }
    public SelenideElement submitButton() {
        return submitButton;
    }
    public SelenideElement registrationLink() {
        return registrationLink;
    }
    public RegisterPage openRegistration() {
         registrationLink.click();
         return new RegisterPage();
     }

}
