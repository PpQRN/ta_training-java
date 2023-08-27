package com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GmailMailPage extends BasePage{
     private final SelenideElement incomingMsg = $x("//a[@href = 'https://mail.google.com/mail/u/1/#inbox']");
     private final SelenideElement writeButton = $x("//div[@class = 'T-I T-I-KE L3']");
     private final SelenideElement toWhomField = $x("//input[@class = 'agP aFw']");
     private final SelenideElement textBox = $x("//td[@class = 'Ap']//div[@class = 'Am Al editable LW-avf tS-tW']");
     private final SelenideElement sendButton = $x("//div[@class = 'T-I J-J5-Ji aoO v7 T-I-atl L3']");

     public SelenideElement getVhodyashie(){
         return incomingMsg;
     }

     public GmailMailPage clickOnWriteButton(){
         writeButton.shouldBe(Condition.visible)
                 .click();
         return this;
     }

     public GmailMailPage inputReciever(String email){
         toWhomField.shouldBe(Condition.visible)
                 .sendKeys(email);
         return this;
     }

     public GmailMailPage enterText(String text){
         textBox.shouldBe(Condition.visible)
                 .sendKeys(text);
         return this;
     }

     public GmailMailPage clickOnSendButton(){
         sendButton.click();
         return this;
     }

}
