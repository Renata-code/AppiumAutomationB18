package com.cybertek.tests;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class ChromeBrowserTest {

        private final static Logger logger = Logger.getLogger(ChromeBrowserTest.class);

        @Test
        public void test() throws Exception {
            //in case if fails have to add this below
            //WebDriverManager.chromedriver().browserVersion("2.23").setup();

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");

            WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
            driver.get("http://google.com");
            logger.info(driver.getTitle());
            Thread.sleep(3000);
            driver.quit();
        }



}
