package com.codecool.speedlimitfinecalculator.service;

import com.codecool.speedlimitfinecalculator.model.RoadType;
import com.codecool.speedlimitfinecalculator.model.VehicleType;


public class SpeedLimitFineCalculatorImpl implements SpeedLimitFineCalculator {

    private getVehicleLimitCalculator speedLimit;


    public SpeedLimitFineCalculatorImpl(getVehicleLimitCalculator speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public double calculateSpeedLimitFine(VehicleType vehicleType, RoadType roadType, double actualSpeed) {
        int vehicleLimit = speedLimit.getVehicleLimitByRoadType(vehicleType,roadType);
        double fine = 0;

        if (actualSpeed > vehicleLimit) {
            double speedDifference = actualSpeed - vehicleLimit;

            if (speedDifference >= 10) {
                fine = 50 + (speedDifference - 10) * 10;
            }
        }

        return fine;
    }
}
