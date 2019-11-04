package decorator.exercise;

public class InternetBank extends Decorator {

	private boolean internet;

	public InternetBank(Account account) {
		super(account);
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public void operation(BasicAccount basicAccount) {
		super.operation(basicAccount);
		checkAvailability(basicAccount);
		if (internet) {
			System.out.println(basicAccount.getOwner() + ", you were selected for an online account.");
		} else {
			System.out.println(basicAccount.getOwner() + ", youn can't get access to an online account.");
		}
	}

	private void checkAvailability(BasicAccount basicAccount) {
		if (basicAccount.getAmount() >= 5000) {
			this.setInternet(true);
		} else {
			this.setInternet(false);
		}
	}

}