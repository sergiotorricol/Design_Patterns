package bridge.exercise;

public class CreditAccount implements IAccount {

	private ICurrency currency;
	private int amount = 100;

	public CreditAccount(ICurrency currency) {
		this.currency = currency;
	}

	@Override
	public void rate() {
		System.out.print("Credit account balance: ");
		currency.currency(amount);
	}

}