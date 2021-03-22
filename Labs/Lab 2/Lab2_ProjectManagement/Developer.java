package Lab2_ProjectManagement;

import java.util.*;

public class Developer {
	private String developerID;
	private List<Feature> assignedFeatures;

	public Developer(String developerID) {
		this.developerID = developerID;
	}

	public String getDeveloperID() {
		return developerID;
	}

	public List<Feature> getAssignedFeatures() {
		return assignedFeatures;
	}

	public void addAssignedFeatures(List<Feature> assignedFeatures) {
		this.assignedFeatures = assignedFeatures;
	}
	
	public double estimateTimeRemaining(Feature feature) {
		return feature.getAllotedHours()-feature.getHoursWorked();
	}
}
