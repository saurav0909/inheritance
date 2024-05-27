package model;

public class GasolineCar extends Car{
	
	private int fuelCapacity;
	private int mpg;
	
	public GasolineCar(String color, String make, String model, int year, int numDoors, String transmissionType,
			int fuelCapacity, int mpg) {
		super(color, make, model, year, numDoors, transmissionType);
		this.fuelCapacity = fuelCapacity;
		this.mpg = mpg;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public int getMpg() {
		return mpg;
	}
	
	@Override
	public void displayDetails() {
	        System.out.println("Gasoline Car Details:");
	        System.out.println("Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear());
	        System.out.println("Color: " + getColor() + ", Doors: " + getNumDoors() + ", Transmission: " + getTransmissionType());
	        System.out.println("Fuel Capacity: " + getFuelCapacity() + " Liter, MPG: " + getMpg());
	}

}
