package bridge.exercise;

public class Bolivian implements ICurrency {

	@Override
	public void currency(int amount) {
		System.out.println(amount + " bolivians.");
	}

}