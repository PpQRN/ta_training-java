package com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class YandexMailLoginPage extends BasePage {

    private final static SelenideElement loginButton = $x("//a[@id = 'header-login-button']");
    private final static SelenideElement loginInputField = $x("//input[@data-t = 'field:input-login']");
    private final static SelenideElement enterButton = $x("//button[@data-t = 'button:action:passp:sign-in']");
    private final static SelenideElement passwordInputField = $x("//input[@data-t = 'field:input-passwd']");


    public YandexMailLoginPage clickOnLoginButton(){
        loginButton.shouldBe(Condition.visible)
                .click();
        return new YandexMailLoginPage();
    }

    public YandexMailLoginPage enterLogin(String login){
        loginInputField.shouldBe(Condition.visible)
                .sendKeys(login);
        return this;
    }

    public YandexMailLoginPage clickOnEnterButton(){
        enterButton.shouldBe(Condition.visible)
                .click();
        return this;
    }

    public YandexMailPage clickOnEnterButtonAfterPassword(){
        enterButton.shouldBe(Condition.visible)
                .click();
        return new YandexMailPage();
    }

    public YandexMailLoginPage enterPassword(String password){
        passwordInputField.shouldBe(Condition.visible)
                .sendKeys(password);
        return this;
    }


}
