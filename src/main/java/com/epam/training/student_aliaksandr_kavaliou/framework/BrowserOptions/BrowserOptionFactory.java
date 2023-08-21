package com.epam.training.student_aliaksandr_kavaliou.framework.BrowserOptions;

import org.openqa.selenium.remote.AbstractDriverOptions;

public class BrowserOptionFactory {

    public static AbstractDriverOptions options;

    public static AbstractDriverOptions getBrowserOptions(String browser){
        switch (browser){
            case "edge" -> options = BrowserOptions.getEdgeOptions();
            default -> options = BrowserOptions.getChromeOptions();
        }
        return options;
    }
}
