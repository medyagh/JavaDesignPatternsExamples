package CommandPattern_TrafficSimulation;

class FlashRedCommand implements Command {
	private TrafficLight receiverTrafficLight;

	public FlashRedCommand(TrafficLight trafficLight) {
		receiverTrafficLight = trafficLight;
	}

	public void execute() {
		receiverTrafficLight.flashRed();
	}
}