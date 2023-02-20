package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Application "main-class" (class with a main() class).
 * We'll create a few instances of Television and give them a basic test drive
 */
public class TelevisionClient {

    // STARTING point for any standalone Java application
    // The application "starts here"
    public static void main(String[] args) {
        //create an instance of Television and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.turnOn();
        tv1.turnOff();

        // create a second instance of Television and set its properties, also
        Television tv2 = new Television("Sony", 50, DisplayType.PLASMA);

        //NOW create a third instance of Television, but this time DON'T set its properties
        Television tv3 = new Television("LG");

        // turn them all on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println(); // blank line in the output

        // turn them all off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println(); // blank line in the output

        // show toString methods
        System.out.println(tv1.toString());
        System.out.println(tv2); // toString() automatically called
        System.out.println(tv3);
    }
}