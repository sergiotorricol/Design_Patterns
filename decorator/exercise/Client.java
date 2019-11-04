package decorator.exercise;

public class Client {

	public static void main(String[] args) {

		BasicAccount basicAccount = new BasicAccount(1000, "Sergio");

		Account account = basicAccount;

		account = new InternetBank(account);
		account = new PromoAccount(account);
		account = new InsuranceAccount(account);

		account.operation(basicAccount);

	}

}