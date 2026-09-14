package com.example.testqa.pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class RegisterPage {

    private final SelenideElement heading = $("h2");
    private final SelenideElement loginInput = $("input[name = 'login'}");
    private final SelenideElement emailInput = $("input[name='email']");
    private final SelenideElement passwordInput = $("input[name = 'password']");

    public SelenideElement heading() {
        return heading;
    }

    public SelenideElement loginInput() {
        return loginInput;
    }

    public SelenideElement emailInput() {
        return emailInput;
    }

    public SelenideElement passwordInput() {
        return passwordInput;
    }
}
