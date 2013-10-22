package CommandPattern_TrafficSimulation;

class Vehicle {
	public void move(double x, double y, double speed) {
		// Set the destination to point (x,y)
		// …and travel there at speed “speed”.
	}

	public void changeSpeed(double newSpeed) {
		// Change the speed of the vehicle to “newSpeed”
	}

	public void stop() {
		// Set the destination to the current location,
		// set the speed to zero.
	}
}

