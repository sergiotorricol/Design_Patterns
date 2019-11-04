package decorator.exercise;

public class Decorator implements Account {

	private Account account;

	public Decorator(Account account) {
		this.account = account;
	}

	public void operation(BasicAccount basicAccount) {
		account.operation(basicAccount);
	}

}