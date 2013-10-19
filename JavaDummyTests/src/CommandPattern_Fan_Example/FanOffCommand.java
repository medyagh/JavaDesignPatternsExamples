package CommandPattern_Fan_Example;

class FanOffCommand implements Command {
	private Fan myFan;

	public FanOffCommand(Fan fan) {
		myFan = fan;
	}

	public void execute() {
		myFan.stopRotate();
	}
}