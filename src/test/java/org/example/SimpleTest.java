package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest extends BaseClass {

    @BeforeTest
    public void beforeTests(){
        super.beforeTests();
        driver.get("https://demoqa.com/");

    }

    @Test
    public void shouldOpenElementsPage(){
        HomePage home = new HomePage(driver);
        home.currentUrl();

    }

    @AfterTest
    public void tearDown(){
        afterTests();
    }
}