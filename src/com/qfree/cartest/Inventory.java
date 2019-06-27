package com.qfree.cartest;

import java.util.ArrayList;

import java.util.stream.Stream;


public class Inventory {

	
	 private String make;
	 private String model;
	 private int year;
	 
	 protected Inventory(String make, String model, int year) {}
	 
	 
	 
	public static void showInventory(ArrayList<Inventory> assemblyLine) {
			// TODO Auto-generated method stub
				System.out.println("Types of cars for assembling are displayed using Stream API: ");
					System.out.println("");
					Stream<ArrayList<Inventory>> stream = Stream.of(assemblyLine);
							stream.forEach(System.out::println);
			
			}
	 
	
		 
		//Predicate<? super ICar> carLot = c -> ICar.getCarYear() >= 2016;
		 		//System.out.println("Newer Car List: ");
				// carLot.stream().filter(carLot).forEach(System.out::println);
	 
	 
	 		 
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCarYear() {
		return year;
	}
	public void setCarYear(int year) {
		this.year = year;
	}
	
	
	public String toString() {
		return "{ " + 
				"make= '"+ make +
				 '\''+ ", model= '" + model +
				 '\''+ ", year= '" + year+'}';	
	 }



	




	
	
}
