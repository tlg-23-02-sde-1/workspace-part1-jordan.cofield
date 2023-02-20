package gov.research;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[2];
        ages[0] = 31;
        ages[1] = 45;
        System.out.println(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println();

        double[] prices = {9.99, 37.49, 32.5, 49.96};
        System.out.println("prices has length: " + prices.length);
        System.out.println(Arrays.toString(prices));
        System.out.println();

        String[] names = { "Jordan", "Tiffani"};
        System.out.println(Arrays.toString(names));
        System.out.println();

        for(String name : names) {
            System.out.println(name);

        }
    }
}