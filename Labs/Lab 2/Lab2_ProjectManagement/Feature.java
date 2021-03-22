package Lab2_ProjectManagement;

import java.util.*;

public class Feature {
	private String featureID;
	private String featureName;
	private Double allotedHours;
	private Double hoursWorked;	
	private List<Developer> associatedDevelopers;
	
 
	  
	public Feature(String featureID, String featureName, Double allotedHours, Double hoursWorked) {
		this.featureID = featureID;
		this.featureName = featureName;
		this.allotedHours = allotedHours;
		this.hoursWorked = hoursWorked;
	}

	public String getFeatureID() {
		return featureID;
	}
	public String getFeatureName() {
		return featureName;
	}

	public Double getAllotedHours() {
		return allotedHours;
	}

	public Double getHoursWorked() {
		return hoursWorked;
	}

	public List<Developer> getAssociatedDeveloper() {
		return associatedDevelopers;
	}
	 
	public void addAssociatedDevelopers(List<Developer> associatedDevelopers) {
		this.associatedDevelopers = associatedDevelopers;
	}
 
}
