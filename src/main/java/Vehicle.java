public abstract class Vehicle {

    private String type;
    private int vehiclehealth;

    public Vehicle(String type, int vehiclehealth){
        this.type = type;
        this.vehiclehealth = vehiclehealth;
    }

    public String getType(){
        return this.type;
    }

    public int getHealthValue(){
        return this.vehiclehealth;
    }

}
