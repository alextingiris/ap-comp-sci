
public class Cubano extends Sandwich {
	Topping ham = new Ham();
	Topping mustard = new Mustard();
	Topping pickles = new Pickles();
	Topping roastPork = new RoastPork();
	Topping swissCheese = new SwissCheese();

	public Cubano() {
		super();
		super.Sandwich(ham);
		super.Sandwich(mustard);
		super.Sandwich(pickles);
		super.Sandwich(roastPork);
		super.Sandwich(swissCheese);
	}
}
