package com.qa.resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public  WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream(
                "/Users/paulosegun/IdeaProjects/Practice/src/main/java/com/qa/resource/data.properties");
        prop.load(fis);

        String browserName = prop.getProperty("browser");
        System.out.println(browserName);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", prop.getProperty("firefox"));
            driver = new FirefoxDriver();

        }

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get(prop.getProperty("url"));

        return driver;
    }
}