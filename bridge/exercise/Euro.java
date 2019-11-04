package bridge.exercise;

public class Euro implements ICurrency {

	@Override
	public void currency(int amount) {
		System.out.println(amount * 9 + " euros.");
	}

}