package adapter.exercise;

public class Fridge implements IBusiness2 {

	private int lifetime = 20;
	private int price = 500;

	@Override
	public int cost() {
		System.out.println("The fridge is Bs." + price + ".");
		return price;
	}

	@Override
	public int warranty() {
		System.out.println("The fridge's warranty covers " + lifetime + " years.");
		return lifetime;
	}

}