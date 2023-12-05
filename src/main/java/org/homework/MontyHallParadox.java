package org.homework;

import java.util.Map;

public class MontyHallParadox {
    public static void main(String[] args) {
        int totalTimes = 1000;
        boolean changeMind = true;
        MontyHallSimulator game = new MontyHallSimulator();

        Map<Integer, Boolean> results = game.simulate(totalTimes, changeMind);

        Statistics.displayResults(results);
    }
}