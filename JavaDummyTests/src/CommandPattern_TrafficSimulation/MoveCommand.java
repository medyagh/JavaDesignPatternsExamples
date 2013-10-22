package CommandPattern_TrafficSimulation;

class MoveCommand implements Command {
	private Vehicle receiverVehicle;
	private double x;
	private double y;
	private double speed;

	public MoveCommand(Vehicle vehicle, double xIn, double yIn, double speedIn) {
		receiverVehicle = vehicle;
		x = xIn;
		y = yIn;
		speed = speedIn;
	}

	public void execute() {
		receiverVehicle.move(x, y, speed);
	}
}