package com.municate.client;

import com.municate.Phone;

/*
 * Application "main-class" (class with a main() class).
 * Create a few instances of VacuumCleaner and give them a basic test drive
 */
class PhoneClient {

    // STARTING point for any standalone Java application
    // The application "starts here"

    public static void main(String[] args) {
        // create an instance of Phone and set its properties
        Phone p1 = new Phone();
        p1.color = "black";
        p1.bits = 64;
        p1.brand = "iPhone";
        p1.cost = "$1200";
        p1.call();

        // create a second instance of Phone and set its properties
        Phone p2 = new Phone("Samsung Galaxy 23", 50);

        // create a third instance of Phone and set its properties
        Phone p3 = new Phone("Google Pixel 7");

        // turn them all on
        p1.turnOn();
        System.out.println();
        //p2.turnOn();
        //p3.turnOn();

        //turn them all off
        p1.turnOff();
        System.out.println();
        //p2.turnOff();
        //p3.turnOff();
    }
}