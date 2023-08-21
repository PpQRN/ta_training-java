package com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class YandexMailPage extends BasePage {

    private static final SelenideElement refreshButton = $x("//button[@aria-label = " +
            "'Проверить, есть ли новые письма']");
    private static final SelenideElement newLetterFromAliaksandr = $x("//span[@class " +
            "= 'mail-MessageSnippet-Item mail-MessageSnippet-Item_sender js-message-snippet-sender' " +
            "and contains(., 'Aliaksandr')]");
    private static final SelenideElement letterText = $x("//div[@dir = 'ltr']");
    private static final SelenideElement letterCheckBox = $x("//span[@class " +
            "= '_nb-checkbox-flag _nb-checkbox-normal-flag']");
    private static final SelenideElement deleteButton = $x("//div[contains(@class, 'delete')]");
    private static final SelenideElement relevantButton = $x("//a[@href = '#tabs/relevant']");


    public YandexMailPage clickOnRefreshButton(){
        refreshButton.shouldBe(Condition.visible);
        return this;
    }

    public YandexMailPage clickOnNewLetter(){
        Configuration.timeout = 10000;
        newLetterFromAliaksandr.shouldBe(Condition.visible)
                .click();
        return this;
    }

    public SelenideElement getLetterText(){
        return letterText;
    }

    public YandexMailPage clickOnLetterCheckbox(){
        letterCheckBox.shouldBe(Condition.visible)
                .click();
        return this;
    }

    public YandexMailPage clickOnDeleteButton(){
        deleteButton.shouldBe(Condition.visible)
                .click();
        return this;
    }

    public YandexMailPage clickOnRelevantButton(){
        relevantButton.shouldBe(Condition.visible)
                .click();
        return this;
    }

    public YandexMailPage waitUntilLetterAppears(){
        try{
        Thread.sleep(10000);}
        catch (InterruptedException exception){}
        return this;
    }


}
