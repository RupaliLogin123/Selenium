package com.thetestingacademy;


import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class TestSeleium01 {

        @Test
        public void test_openVWOLoginPage()
    {
            EdgeDriver edgeDriver = new EdgeDriver();
            edgeDriver.get("https://app.vwo.com");
            System.out.println(edgeDriver.getTitle());


    }
//1) mouse hover on testng annotation
//2) click on add maven dependency
//3) select search for artifact iD and add this --> org.testng:testng
}
