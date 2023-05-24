package com.codecool.speedlimitfinecalculator;


import com.codecool.speedlimitfinecalculator.service.SpeedLimitFineCalculator;
import com.codecool.speedlimitfinecalculator.service.VehicleLimitCalculator;
import com.codecool.speedlimitfinecalculator.service.logger.Logger;
import com.codecool.speedlimitfinecalculator.ui.FineCalculatorUi;
import com.codecool.speedlimitfinecalculator.ui.ConsoleLogger;
import com.codecool.speedlimitfinecalculator.service.SpeedLimitFineCalculatorImpl;
import com.codecool.speedlimitfinecalculator.service.getVehicleLimitCalculator;


public class Application {
    public static void main(String[] args) {
        VehicleLimitCalculator vehicleLimitCalculator = new getVehicleLimitCalculator();
        SpeedLimitFineCalculator speedLimitFineCalculator = new SpeedLimitFineCalculatorImpl((getVehicleLimitCalculator) vehicleLimitCalculator);
        Logger logger = new ConsoleLogger();
        FineCalculatorUi fineCalculatorUi = new FineCalculatorUi(speedLimitFineCalculator, logger);
        fineCalculatorUi.run();
    }
}

