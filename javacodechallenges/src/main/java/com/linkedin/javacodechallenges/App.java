package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        int ccfUsed = (int) Math.ceil(gallonsUsage / 748);
        double price = 18.84;
        if (ccfUsed > 2) {
            price += (ccfUsed - 2) * 3.9;
        }
        return price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
