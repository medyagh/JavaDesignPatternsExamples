package CommandPattern_TrafficSimulation;

class SetRedCommand implements Command {
	private TrafficLight receiverTrafficLight;
	private int yellowInterval;

	public SetRedCommand(TrafficLight trafficLight, int interval) {
		receiverTrafficLight = trafficLight;
		yellowInterval = interval;
	}

	public void execute() {
		receiverTrafficLight.setRed(yellowInterval);
	}
}