package com.codecool.speedlimitfinecalculator.ui;

import com.codecool.speedlimitfinecalculator.model.RoadType;
import com.codecool.speedlimitfinecalculator.model.VehicleType;
import com.codecool.speedlimitfinecalculator.service.SpeedLimitFineCalculator;

import java.util.Scanner;

public class FineCalculatorUi {
    private final SpeedLimitFineCalculator speedLimitFineCalculator;

    public FineCalculatorUi(SpeedLimitFineCalculator speedLimitFineCalculator) {
        this.speedLimitFineCalculator = speedLimitFineCalculator;
    }

    public void run() {
        greetUser();

        VehicleType vehicleTypeEnum = selectVehicleType();
        RoadType roadTypeEnum = selectRoadType();
        int speed = getSpeed();

        double fine = 0;

        if (fine == 0) {
            System.out.println("You are within speed limits! No fine applies.");
        } else {
            System.out.println("Your fine is " + fine + " CodeCoins :(");
        }
    }

    private static VehicleType selectVehicleType() {
        // Implement this method
        return null;
    }

    private static RoadType selectRoadType() {
        // Implement this method
        return null;
    }

    private int getSpeed() {
        // Implement this method
        return 0;
    }

    private static void greetUser() {
        System.out.println(
                "Hi! You were on the road again, but you were a bit too fast, weren't you? No worries, let's see how much it will cost you!");
    }
}

