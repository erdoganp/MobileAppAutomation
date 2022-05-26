package com.hepsiburada.bases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public static AppiumDriver driver;


    public static void androidSetup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("platformVersion","11.0");
        desiredCapabilities.setCapability("deviceName", "sdk_gphone_x86");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("noReset", false);
        desiredCapabilities.setCapability("fullReset", true);
        desiredCapabilities.setCapability("app",System.getProperty("user.dir") +"/apps/hepsiburada.apk");

        driver =new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
    }
    public static void tearDown() {
            if (driver != null) {
                driver.quit();

        }
    }

}
