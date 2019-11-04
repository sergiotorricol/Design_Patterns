package composite.exercise;

public interface IComponent {

	public abstract Integer operation();

	public abstract void add(IComponent component);

	public abstract void remove(IComponent component);

	public abstract void getChild(int position);

}