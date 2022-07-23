package com.cydeo.test.day12_learningProperties;

import org.testng.annotations.Test;

public class LearningProperties {
    @Test
    public void java_properties_reading_test(){
            //key=value
        //os.name=will return operating system (os.name is key and Windows 10 is value)
        //user.name= will return device username (user.name is key and httop is value)
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }
}
