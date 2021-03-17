package com.seleniumtests.tests.security;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ClientApiException;

import com.seleniumtests.blogexamples.driversetup.BaseSecurity;

public class SampleSecurityTest extends BaseSecurity {

    private static final String REG_URL = "https://stag-online.cake.net/12888306";

    WebDriver driver=getDriver();

    @Test()
    public void scanRegPage() throws ClientApiException {
        driver.get(REG_URL);
        driver.manage().window().maximize();
        // some more logic using page object goes here
        checkRiskCount(REG_URL);
    }
}