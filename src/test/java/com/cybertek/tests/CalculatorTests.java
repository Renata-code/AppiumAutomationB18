package com.cybertek.tests;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTests {

    AndroidDriver<AndroidElement> driver;

    /**
     * {
     * "platformName": "Android",
     * "deviceName": "Pixel_2",
     * "appPackage": "com.android.calculator2",
     * "platformVersion": "7.0",
     * "fullReset": "true",
     * "automationName": "UiAutomator2",
     * "newCommandTimeout": "7200",
     * "appActivity": "com.android.calculator2.Calculator"
     * }
     */
    @Before
    public void setup() throws Exception {
//        CapabilityType.PLATFORM_NAME == "platformName"
//        MobileCapabilityType.AUTOMATION_NAME == "automationName"
//        AndroidMobileCapabilityType.APP_ACTIVITY == "appActivity"

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("newCommandTimeout", "7200");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        //http://localhost:4723/wd/hub - appium server address
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }
}
