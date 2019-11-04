package visitor.exercise;

public class Client {

	public static void main(String[] args) {

		Dog dog = new Dog(false, true, 10);
		Cat cat = new Cat(false, false, 25);
		Horse horse = new Horse(true, true, 50);
		Vet vet = new Vet();

		System.out.println("Dog results' are: ");
		System.out.println(dog.care(vet));
		System.out.println("Cat results' are: ");
		System.out.println(cat.care(vet));
		System.out.println("Horse results' are: ");
		System.out.println(horse.care(vet));

	}

}