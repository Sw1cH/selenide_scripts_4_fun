package com.sw1ch.selenide_scripts_4_fun.utils;

import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class SetupHelpers {

    public static void selectbrowser(int browserNumber) {
        switch (browserNumber) {
            case 0:
//                System.setProperty("webdriver.phantomjs.driver", "C:\\Selenium\\phantomjs.exe");
//                System.setProperty("selenide.browser", "phantomjs");
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("takesScreenshot", true);
                caps.setJavascriptEnabled(true);
                caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\Selenium\\phantomjs.exe");
                setWebDriver(new PhantomJSDriver(caps));
                break;
            case 1:
                //todo
                //////C:\\Users\\OlegN\\IdeaProjects\\selenide_tests\\utils
                //System.setProperty("webdriver.chrome.driver", "C:\\Users\\OlegN\\IdeaProjects\\selenide_tests\\utils\\chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sw1ch\\IdeaProjects\\selenide_scripts_4_fun\\utils\\chromedriver.exe");
                System.setProperty("selenide.browser", "Chrome");
                break;
            default:

                break;
        }
    }
}
