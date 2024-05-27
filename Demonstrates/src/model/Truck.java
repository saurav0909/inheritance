package model;

public class Truck extends Vehicle{
	
	private String bedSize;
	private int towingCapacity;
	
	public Truck(String color, String make, String model, int year, String bedSize, int towingCapacity) {
		super(color, make, model, year);
		this.bedSize = bedSize;
		this.towingCapacity = towingCapacity;
	}

	public int getTowingCapacity() {
		return towingCapacity;
	}
	
	public String getBedSize() {
		return bedSize;
	}

	
	@Override
    public void displayDetails() {
        System.out.println("Truck Details:");
        System.out.println("Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear());
        System.out.println("Color: " + getColor() + ", Bed Size: " + getBedSize() + ", Towing Capacity: " + getTowingCapacity() + " lbs");
    }

	
	
	
	
	

}
