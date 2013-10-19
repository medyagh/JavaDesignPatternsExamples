package CommandPattern_Fan_Example;

class SwitchThing {
	private Command upCommand, downCommand;

	public SwitchThing(Command up, Command down) // concrete Command registers
													// with
	// the invoker
	{
		upCommand = up; // concrete Command registers itself with the invoker
		downCommand = down;
	}

	void flipUp() // calls back concrete Command, which executes the Command on
					// the receiver
	{
		upCommand.execute();
	}

	void flipDown() {
		downCommand.execute();
	}
}