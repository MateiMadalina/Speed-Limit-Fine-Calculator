package com.codecool.speedlimitfinecalculator;


import com.codecool.speedlimitfinecalculator.service.SpeedLimitFineCalculator;
import com.codecool.speedlimitfinecalculator.service.VehicleLimitCalculator;
import com.codecool.speedlimitfinecalculator.ui.FineCalculatorUi;

public class Application {
    public static void main(String[] args) {
        VehicleLimitCalculator vehicleLimitCalculator = null;
        SpeedLimitFineCalculator speedLimitFineCalculator = null;
        FineCalculatorUi fineCalculatorUi = new FineCalculatorUi(speedLimitFineCalculator);
        fineCalculatorUi.run();
    }
}

