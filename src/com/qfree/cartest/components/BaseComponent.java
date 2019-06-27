package com.qfree.cartest.components;

import com.qfree.cartest.actions.CarCommands;

//can NOT instantiate abstract class
public abstract class BaseComponent implements IComponent {
	
		
	BaseComponent(CarCommands command) {
	}
	
	//start() is initialized at off position
	protected boolean started = false ;
	

	//use accept() to print message for turn_on enum
	protected boolean start() {
		return started = true;
		  
	}
	
	//use accept() to print message for turn_off enum 
	protected boolean stop() {
		return started = false;
	}
	
	//use boolean expression for enum constants
	protected boolean isStarted() {
		return started;
	}
	@Override
	public void accept(CarCommands command) {
	}
	
}