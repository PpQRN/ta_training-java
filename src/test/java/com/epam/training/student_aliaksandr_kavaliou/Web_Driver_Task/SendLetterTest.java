package com.epam.training.student_aliaksandr_kavaliou.Web_Driver_Task;

import com.codeborne.selenide.Condition;
import com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.Links.Links;
import com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject.GmailHeader;
import com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject.GmailMailPage;
import com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject.YandexMailLoginPage;
import com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject.YandexMailPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SendLetterTest {

    @BeforeTest
    public void loginInGmail(){
        open(Links.HomepageGmail.getLink());
        new GmailHeader().clickOnLoginButton()
                .enterLogin("sashatestmail056@gmail.com")
                .clickOnNextButton()
                .enterPassword("Password123456$")
                .clickOnNextButtonaAfterPassword();
    }

    @Test
    public void SendTest(){
        new GmailMailPage().clickOnWriteButton()
                .inputReciever("sashatestmail056@yandex.ru")
                .enterText("new text")
                .clickOnSendButton();
        open(Links.HomepageYandex.getLink());
        new YandexMailLoginPage().clickOnLoginButton()
                .enterLogin("sashatestmail056@yandex.ru")
                .clickOnEnterButton()
                .enterPassword("Password123456$753951")
                .clickOnEnterButtonAfterPassword()
                .waitUntilLetterAppears()
                .clickOnRefreshButton()
                .clickOnNewLetter()
                .getLetterText()
                .shouldHave(Condition.text("new text"));
        new YandexMailPage().clickOnRelevantButton()
                .clickOnLetterCheckbox()
                .clickOnDeleteButton();
    }
}
