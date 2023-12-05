package org.homework;

import java.util.Map;

public class Statistics {
    public static void displayResults(Map<Integer, Boolean> results) {
        int wins = 0;
        int losses = 0;

        for (boolean result : results.values()) {
            if (result) {
                wins++;
            } else {
                losses++;
            }
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
