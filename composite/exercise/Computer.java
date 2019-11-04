package composite.exercise;

public class Computer implements IComponent {

	private int price = 100;

	public Computer() {
		super();
	}

	@Override
	public Integer operation() {
		System.out.println("Computer: $100.");
		return price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void add(IComponent component) {
		System.out.println("Adding computer.");
	}

	@Override
	public void remove(IComponent component) {
		System.out.println("Deleting computer.");
	}

	@Override
	public void getChild(int position) {
		System.out.println("\t Computer.");
	}

}