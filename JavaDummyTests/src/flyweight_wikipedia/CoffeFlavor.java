package flyweight_wikipedia;

import java.util.HashMap;
import java.util.Map;

// Flyweight object interface
interface CoffeeOrder {
	public void serveCoffee(CoffeeOrderContext context);
}

// ConcreteFlyweight object that creates ConcreteFlyweight
class CoffeeFlavor implements CoffeeOrder {
	private final String flavor;

	public CoffeeFlavor(String newFlavor) {
		this.flavor = newFlavor;
	}

	public String getFlavor() {
		return this.flavor;
	}

	public void serveCoffee(CoffeeOrderContext context) {
		System.out.println("Serving Coffee flavor " + flavor
				+ " to table number " + context.getTable());
	}
}

class CoffeeOrderContext {
	private final int tableNumber;

	public CoffeeOrderContext(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getTable() {
		return this.tableNumber;
	}
}

// FlyweightFactory object
class CoffeeFlavorFactory {
	private Map<String, CoffeeFlavor> flavors = new HashMap<String, CoffeeFlavor>();

	public CoffeeFlavor getCoffeeFlavor(String flavorName) {
		CoffeeFlavor flavor = flavors.get(flavorName);
		if (flavor == null) {
			flavor = new CoffeeFlavor(flavorName);
			flavors.put(flavorName, flavor);
		}
		return flavor;
	}

	public int getTotalCoffeeFlavorsMade() {
		return flavors.size();
	}
}

