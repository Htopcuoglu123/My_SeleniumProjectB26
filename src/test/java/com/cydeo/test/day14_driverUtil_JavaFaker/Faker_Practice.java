package com.cydeo.test.day14_driverUtil_JavaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Faker_Practice {
    @Test
    public void fakerTest(){
        Faker faker=new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().streetAddress() = " + faker.address().streetAddress());
        System.out.println("faker.address().cityName() = " + faker.address().cityName());
        System.out.println("faker.address().state() = " + faker.address().state());
        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());
        System.out.println("faker.number().numberBetween(1000,3000) = " + faker.number().numberBetween(1000, 3000));
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.letterify(\"??????\") = " + faker.letterify("??????"));
        System.out.println("faker.numerify(\"413-###-####\") = " + faker.numerify("413-###-####"));
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard().replace(\"-\",\"\") = " + faker.finance().creditCard().replace("-", ""));
        System.out.println("faker.bothify(\"##?#???##-#?-##-??\") = " + faker.bothify("##?#???##-#?-##-??"));
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\",\"Nadir\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Nadir"));
    }
}
