package Parking.Spot;

import Entrance.Vehicle;

import java.util.UUID;

public class ParkingSpot {

    String id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    public ParkingSpot(int price){
        this.id = UUID.randomUUID().toString();
        this.isEmpty = false;
        this.price = price;
    }

    void parkVehicle(Vehicle vehicle){
        isEmpty = true;
        this.vehicle = vehicle;
    }

    void removeVehicle(){
        isEmpty = false;
        this.vehicle = null;
    }
}
