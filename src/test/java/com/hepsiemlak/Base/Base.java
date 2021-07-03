package com.hepsiemlak.Base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Base {
        protected static WebDriver driver;
        public Base() {
        }

        @BeforeScenario
        public void setUp() {

                ChromeOptions options = new ChromeOptions();
                options.addArguments(new String[]{"start-maximized"});
                options.addArguments(new String[]{"--disable-notifications"});
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver(options);
                driver.get("https://www.google.com/");
                driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);
        }

       @AfterScenario
        public void tearDown() {
        }

    public static WebDriver getWebDriver() {
        return driver;
    }


}
