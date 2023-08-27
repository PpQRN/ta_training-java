package com.epam.training.student_aliaksandr_kavaliou.framework.DriverOptions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.codeborne.selenide.Selenide.open;

public class DriverManager {
    private static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String driverType) {
        if (driver.get() != null) {
            return;
        }
        if ("remote".equals(driverType)) {
            new RemoteDriverCreator().create();
            return;
        }
        if (driverType == null) {
            driverType = "chrome";
        }
        Configuration.browser = driverType;
        Configuration.pageLoadTimeout = 20000;
        open();
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}
