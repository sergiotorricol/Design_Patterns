package adapter.exercise;

public class TV implements IBusiness2 {

	private int lifetime = 5;
	private int price = 200;

	@Override
	public int cost() {
		System.out.println("The TV is Bs." + price + ".");
		return price;
	}

	@Override
	public int warranty() {
		System.out.println("The TV's warranty covers " + lifetime + " years.");
		return lifetime;
	}

}