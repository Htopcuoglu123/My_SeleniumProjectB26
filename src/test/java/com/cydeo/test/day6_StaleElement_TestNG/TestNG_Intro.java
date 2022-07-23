package com.cydeo.test.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass // will be running before all test(One per class)
    public void setUp(){
        System.out.println("Before class is running");
    }
    @AfterClass// will be running after all test _One per class)
    public void tearDown(){
        System.out.println("After class is running");
    }
    @BeforeMethod//will be running before each test method
    public static void setUpMethod(){
        System.out.println("Before method is running");
    }

    @AfterMethod //will be running after each test method
    public static void tearDownMethod(){
        System.out.println("After method is running");
    }


    @Test(priority = 2)
    public void test1(){
        System.out.println("Test 1 is running...");
        String actual="apple";
        String expected="apple";

        //assertEquals(actual,expected,"message")
        //message is optional, and it will appear only when the test fails
        Assert.assertEquals(actual,expected,"Test1 failed!");
    }

    @Test(priority = 1,dependsOnMethods = "test1")
    public void test2(){
        System.out.println("Test 2 is running...");
        Assert.assertEquals("orange","orange","Test 2 failed!");
    }



}
