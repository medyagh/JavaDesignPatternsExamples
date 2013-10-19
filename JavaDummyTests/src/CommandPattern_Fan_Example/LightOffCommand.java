package CommandPattern_Fan_Example;

class LightOffCommand implements Command {
	private Light myLight;

	public LightOffCommand(Light light) {
		myLight = light;
	}

	public void execute() {
		myLight.turnOff();
	}
}