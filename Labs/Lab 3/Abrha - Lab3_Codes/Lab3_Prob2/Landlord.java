package Lab3_Prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private String name;
	private List<Building> buildings;

	public Landlord(String name) {
		this.name = name;
		buildings = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void addBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public double totalMonthlyProfit() {
		double monthlyProfit = 0.0;
		for (Building B : buildings) {
			monthlyProfit += B.calculateMonthlyProfit();
		}

		return monthlyProfit;
	}

}
