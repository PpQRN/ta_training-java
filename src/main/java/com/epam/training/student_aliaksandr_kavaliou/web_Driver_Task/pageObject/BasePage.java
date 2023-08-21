package com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.pageObject;

import com.epam.training.student_aliaksandr_kavaliou.framework.DriverOptions.DriverManager;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BasePage {

//    public BasePage() {
//        DriverManager.initDriver(System.getProperty("driverType"));
//    }
public BasePage() {
    DriverManager.initDriver("Edge");
}

    public String getCurrentURL() {
        return getWebDriver().getCurrentUrl();
    }

}