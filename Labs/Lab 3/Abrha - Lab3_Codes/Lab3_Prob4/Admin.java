package Lab3_Prob4;

import java.util.*;

public class Admin {
	public static double computeTotalRent(List<Property> properties) {
		double totalRent = 0;
		for (Property pr : properties) {
			totalRent += pr.computeRent();
		}
		return totalRent;
	}
}
