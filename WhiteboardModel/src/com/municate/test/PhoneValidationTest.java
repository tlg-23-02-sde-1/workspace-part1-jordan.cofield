package com.municate.test;

import com.municate.Phone;

/**
 *
 *
 */
class PhoneValidationTest {

    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.setBatteryPercentage(84);
        System.out.println(p1);

        p1.setBatteryPercentage(100);
        System.out.println(p1);

        p1.setBatteryPercentage(-1);
        System.out.println(p1);

        p1.setBrand(p1.brand + "iPhone");
        System.out.println(p1);
    }
}