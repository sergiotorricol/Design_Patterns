package visitor.exercise;

public class Horse implements IPet {
	private boolean infection;
	private boolean injury;
	private int pulse;

	public Horse(boolean infection, boolean injury, int pulse) {
		this.infection = infection;
		this.injury = injury;
		this.pulse = pulse;
	}

	public boolean isInfection() {
		return infection;
	}

	public void setInfection(boolean infection) {
		this.infection = infection;
	}

	public boolean isInjury() {
		return injury;
	}

	public void setInjury(boolean injury) {
		this.injury = injury;
	}

	public int getPulse() {
		return pulse;
	}

	public void setPulse(int pulse) {
		this.pulse = pulse;
	}

	@Override
	public String care(IVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String illness() {
		if (injury && infection && pulse >= 0 && pulse <= 50 || !injury && infection && pulse >= 0 && pulse <= 50
				|| injury && !infection && pulse >= 0 && pulse <= 50) {
			return "slight illness";
		} else if (injury && infection && pulse >= 100 && pulse <= 150
				|| !injury && infection && pulse >= 100 && pulse <= 150
				|| injury && !infection && pulse >= 100 && pulse <= 150) {
			return "serious illness";
		} else {
			return "healthy";
		}
	}

}