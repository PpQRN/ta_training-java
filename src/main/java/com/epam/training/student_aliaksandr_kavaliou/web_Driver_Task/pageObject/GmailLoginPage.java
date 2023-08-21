package com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GmailLoginPage extends BasePage{

    public static final SelenideElement emailField = $x("//input[@type = 'email']");
    public static final SelenideElement passwordField = $x("//input[@type = 'password']");
    public static final SelenideElement nextButton = $x("//span[contains(text(), 'Далее')]");
    public static final SelenideElement errorText = $x("//div[@class = 'o6cuMc Jj6Lae']");

    public SelenideElement getErrorText(){
        return errorText;
    }
    public GmailLoginPage enterLogin (String text){
        emailField.shouldBe(Condition.visible)
                .sendKeys(text);
        return this;
    }

    public GmailLoginPage enterPassword (String text){
        passwordField.shouldBe(Condition.visible)
                .sendKeys(text);
        return this;
    }

    public GmailLoginPage clickOnNextButton(){
        nextButton.shouldBe(Condition.visible)
                .click();
        return this;
    }

    public GmailMailPage clickOnNextButtonafterPassword(){
        nextButton.shouldBe(Condition.visible)
                .click();
        return new GmailMailPage();
    }
}
