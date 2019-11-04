package adapter.exercise;

public class Phone implements IBusiness1 {

	private int lifetime = 5;
	private int price = 100;

	@Override
	public int price() {
		System.out.println("The phone is Bs." + price + ".");
		return price;
	}

	@Override
	public int lifetime() {
		System.out.println("The phone's warranty covers " + lifetime + " years.");
		return lifetime;
	}
	
}