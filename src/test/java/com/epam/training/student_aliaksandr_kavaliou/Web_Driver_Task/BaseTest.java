package com.epam.training.student_aliaksandr_kavaliou.Web_Driver_Task;

import com.epam.training.student_aliaksandr_kavaliou.framework.DriverOptions.DriverManager;
import com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.Links.Links;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    public void Open() {
        DriverManager.initDriver("Edge");
        open(Links.HomepageGmail.getLink());
    }
}
