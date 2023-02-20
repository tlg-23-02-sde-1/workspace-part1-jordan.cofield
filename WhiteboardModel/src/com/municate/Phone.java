package com.municate;

import java.awt.*;
import java.util.Arrays;

/*
 * Business class to model the workings of a Phone
 * No main() method here
 */
public class Phone {
    // Class (static) VARAIBALES - shared among all instances
    public static final int MIN_BATTERYPERCENTAGE = 0;
    public static final int MAX_BATTERYPERCENTAGE = 100;
    public static final String[] VALID_BRANDS = {"iPhone", "Samsung", "Google"};

    // attributes or properties, in Java are called "fields" or "instance variables"
    public String brand;
    public String color;
    public String cost;
    public DisplayMode display; // null if we don't provide a default
    private int batteryPercentage;
    public int bits = 64; // constraint: 32, 64, 128GB (default 32)

    // constructors

    public Phone() {
        // no-op
    }

    public Phone(String brand) {
        setBrand(brand);
    }

    public Phone(String brand, int batteryPercentage) {
        this(brand);
        setBatteryPercentage(getBatteryPercentage());
    }

    public Phone(String color, String brand, String cost) {

    }

    // functions ("methods in Java) what can Phone objects DO?

    public void turnOn() {
        boolean isConnected = verifyWiFiConnection();
        System.out.println("Turning on your " + getBrand());
        System.out.println();
        System.out.println("Power on with Hello greeting");
    }

    public void turnOff() {
        System.out.println("Turning off your " + getBrand());
        System.out.println();
        System.out.println("Power off with Goodbye valediction");
    }

    public void call() {
        System.out.println(brand + "iPhone" + " Siri, call Mr. Jay Rostosky");
        System.out.println();
        System.out.println(brand + "Samsung" + "Dial 911");
        System.out.println();
        System.out.println("What's your emergency");
        System.out.println("Help! I've fallen and I can't get up!");
        System.out.println(brand + "Google Pixel 7" + "Calling...Jordan Cofield");
    }

    public String getBrand() {
        return brand;
    }

    // data constraint: must be iPhone, Samsung, Google Pixel 7
    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.println("Invalid brand" + brand + ", valid brands are:" +
                    Arrays.toString(VALID_BRANDS));
        }
    }

    // data constraint: must be iPhone, Samsung, Google Pixel 7
    private static boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equalsIgnoreCase(brand)) { // we have a match
                valid = true;
                break;
            }
        }
        return valid;
    }

    public DisplayMode getDisplay() {
        return display;
    }

    public void setDisplay(DisplayMode display) {
        this.display = display;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }
    // data constraint: must be [0-100]
    public void setBatteryPercentage(int batteryPercentage) {
        if(MIN_BATTERYPERCENTAGE <= batteryPercentage && batteryPercentage <=MAX_BATTERYPERCENTAGE);
        this.batteryPercentage = batteryPercentage;
        System.out.println("Invalid batteryPercentage: " +  batteryPercentage + ", + valid range is "
                + MIN_BATTERYPERCENTAGE + "-" + MAX_BATTERYPERCENTAGE);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }
        // boolean
        private boolean verifyWiFiConnection () {
            return true;
        }

        // toString()

    public String toString() {

        return String.format("Phone: brand=%s, type=%s, color=%s\n", getColor(), getBrand(), getCost());

    }
}