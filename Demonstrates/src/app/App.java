package app;

import model.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectricCar myCar=new ElectricCar("White", "Tata", "Nexon", 2023, 4, "Automatic", 100, 400);
		Truck myTruck=new Truck("Red", "Ford", "F-150", 2020, "Large", 13000);
		GasolineCar myGasolineCar=new GasolineCar("Black", "Tata", "Thar", 2020, 4, "Ghear", 16, 30);
		
		myCar.displayDetails();
		myTruck.displayDetails();
		myGasolineCar.displayDetails();

	}

}
