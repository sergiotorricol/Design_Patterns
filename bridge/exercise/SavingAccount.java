package bridge.exercise;

public class SavingAccount implements IAccount {

	private ICurrency currency;
	private int amount = 100;

	public SavingAccount(ICurrency currency) {
		this.currency = currency;
	}

	@Override
	public void rate() {
		System.out.print("Saving account balance: ");
		currency.currency((2 * amount / 100) + amount);
	}

}