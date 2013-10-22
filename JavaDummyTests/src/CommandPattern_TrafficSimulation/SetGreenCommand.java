package CommandPattern_TrafficSimulation;

class SetGreenCommand implements Command {
	private TrafficLight receiverTrafficLight;

	public SetGreenCommand(TrafficLight trafficLight) {
		receiverTrafficLight = trafficLight;
	}

	public void execute() {
		receiverTrafficLight.setGreen();
	}
}