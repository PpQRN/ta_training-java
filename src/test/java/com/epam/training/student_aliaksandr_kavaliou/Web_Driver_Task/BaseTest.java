package com.epam.training.student_aliaksandr_kavaliou.Web_Driver_Task;

import com.epam.training.student_aliaksandr_kavaliou.framework.DriverOptions.DriverManager;


import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public void Open(String link) {
        DriverManager.initDriver(System.getProperty("driverType"));
        open(link);
    }
}
