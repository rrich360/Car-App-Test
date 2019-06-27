package com.qfree.cartest;

import java.util.ArrayList;

import java.util.function.Predicate;

import javax.swing.JOptionPane;

import com.qfree.cartest.actions.CarCommands;
import com.qfree.cartest.models.ICar;

public class CarTest {
	 
	
	
	
	public final ArrayList<ICar> carLot= new ArrayList<>();
	
	
	 
	
		
	public static void main(String[]args) {
		
			System.out.println("App started!");
		
		
		Inventory sportscar1=new Inventory(null, null, 0);
		
			sportscar1.setMake("BMW");
			sportscar1.setModel("650i");
			sportscar1.setCarYear(2017);
			
		Inventory sportscar2=new Inventory(null,null,0);
		
			sportscar2.setMake("Mercedez-Benz");
			sportscar2.setModel("CLS");
			sportscar2.setCarYear(2015);
		
		Inventory sportscar3=new Inventory(null,null,0);
		
		sportscar3.setMake("Lamborghini");
		sportscar3.setModel("Aventador");
		sportscar3.setCarYear(2018);
			
		Inventory sportscar4=new Inventory(null,null,0);
		
		sportscar4.setMake("Audi");
		sportscar4.setModel("R8");
		sportscar4.setCarYear(2012);
		
		ArrayList<Inventory> assemblyLine= new ArrayList<Inventory>();
		assemblyLine.add(sportscar1);
		assemblyLine.add(sportscar2);
		assemblyLine.add(sportscar3);
		assemblyLine.add(sportscar4);
		
			int assembly = assemblyLine.size();
			System.out.println("AssemblyLine: " + assembly);
			System.out.println(" ");
	
	Inventory.showInventory(assemblyLine);
		
		
		NewerCar newcar1 =new NewerCar(null, null, 0);
		
			newcar1.setMake("BMW");
			newcar1.setModel("650i");
			newcar1.setYear(2017);
		
		NewerCar newcar2=new NewerCar(null,null,0);
	
			newcar2.setMake("Mercedez-Benz");
			newcar2.setModel("CLS");
			newcar2.setYear(2015);
	
		NewerCar newcar3=new NewerCar(null,null,0);
	
			newcar3.setMake("Lamborghini");
			newcar3.setModel("Aventador");
			newcar3.setYear(2018);
		
		NewerCar newcar4=new NewerCar(null,null,0);
	
			newcar4.setMake("Audi");
			newcar4.setModel("R8");
			newcar4.setYear(2012);
	
		ArrayList<NewerCar> New = new ArrayList<NewerCar>();
			New.add(newcar1);
			New.add(newcar2);
			New.add(newcar3);
			New.add(newcar4);
	
		int newcars = New.size();
		System.out.println("");
		System.out.println("Cars for inventory: " + newcars);
		System.out.println(" ");
		
		NewerCar.showNewerCars(New);
						
		
		Car car1 = new Car();
		
		car1.setMake("BMW");
		car1.setModel("650i");
		car1.setYear(2017);
		car1.setEngine("4.4LTwinTurboV8");
		car1.setHeadlights("F12AdaptiveHeadlightsOEM");
		car1.setStereo("HarmonKardonLogic7Stereo");
		car1.setStarted(false);
		
		
		Car car2 = new Car();
		
		car2.setMake("Mercedes-benz");
		car2.setModel("CLS");
		car2.setYear(2015);
		car2.setEngine("3.0LBiTurboV6");
		car2.setHeadlights("MultiBeam-LED");
		car2.setStereo("W218TouchScreen");
		car2.setStarted(false);
		
		
		Car car3 = new Car();
		
		car3.setMake("Lamborghini");
		car3.setModel("Aventador");
		car3.setYear(2018);
		car3.setEngine("6.0LV12");
		car3.setHeadlights("LP770-4SVJAutoBeam-LED");
		car3.setStereo("UrusSurroundSound");
		car3.setStarted(false);
		
		
		Car car4 = new Car();
		
		car4.setMake("Audi");
		car4.setModel("R8");
		car4.setYear(2012);
		car4.setEngine("5.2LV10");
		car4.setHeadlights("LED-Audi-Laser");
		car4.setStereo("Apple-Carplay-Sat-Nav");
		car4.setStarted(false);
		
		
		ArrayList<Car> carLot= new ArrayList<Car>();
		carLot.add(car1);
		carLot.add(car2);
		carLot.add(car3);
		carLot.add(car4);
		
		int manufacturedCars = carLot.size();
		System.out.println("");
		System.out.println("ManufactoredCars: " + manufacturedCars);
		System.out.println("");
		
		Car.showCars(carLot);
		
		System.out.println("");	
		
		Car.printLotInventory(carLot);
		
		System.out.println("");
		
		
		System.out.println("The following user input for commands are examples using enums: ");
		System.out.println("");
		
		final String stopCommandFromUser = "TURN_OFF";
		final String startCommandFromUser = "TURN_ON";
			
		
		System.out.println("");	
	
			String input ="";
	
	input= JOptionPane.showInputDialog("Please enter one of the following commands "
			+ "for ALL cars in the lot: TURN_ON  TURN_OFF");
	
	if(input.equals(startCommandFromUser)) {
    
		CarCommands command = CarCommands.valueOf(startCommandFromUser);
		
		System.out.println(command.name());
		System.out.println("Are Engines started? " + command.isStarted());
		command.carMessage();
	}
		
	if(input.equals(stopCommandFromUser)) {
	    
		CarCommands command = CarCommands.valueOf(stopCommandFromUser);
		
		System.out.println(command.name());
		System.out.println("Are Engines started? " + command.isStarted());
		command.carMessage();
	}
	
	//if(!input.equals(startCommandFromUser) || !input.equals(stopCommandFromUser)){
		//JOptionPane.showInputDialog("Please enter one of the following commands "
			//	+ "for ALL cars in the lot: TURN_ON  TURN_OFF");
		//JOptionPane.showMessageDialog(null, "Not a Command! - Access Denied");
		//System.out.println("Not a Command! - Access Denied");
	//}
	
			
		/**
		 * Step 1:
		 * 
		 * Create two(2) or more car implementations and add those
		 * cars to the car lot.  After building out the lot, print the inventory
		 * of the lot utilizing Java 8 streams to include all relevant attributes 
		 * of the vehicles (make/model/year).  At least 1 of the new cars must 
		 * be model year 2016 or later
		 */
		
		
		/**
		 * Step 2:
		 * 
		 * Create a filter predicate to only print out new cars and print those cars
		 */
		
		
		/**
		 * Step 3:
		 * 
		 * - Create Engine / Headlights / Stereo components
		 * - Modify the vehicle creation to pass in instances of each component for each car 
		 * - Finish building out the turn-on/turn-off function to send a command to each component and 
		 * 	 print out a message indicating each component has turned on or off 
		 * 		e.x. "Engine has started"
		 * - Make sure to add error and exception handling if attempting to start a vehicle that's
		 *   already started or stop one that's already stopped.
		 * - Invoke the turn on and turn off method for each car in the lot, printing all
		 *   status to the console
		 * @param String 
		 */		
	}
	
	
		
	void buildCarLot() {
		
	}
	
	void printLotInventory(ArrayList<Car> Cars) {
		
	 }
	  
	  
	void printNewCars(Predicate<CarTest> predicate) {
		 		System.out.println("Newer Car List: ");
	}
		
	   
	
	void startAllCars() {
		// TODO: start all the cars in the lot
	}
	
	void stopAllCars() {
		// TODO: turn off all cars in the lot
		
	}	
	
	
	
		
}
