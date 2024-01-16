package Enums;

public enum VehicleType {
    TWO_WHEELER("Two Wheeler"),FOUR_WHEELER("FOUR WHEELER");

    private String vehicleType;

    VehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public String getValue(){
        return vehicleType;
    }
}
