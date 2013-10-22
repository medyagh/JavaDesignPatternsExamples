package CommandPattern_TrafficSimulation;

import java.util.ArrayList;

class SimProcessor {
	private ArrayList<Command> queuedCommands;

	public SimProcessor() {
		queuedCommands = new ArrayList<Command>();
	}

	public void addCommand(Command command) {
		// Add the Command to the queue
		queuedCommands.add(command);
	}

	public void processNextCommand() {
		// Execute the next Command object – if
		// there is one.
		if (queuedCommands.size() == 0)
			return;
		Command nextOne = queuedCommands.remove(0);
		nextOne.execute();
	}
}