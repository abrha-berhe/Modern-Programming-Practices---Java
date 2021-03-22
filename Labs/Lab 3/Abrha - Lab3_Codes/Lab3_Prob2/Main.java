package Lab3_Prob2;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Landlord Owner1 = new Landlord("Abrha");
		Landlord Owner2 = new Landlord("Desta");

		Apartment[] apts0 = { new Apartment(1, 200), new Apartment(2, 300), new Apartment(3, 400) };
		Apartment[] apts1 = { new Apartment(4, 500), new Apartment(5, 600), new Apartment(6, 700) };
		Apartment[] apts2 = { new Apartment(7, 800), new Apartment(8, 900) };

		Apartment[] apts3 = { new Apartment(1, 200), new Apartment(2, 300), new Apartment(3, 400) };
		Apartment[] apts4 = { new Apartment(4, 500), new Apartment(5, 600), new Apartment(6, 700) };

		Building[] buildings1 = { new Building(1, 100), new Building(2, 150), new Building(3, 200) };
		buildings1[0].addApartments(Arrays.asList(apts0));
		buildings1[0].addOwner(Owner1);

		buildings1[1].addApartments(Arrays.asList(apts1));
		buildings1[1].addOwner(Owner1);

		buildings1[2].addApartments(Arrays.asList(apts2));
		buildings1[2].addOwner(Owner1);

		Owner1.addBuildings(Arrays.asList(buildings1));

		Building[] buildings2 = { new Building(4, 120), new Building(5, 180) };
		buildings2[0].addApartments(Arrays.asList(apts3));
		buildings2[0].addOwner(Owner2);

		buildings2[1].addApartments(Arrays.asList(apts4));
		buildings2[1].addOwner(Owner2);
		Owner2.addBuildings(Arrays.asList(buildings2));

		System.out.println(Owner2.totalMonthlyProfit());

	}

}
