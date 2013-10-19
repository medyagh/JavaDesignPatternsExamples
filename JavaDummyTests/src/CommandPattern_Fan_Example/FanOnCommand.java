package CommandPattern_Fan_Example;

class FanOnCommand implements Command {
	private Fan myFan;

	public FanOnCommand(Fan fan) {
		myFan = fan;
	}

	public void execute() {
		myFan.startRotate();
	}
}