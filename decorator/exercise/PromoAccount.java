package decorator.exercise;

public class PromoAccount extends Decorator {

	private boolean winner;

	public boolean getWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	public PromoAccount(Account winner) {
		super(winner);
	}

	public void operation(BasicAccount basicAccount) {
		super.operation(basicAccount);
		raffle(basicAccount);
		if (winner) {
			System.out.println("Congratulations! " + basicAccount.getOwner() + " you just dubbed your balance.");
			basicAccount.setAmount(basicAccount.getAmount() * 2);
			System.out.println("Your current balance is " + basicAccount.getAmount() + " dollars.");
			setWinner(false);
		} else {
			System.out.println("Sorry, good luck next time.");
		}
	}

	private void raffle(BasicAccount basicAccount) {
		int chance = (int) (Math.random() * 5 + 1);
		if (chance % 2 == 0) {
			this.setWinner(true);
			basicAccount.setAmount(basicAccount.getAmount() * 2);
		}
	}

}