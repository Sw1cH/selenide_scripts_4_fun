package com.sw1ch.selenide_scripts_4_fun.youtube;

import com.sw1ch.selenide_scripts_4_fun.utils.SetupHelpers;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Made on 29.10.2017 to check if selenide is working as expected
 */
public class CheckWebSite {

    @BeforeTest
    public void setUp()throws Exception{
        SetupHelpers.selectbrowser(0);
    }

    @Test
    public void isGoogleAvailable (){
        open("https://www.google.lv");
        $("#hplogo").isDisplayed();
    }

    @Test void isYoutubeAvailable() {
        open("https://www.youtube.com/");
        $("#logo-icon-container").isDisplayed();
    }

}
