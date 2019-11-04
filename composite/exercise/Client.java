package composite.exercise;

public class Client {

	public static void main(String[] args) {

		Composite computer = new Composite();
		computer.add(new Computer());
		computer.add(new Computer());

		Composite laboratory1 = new Composite();
		Composite laboratory2 = new Composite();

		laboratory1.add(computer);
		laboratory1.add(computer);
		laboratory1.add(computer);
		laboratory1.add(computer);
		laboratory2.add(computer);
		laboratory2.add(computer);

		Composite contenedor = new Composite();

		contenedor.add(laboratory2);
		contenedor.add(laboratory1);
		contenedor.operation();

	}

}