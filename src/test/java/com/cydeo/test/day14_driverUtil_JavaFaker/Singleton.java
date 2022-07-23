package com.cydeo.test.day14_driverUtil_JavaFaker;

public class Singleton {
    private Singleton(){

    }
    private static String word;//word is null when you call first time since we did not assign any value yet

    public static String getWord(){
        //word is null because we did not assign any value to it yet
        if(word==null){
            System.out.println("First time calling. Word object is null");
            word="something";
        }else{
            System.out.println("Word is already assigned and has value");
        }
        return word;
    }
}
