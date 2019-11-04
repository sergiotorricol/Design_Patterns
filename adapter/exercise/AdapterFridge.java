package adapter.exercise;

public class AdapterFridge implements IBusiness1 {

	Fridge fridge;

	public AdapterFridge(Fridge fridge) {
		this.fridge = fridge;
	}

	@Override
	public int price() {
		return this.fridge.cost();
	}

	@Override
	public int lifetime() {
		return fridge.warranty();
	}

}
