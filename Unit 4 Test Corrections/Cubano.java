
public class Cubano extends Sandwich {
	Topping ham = new Ham();
	Topping mustard = new Mustard();
	Topping pickles = new Pickles();
	Topping roastPork = new RoastPork();
	Topping swissCheese = new SwissCheese();

	public Cubano() {
		super();
		toppings.add(ham);
		toppings.add(mustard);
		toppings.add(pickles);
		toppings.add(roastPork);
		toppings.add(swissCheese);
	}
}
