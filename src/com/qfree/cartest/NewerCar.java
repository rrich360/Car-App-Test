package com.qfree.cartest;

import java.util.ArrayList;


public class NewerCar {

	 private String make;
	 private String model;
	 private int year;
	 
	 
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public NewerCar(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public String toString() {
		return "{ " + 
				"make= '"+ make +
				 '\''+ ", model= '" + model +
				 '\''+ ", year= '" + year+'}';	
	 }

	public static void showNewerCars(ArrayList<NewerCar> New) {
		// TODO Auto-generated method stub
		System.out.println("The following newer cars are listed using Stream API, Filter, and Enhanced for-each loop: ");
		System.out.println("");
		 
		//System.out.println("Using findFirst() ---");
		//NewerCar car = list.stream().filter(p -> p.getYear() > 2016)
				//.findFirst().orElse(null);
		//System.out.println(NewerCar.showNewerCars(list));
		//System.out.println("Using forEach() ---");
		New.stream().filter(c -> c.getYear() > 2016)
				.forEach(System.out::println);
				
	}


	
	
	
	
	
	
	
	
}
