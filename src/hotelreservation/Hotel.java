package hotelreservation;

public class Hotel {

	String name;
	int regularRate;
	int weekendRate;

	public Hotel(String name, int regularRate, int weekendRate) {

		this.name = name;
		this.regularRate = regularRate;
		this.weekendRate = weekendRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegularRate() {
		return regularRate;
	}

	public void setRegularRate(int regularRate) {
		this.regularRate = regularRate;
	}

	public int getWeekendRate() {
		return weekendRate;
	}

	public void setWeekendRate(int weekendRate) {
		this.weekendRate = weekendRate;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", regularRate=" + regularRate + ", weekendRate=" + weekendRate + "]";
	}

}
