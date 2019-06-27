package com.qfree.cartest.models;

import com.qfree.cartest.actions.CarActions;

public interface ICar extends CarActions 
{
	 
		
	public String make= null;
	public String model= null;
	public int year= 0;
	/**
	 * @param CarMake 
	 * @return the make of the car
	 */
	 public default String getCarMake() {
		return make;
	}
	 
	 public default void setCarMake(String make) {}
	 
	/**
	 * @param CarModel 
	 * @return the model of the car
	 */
	public default String getCarModel() {
		return model;
	}
	
	public default void setCarModel(String model) {}
	
	/**
	 * @param CarYear 
	 * @return the year the car was manufactured
	 */
	public static int getCarYear() {
		return year;
	}
	
	public default void setCarYear(int year) {
	
	}
	
	
}
	
	
	
	
	
	
	
	

	