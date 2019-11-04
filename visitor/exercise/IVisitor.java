package visitor.exercise;

public interface IVisitor {

	public String visit(Dog dog);

	public String visit(Cat cat);

	public String visit(Horse horse);

}