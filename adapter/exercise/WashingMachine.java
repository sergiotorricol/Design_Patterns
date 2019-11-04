package adapter.exercise;

public class WashingMachine implements IBusiness2 {

	private int lifetime = 10;
	private int price = 100;

	@Override
	public int cost() {
		System.out.println("The washing machine is Bs." + price + ".");
		return price;
	}

	@Override
	public int warranty() {
		System.out.println("The washing machine's warranty covers " + lifetime + " years.");
		return lifetime;
	}

}