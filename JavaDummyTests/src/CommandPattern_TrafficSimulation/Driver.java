package CommandPattern_TrafficSimulation;

class Driver {
	// This is a sample driver to show how this
	// would all work…
	public static void main(String args[]) throws InterruptedException {
		boolean running = true;
		// Here I would create the various entity objects
		// but that code is skipped here due to space…
		SimProcessor simProcessor = new SimProcessor();
		// Now, execute the following loop until some
		// termination signal is received.
		// Assume that commands are being added to the
		// SimProcessor’s command queue by other parts of
		// the application – like from a GUI perhaps…
		while (running) {
			simProcessor.processNextCommand();
			
			Thread.sleep(1);
			System.out.print("-");
		}
		// Note this command processing loop knows nothing
		// of the various entityes involved…
	}
}