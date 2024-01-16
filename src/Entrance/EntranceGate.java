package Entrance;

import Enums.VehicleType;
import Parking.Manager.ParkingSpotManager;
import Parking.ParkingSpotFactory;
import Parking.ParkingStrategy.ParkingStrategy;
import Parking.Spot.ParkingSpot;
import Parking.Ticket;


public class EntranceGate {

    ParkingSpotManager findParkingSpot(VehicleType vehicleType){
        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();
        return parkingSpotFactory.getParkingSpotManager(vehicleType);
    }

    ParkingSpot bookSpot(Vehicle vehicle){
        ParkingSpotManager parkingSpotManager = findParkingSpot(vehicle.vehicleType);
        return parkingSpotManager.findParkingSpot();
    }
    Ticket generateTicket(Vehicle vehicle, ParkingStrategy parkingStrategy){
        ParkingSpot parkingSpot = bookSpot(vehicle);
        if(parkingSpot == null){
            System.out.println("no more space left, TATA!");
            return null;
        }
        return new Ticket(vehicle,parkingSpot);
    }

}
