package Lab3_Prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	
	private int buildingNumber;
	private double maintenanceCost;
	private List<Apartment> apartments;
	private Landlord owner;
	
	Building(int ID, double cost) {
		this.buildingNumber = ID;		
		this.maintenanceCost = cost;
		apartments = new ArrayList<>();		
	}
	
	public int getBuildingNumber() {
		return buildingNumber;
	}
	
	public double getMaintenanceCost() {
		return maintenanceCost;
	}
 
	public List<Apartment> getApartments() {
		return apartments;
	}

	public void addApartments(List<Apartment> apartments) {
		this.apartments = apartments;
	}

	public void addOwner(Landlord owner) {
		this.owner = owner;
	}
	public Landlord getOwner() {
		return this.owner;
	}
	
	
	public double calculateMonthlyProfit() {
		double totalRent = 0.0;
		for(Apartment ap: apartments) {
			totalRent += ap.getRent();
		}
		
		return totalRent-maintenanceCost;
	}


	
}
