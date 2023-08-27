package com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BasePage {


    public BasePage() {
    }

    public String getCurrentURL() {
        return getWebDriver().getCurrentUrl();
    }
}