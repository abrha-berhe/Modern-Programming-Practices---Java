package Lab3_Prob2;

public class Apartment {

	private int apartNum;
	private double rent;

	Apartment(int id, double rent) {
		this.apartNum = id;
		this.rent = rent;
	}

	public int getAppartNum() {
		return apartNum;
	}

	public double getRent() {
		return rent;
	}

}
