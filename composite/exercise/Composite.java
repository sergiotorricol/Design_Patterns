package composite.exercise;

import java.util.ArrayList;

public class Composite implements IComponent {

	private ArrayList<IComponent> componentList = new ArrayList<>();

	public Composite() {
		super();
	}

	@Override
	public Integer operation() {
		int acc = 0;
		for (IComponent component : componentList) {
			acc = acc + component.operation();
		}
		System.out.println("\t The total is $" + acc + ".");
		return acc;
	}

	@Override
	public void add(IComponent component) {
		componentList.add(component);
	}

	@Override
	public void remove(IComponent component) {
		componentList.remove(component);
	}

	@Override
	public void getChild(int position) {
		System.out.println(componentList.get(position));
	}

}