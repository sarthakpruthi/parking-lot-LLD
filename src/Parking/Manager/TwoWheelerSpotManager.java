package Parking.Manager;

import Parking.ParkingStrategy.ParkingStrategy;
import Parking.Spot.ParkingSpot;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager{
    public TwoWheelerSpotManager(List<ParkingSpot> list, ParkingStrategy parkingStrategy) {
        super(list, parkingStrategy);
    }
}
