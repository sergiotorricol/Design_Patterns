package bridge.exercise;

public class Dollar implements ICurrency {

	@Override
	public void currency(int amount) {
		System.out.println(amount * 7 + " dollars.");
	}

}