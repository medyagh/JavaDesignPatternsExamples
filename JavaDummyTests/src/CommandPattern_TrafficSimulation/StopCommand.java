package CommandPattern_TrafficSimulation;

class StopCommand implements Command {
	private Vehicle receiverVehicle;

	public StopCommand(Vehicle vehicle) {
		receiverVehicle = vehicle;
	}

	public void execute() {
		receiverVehicle.stop();
	}
}