package bridge.exercise;

public class Client {

	public static void main(String[] args) {

		Bolivian bolivians = new Bolivian();
		Dollar dollar = new Dollar();
		Euro euro = new Euro();

		CreditAccount creditAccount1 = new CreditAccount(bolivians);
		CreditAccount creditAccount2 = new CreditAccount(dollar);
		CreditAccount creditAccount3 = new CreditAccount(euro);

		FixedTermAccount fixedTermAccount1 = new FixedTermAccount(bolivians);
		FixedTermAccount fixedTermAccount2 = new FixedTermAccount(dollar);
		FixedTermAccount fixedTermAccount3 = new FixedTermAccount(euro);

		SavingAccount savingAccount1 = new SavingAccount(bolivians);
		SavingAccount savingAccount2 = new SavingAccount(dollar);
		SavingAccount savingAccount3 = new SavingAccount(euro);

		creditAccount1.rate();
		creditAccount2.rate();
		creditAccount3.rate();

		fixedTermAccount1.rate();
		fixedTermAccount2.rate();
		fixedTermAccount3.rate();

		savingAccount1.rate();
		savingAccount2.rate();
		savingAccount3.rate();

	}

}