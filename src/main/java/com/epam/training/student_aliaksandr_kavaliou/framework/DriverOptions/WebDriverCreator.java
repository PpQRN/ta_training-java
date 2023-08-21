package com.epam.training.student_aliaksandr_kavaliou.framework.DriverOptions;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface WebDriverCreator <T extends RemoteWebDriver> {
    T create();
}
