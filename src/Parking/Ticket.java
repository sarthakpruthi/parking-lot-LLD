package Parking;

import Entrance.Vehicle;
import Parking.Spot.ParkingSpot;

import java.util.UUID;

public class Ticket {

    String id;
    long vehicleTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle,ParkingSpot parkingSpot){
        this.id = UUID.randomUUID().toString();
        this.vehicleTime = System.currentTimeMillis();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

}
