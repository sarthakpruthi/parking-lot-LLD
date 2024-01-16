package Parking.Manager;

import Parking.ParkingStrategy.ParkingStrategy;
import Parking.Spot.ParkingSpot;

import java.util.List;

public class FourWheelerSpotManager extends ParkingSpotManager {
    public FourWheelerSpotManager(List<ParkingSpot> list, ParkingStrategy parkingStrategy) {
        super(list, parkingStrategy);
    }
}
