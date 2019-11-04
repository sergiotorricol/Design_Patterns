package adapter.exercise;

public class Tablet implements IBusiness1 {

	private int lifetime = 2;
	private int price = 50;

	@Override
	public int price() {
		System.out.println("The tablet is Bs." + price + ".");
		return price;
	}

	@Override
	public int lifetime() {
		System.out.println("The tablet's warranty covers " + lifetime + " years.");
		return lifetime;
	}

}