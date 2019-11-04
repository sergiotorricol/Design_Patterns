package adapter.exercise;

public class AdapterWashingMachine implements IBusiness1 {

	WashingMachine washingMachine;

	public AdapterWashingMachine(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
	}

	@Override
	public int price() {
		return this.washingMachine.cost();
	}

	@Override
	public int lifetime() {
		return washingMachine.warranty();
	}

}