package com.qfree.cartest.actions;

public enum CarCommands {

	TURN_ON {
		@Override
		public boolean isStarted() {
			return started = true;
		}
		@Override
		public void carMessage() {
			System.out.println("Engines have started: Cars are ON!");
		}

	}, 
	
	TURN_OFF {
		@Override
		public boolean isStarted() {
			return started = false;
		}
		@Override
		public void carMessage() {
			System.out.println("Engines have stopped: Cars are OFF!");
		}

	}; 
		

	
	
	protected boolean started;

	public abstract boolean isStarted();
	public void carMessage() {};
	
		
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

