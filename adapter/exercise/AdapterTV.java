package adapter.exercise;

public class AdapterTV implements IBusiness1 {

	TV tv;

	public AdapterTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public int price() {
		return this.tv.cost();
	}

	@Override
	public int lifetime() {
		return tv.warranty();
	}

}