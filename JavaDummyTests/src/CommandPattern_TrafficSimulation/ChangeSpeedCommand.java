package CommandPattern_TrafficSimulation;

class ChangeSpeedCommand implements Command {
	private Vehicle receiverVehicle;
	private double speed;

	public ChangeSpeedCommand(Vehicle vehicle, double speedIn) {
		receiverVehicle = vehicle;
		speed = speedIn;
	}

	public void execute() {
		receiverVehicle.changeSpeed(speed);
	}
}