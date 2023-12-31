package com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GmailHeader extends BasePage{

    private static final SelenideElement loginButton = $x("//a[contains(@class, 'button') " +
            "and contains(@data-action, 'sign in')]");

    public GmailLoginPage clickOnLoginButton(){
        Configuration.timeout = 10000;
        loginButton.shouldBe(Condition.visible)
                .click();
        return new GmailLoginPage();
    }



}
