package adapter.exercise;

public class Computer implements IBusiness1 {

	private int lifetime = 8;
	private int price = 10000;

	@Override
	public int price() {
		System.out.println("The computer is Bs." + price + ".");
		return price;
	}

	@Override
	public int lifetime() {
		System.out.println("The computer's warranty covers " + lifetime + " years.");
		return lifetime;
	}

}