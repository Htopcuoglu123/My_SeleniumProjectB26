package com.cydeo.test.day14_driverUtil_JavaFaker;

import org.testng.annotations.Test;

public class SingletonPractice {
    @Test
    public void sigleton_Understanding_Test(){
       String str1=Singleton.getWord();
       System.out.println("word1 = " + str1);
        String str2=Singleton.getWord();
        System.out.println("word2 = " + str2);
    }
}
