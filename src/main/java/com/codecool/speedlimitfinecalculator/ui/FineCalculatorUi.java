package com.codecool.speedlimitfinecalculator.ui;

import com.codecool.speedlimitfinecalculator.model.RoadType;
import com.codecool.speedlimitfinecalculator.model.VehicleType;
import com.codecool.speedlimitfinecalculator.service.SpeedLimitFineCalculator;
import com.codecool.speedlimitfinecalculator.service.logger.Logger;

import java.util.Scanner;

public class FineCalculatorUi{
    private final SpeedLimitFineCalculator speedLimitFineCalculator;
    private final Logger logger;

    public FineCalculatorUi(SpeedLimitFineCalculator speedLimitFineCalculator, Logger logger) {
        this.speedLimitFineCalculator = speedLimitFineCalculator;
        this.logger = logger;
    }

    public void run() {
        greetUser();

        VehicleType vehicleTypeEnum = selectVehicleType();
        RoadType roadTypeEnum = selectRoadType();

        int speed = getSpeed();

        double fine = speedLimitFineCalculator.calculateSpeedLimitFine(vehicleTypeEnum,roadTypeEnum, speed);

        if (fine == 0) {
            logger.logInfo("You are within speed limits! No fine applies.");
        } else {
            logger.logInfo("Your fine is " + fine + " CodeCoins :( ");
        }
    }

    private  VehicleType selectVehicleType() {
        logger.logInfo("Enter the type of vehicle you want to check between car, bus, and truck: ");
        Scanner scanner = new Scanner(System.in);
        String typeCar = scanner.next();
        if (typeCar.equals("car")) {
            return VehicleType.Car;
        } else if (typeCar.equals("bus")) {
            return VehicleType.Bus;
        } else if (typeCar.equals("truck")) {
            return VehicleType.Truck;
        } else {
            return null;
        }
    }

    private RoadType selectRoadType() {
        logger.logInfo("Enter the type of road you want to check between urban, mainRoad, and highway: ");
        Scanner scanner = new Scanner(System.in);
        String typeRoad = scanner.next();
        if (typeRoad.equals("urban")) {
            return RoadType.Urban;
        } else if (typeRoad.equals("mainRoad")) {
            return RoadType.MainRoad;
        } else if (typeRoad.equals("highway")) {
            return RoadType.Highway;
        } else {
            return null;
        }
    }


    private int getSpeed() {
        logger.logInfo("What is the speed with which the car traveled? Enter an integer value:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void greetUser() {
        logger.logInfo("Hi! You were on the road again, but you were a bit too fast, weren't you? No worries, let's see how much it will cost you!");
    }
}

