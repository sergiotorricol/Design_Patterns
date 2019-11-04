package adapter.exercise;

public class Client {

	public static void main(String[] args) {

		Tablet tablet = new Tablet();
		tablet.price();
		tablet.lifetime();

		Computer computer = new Computer();
		computer.price();
		computer.lifetime();

		Phone phone = new Phone();
		phone.price();
		phone.lifetime();

		WashingMachine washingMachine = new WashingMachine();
		AdapterWashingMachine adapterWashingMachine = new AdapterWashingMachine(washingMachine);
		adapterWashingMachine.price();
		adapterWashingMachine.lifetime();

		Fridge fridge = new Fridge();
		AdapterFridge adapterFridge = new AdapterFridge(fridge);
		adapterFridge.price();
		adapterFridge.lifetime();

		TV tv = new TV();
		AdapterTV adapterTV = new AdapterTV(tv);
		adapterTV.price();
		adapterTV.lifetime();

	}

}