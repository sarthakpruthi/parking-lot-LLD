package Parking;

import Enums.VehicleType;
import Parking.Manager.FourWheelerSpotManager;
import Parking.Manager.ParkingSpotManager;
import Parking.Manager.TwoWheelerSpotManager;

import java.util.List;

import static Enums.VehicleType.FOUR_WHEELER;
import static Enums.VehicleType.TWO_WHEELER;

public class ParkingSpotFactory {

    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){
        ParkingSpotManager parkingSpotManager = null;

        if(vehicleType.equals(TWO_WHEELER)){
            parkingSpotManager = new TwoWheelerSpotManager(List.of(),null);
        }
        else if(vehicleType.equals(FOUR_WHEELER)){
            parkingSpotManager = new FourWheelerSpotManager(List.of(),null);
        }

        return parkingSpotManager;
    }
}
