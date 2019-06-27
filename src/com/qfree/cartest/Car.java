package com.qfree.cartest;

import java.util.ArrayList;

import java.util.stream.Stream;


public class Car {

	
	 private String make;
	 private String model;
	 private int year;
	 private boolean isStarted = false;
	 private String Engine;
	 private String Headlights;
	 private String Stereo;
	
	

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




	public String getEngine() {
		return Engine;
	}




	public void setEngine(String engine) {
		Engine = engine;
	}




	public String getHeadlights() {
		return Headlights;
	}




	public void setHeadlights(String headlights) {
		Headlights = headlights;
	}




	public String getStereo() {
		return Stereo;
	}




	public void setStereo(String stereo) {
		Stereo = stereo;
	}




public String toString() {
	return "{ " + 
			"make= '"+ make +
			 '\''+ ", model= '" + model +
			 '\''+ ", year= '" + year+
			 '\''+ ", engine= '" + Engine +
			 '\''+ ", headlights= '" + Headlights +
			 '\''+ ", stereo= '" + Stereo +
			 '\''+ ", started= '" + isStarted +'}';	
	 }




		public boolean isStarted() {
			return isStarted;
	}




	public void setStarted(boolean started) {
		this.isStarted = started;
	}




	public static void showCars(ArrayList<Car> Cars) {
	// TODO Auto-generated method stub
		
			for (Car car : Cars) {
				System.out.println(car);
		
	}
}




	public static void printLotInventory(ArrayList<Car> Cars) {
	// TODO Auto-generated method stub
		System.out.println("The following cars are listed using Stream API: ");
		System.out.println("");
	 
			Stream<ArrayList<Car>> stream =Stream.of(Cars);
					stream.forEach(System.out::println);
	}



}