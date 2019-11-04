package decorator.exercise;

public class InsuranceAccount extends Decorator {

	private int disscount = 10;

	public InsuranceAccount(Account account) {
		super(account);
	}

	public void operation(BasicAccount basicAccount) {
		super.operation(basicAccount);
		System.out.println("This service will be charged with " + disscount + "% from your current balance.");
		basicAccount.setAmount(basicAccount.getAmount() - (disscount * basicAccount.getAmount() / 100));
		System.out.println("Your current balance is " + basicAccount.getAmount() + " dollars.");
	}

}