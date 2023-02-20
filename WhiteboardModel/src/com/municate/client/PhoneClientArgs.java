package com.municate.client;

import com.municate.Phone;

import java.util.Arrays;

class PhoneClientArgs {
    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {

            // TODO : enhance the usage notes (and don't hardcode everything)
            // 1. Supported brands are iPhone, Samsung, Google Pixel 7
            // 2. Battery must be between 0 and 100 (inclusive)
            // 3. Supported displays are About, Home, Settings, Apps

            String usage = "Usage: java PhoneClientArgs <displayMode> <brand> <batteryPercentage>";
            String example = "Example: java PhoneClientArgs Home iPhone 59";

            String note1 = "Supported brands are: " + Arrays.toString(Phone.VALID_BRANDS);
            String note2 = String.format("Battery Percentage must be between %s and %s",
                    Phone.MIN_BATTERYPERCENTAGE, Phone.MAX_BATTERYPERCENTAGE);
            String note3 = String.format("Supported displays are: %s");

            System.out.println(usage + "\n" + example + "\n" + note1 + "\n" + note2 + "\n" + note3);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        // first, convert any string inputs to proper types
        String brand = args[0];
        int battery = Integer.parseInt(args[1]);
        String[] display = new String [2];

        // now, create an instance of Phone from these (converted) inputs
        Phone tv = new Phone(brand);

        System.out.println("Congratulations on your order!");
        System.out.println("Your new phone is on its way!");
        System.out.println(tv); // toString() automatically called
    }
}