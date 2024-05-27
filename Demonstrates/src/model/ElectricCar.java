package model;

public class ElectricCar extends Car {
	
	private int batteryCapacity;
	private int range;
	
	public ElectricCar(String color, String make, String model, int year, int numDoors, String transmissionType,
			int batteryCapacity, int range) {
		super(color, make, model, year, numDoors, transmissionType);
		this.batteryCapacity = batteryCapacity;
		this.range = range;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public int getRange() {
		return range;
	}

	@Override
    public void displayDetails() {
        System.out.println("Electric Car Details:");
        System.out.println("Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear());
        System.out.println("Color: " + getColor() + ", Doors: " + getNumDoors() + ", Transmission: " + getTransmissionType());
        System.out.println("Battery Capacity: " + getBatteryCapacity() + " kWh, Range: " + getRange() + " miles");
    }

}
