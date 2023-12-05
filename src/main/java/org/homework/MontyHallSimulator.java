package org.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MontyHallSimulator {
    private static final Random rand = new Random();

    private int car;
    private int choice;

    public MontyHallSimulator() {
        this.car = pick();
        this.choice = pick();
    }

    private void play(boolean changeMind) {
        if (changeMind) {
            choice = change(car, choice);
        }
    }

    private boolean isWin() {
        return car == choice;
    }

    private int pick() {
        return rand.nextInt(3) + 1;
    }

    private int change(int car, int choice) {
        if (car == choice) {
            if (choice == 1) {
                return rand.nextInt(2) + 2;
            } else if (choice == 2) {
                return rand.nextInt(2) * 2 + 1;
            } else {
                return rand.nextInt(2) + 1;
            }
        } else {
            return car;
        }
    }

    public Map<Integer, Boolean> simulate(int totalTimes, boolean changeMind) {
        Map<Integer, Boolean> results = new HashMap<>();

        for (int i = 0; i < totalTimes; i++) {
            MontyHallSimulator game = new MontyHallSimulator();
            game.play(changeMind);
            results.put(i + 1, game.isWin());
        }

        return results;
    }
}
