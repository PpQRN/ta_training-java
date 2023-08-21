package com.epam.training.student_aliaksandr_kavaliou.framework.DriverOptions;

import com.codeborne.selenide.WebDriverRunner;
import com.epam.training.student_aliaksandr_kavaliou.framework.BrowserOptions.BrowserOptionFactory;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriverCreator   {
    public void create(){
        String urlToRemoteWD = "http://26.189.33.206:4444/";
        try {
            RemoteWebDriver driver = new RemoteWebDriver(new URL(urlToRemoteWD),
                    BrowserOptionFactory.getBrowserOptions(System.getProperty("remoteBrowser")));
            WebDriverRunner.setWebDriver(driver);
        } catch (MalformedURLException e){
            throw new RuntimeException();
        }
    }
}