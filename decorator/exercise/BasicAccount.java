package decorator.exercise;

public class BasicAccount implements Account {

	public int amount;
	public String owner;

	public BasicAccount(int amount, String owner) {
		this.amount = amount;
		this.owner = owner;
	}

	public int getAmount() {
		if (amount <= 0) {
			return 0;
		}
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void operation(BasicAccount basicAccount) {
		System.out.println(
				"The owner of this account is " + owner + " and the current balance is " + amount + " dollars.");
	}

}