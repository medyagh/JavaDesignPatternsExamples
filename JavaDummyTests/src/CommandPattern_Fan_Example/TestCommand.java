package CommandPattern_Fan_Example;

public class TestCommand {
	public static void main(String[] args) {
		Light testLight = new Light();
		LightOnCommand lOn = new LightOnCommand(testLight);
		LightOffCommand lOff = new LightOffCommand(testLight);
		SwitchThing testSwitch = new SwitchThing(lOn, lOff); // Takes 2 “Command” objects
		testSwitch.flipUp();
		testSwitch.flipDown();
		// ////////////
		Fan testFan = new Fan();
		FanOnCommand fOn = new FanOnCommand(testFan);
		FanOffCommand fOff = new FanOffCommand(testFan);
		testSwitch = new SwitchThing(fOn, fOff); // Takes 2 “Command” objects
		testSwitch.flipUp();
		testSwitch.flipDown();
	}
}