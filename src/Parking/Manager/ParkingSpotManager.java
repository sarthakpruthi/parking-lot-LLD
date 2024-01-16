package Parking.Manager;

import Parking.ParkingStrategy.ParkingStrategy;
import Parking.Spot.ParkingSpot;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;
    ParkingStrategy parkingStrategy;
    public ParkingSpotManager(List<ParkingSpot> list, ParkingStrategy parkingStrategy){
        this.parkingSpots = list;
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSpot findParkingSpot(){
        return null;
    }

    void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
    }

    void removeParkingSpot(ParkingSpot parkingSpot){
        parkingSpots.remove(parkingSpot);
    }
}
