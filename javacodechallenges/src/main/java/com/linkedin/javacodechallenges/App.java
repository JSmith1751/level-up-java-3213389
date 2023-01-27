package com.linkedin.javacodechallenges;

import java.util.List;

public class App {
    public static double calculateAverageChangeInvested(List<Double> purchases) {
        Double invested = 0.0;
        for (Double p : purchases) {
            invested += Math.ceil(p) - p;
        }
        return purchases.size() == 0 ? 0 : invested / purchases.size();
    }

    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        System.out.println(calculateAverageChangeInvested(purchases));
    }
}
