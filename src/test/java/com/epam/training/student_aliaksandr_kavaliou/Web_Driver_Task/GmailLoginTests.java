package com.epam.training.student_aliaksandr_kavaliou.Web_Driver_Task;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.Links.Links;
import com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject.GmailHeader;
import org.testng.annotations.*;


public class GmailLoginTests extends BaseTest {

    @BeforeMethod
    public void openHomePage() {
        Open(Links.HomepageGmail.getLink());
    }

    @Test
    public void emptyCredentialsTest() {
        new GmailHeader().clickOnLoginButton()
                .enterLogin("")
                .clickOnNextButton()
                .getErrorText()
                .shouldHave(Condition.text("Введите адрес электронной почты или номер телефона."));
    }

    @Test
    public void wrongCredentialsTest() {
        new GmailHeader().clickOnLoginButton()
                .enterLogin("notExistingCredentialsIHope.com")
                .clickOnNextButton()
                .getErrorText()
                .shouldHave(Condition.text("Не удалось найти аккаунт google."));
    }

    @Test
    public void validCredentialsTest() {
        new GmailHeader().clickOnLoginButton()
                .enterLogin("sashatestmail056@gmail.com")
                .clickOnNextButton()
                .enterPassword("Password123456$")
                .clickOnNextButtonaAfterPassword()
                .incomingMsgField().shouldBe(Condition.visible);
    }

    @AfterMethod
    public void tearDown(){
        WebDriverRunner.getWebDriver().quit();
    }
}

