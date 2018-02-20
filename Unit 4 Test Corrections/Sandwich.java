import java.util.ArrayList;

public class Sandwich {

	protected ArrayList<Topping> toppings;

	public Sandwich() {
		toppings = new ArrayList<Topping>();
	}

	public void addTopping(Topping t) {
		toppings.add(t);
	}

	public double getCost() {
		double cost = 0;

		for (Topping topping : toppings) {
			cost = cost + topping.getCost();
		}

		return cost;
	}

	public boolean isVegitarian() {
		for (Topping topping : toppings) {
			if (topping.isVegitarian() == false) {
				return false;
			}
		}

		return true;
	}
}
