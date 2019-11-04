package bridge.exercise;

public class FixedTermAccount implements IAccount {

	private ICurrency currency;
	private int amount = 100;

	public FixedTermAccount(ICurrency currency) {
		this.currency = currency;
	}

	@Override
	public void rate() {
		System.out.print("Fixed term account balance: ");
		currency.currency((5 * amount / 100) + amount);
	}

}