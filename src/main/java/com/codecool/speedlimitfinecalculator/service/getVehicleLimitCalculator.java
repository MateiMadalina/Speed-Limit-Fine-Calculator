package com.codecool.speedlimitfinecalculator.service;

import com.codecool.speedlimitfinecalculator.model.RoadType;
import com.codecool.speedlimitfinecalculator.model.VehicleType;


public class getVehicleLimitCalculator implements VehicleLimitCalculator {
    @Override
    public int getVehicleLimitByRoadType(VehicleType vehicleType, RoadType roadType) {
        if(roadType == RoadType.Urban){
            return 50;
        } else if(roadType == RoadType.MainRoad && (vehicleType == VehicleType.Bus || vehicleType == VehicleType.Truck)){
            return 70;
        }else if(roadType == RoadType.MainRoad && vehicleType == VehicleType.Car){
            return 90;
        }else if(roadType == RoadType.Highway && vehicleType == VehicleType.Car){
            return 130;
        }else if(roadType == RoadType.Highway && vehicleType == VehicleType.Bus){
            return 100;
        }else if(roadType == RoadType.Highway && vehicleType == VehicleType.Truck){
            return 80;
        }else {
            return 0;
        }
    }
}
