package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass
{
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public void beforeTests() {
        ChromeOptions options = new ChromeOptions();

       // options.addArguments("--incognito");
        options.setHeadless(true);


        driver= WebDriverManager.chromedriver().capabilities(options).create();

        //wait = new WebDriverWait(driver, 2);
        driver.manage().window().maximize();
    }

    public void afterTests() {
        driver.quit();
    }
}
