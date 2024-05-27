package model;

public class Car extends Vehicle{
	
	private int numDoors;
	private String transmissionType;
	
	public Car(String color, String make, String model, int year, int numDoors, String transmissionType) {
		super(color, make, model, year);
		this.numDoors = numDoors;
		this.transmissionType = transmissionType;
	}
	
	public int getNumDoors() {
        return numDoors;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear());
        System.out.println("Color: " + getColor() + ", Doors: " + getNumDoors() + ", Transmission: " + getTransmissionType());
    }
	
	

}
