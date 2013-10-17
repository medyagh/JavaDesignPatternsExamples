// Aggregation
package Composition_Aggrigation_Difference;

final class Car2 {

	private Engine engine;

	void setEngine(Engine engine) {
		this.engine = engine;
	}

	void move() {
		if (engine != null)
			engine.work();
	}
}
