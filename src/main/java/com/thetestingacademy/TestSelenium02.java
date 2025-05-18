package com.thetestingacademy;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {
    @Description("Open vwo.com and verify the title")
    @Test
    public void test_selenium()
    {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.vwo.com");
        Assert.assertEquals(driver.getCurrentUrl(),"https://vwo.com/");
        driver.quit();
    }
}
