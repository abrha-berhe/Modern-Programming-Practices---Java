package Lab2_ProjectManagement;

import java.time.LocalDate;
import java.util.List;

public class Release {
private String realeaseID;
private LocalDate releaseDate;
private List<Feature> listOfFeatures;


public Release(String realeaseID, LocalDate releaseDate) {
	this.realeaseID = realeaseID;
	this.releaseDate = releaseDate;
}


public String getRealeaseID() {
	return realeaseID;
}
 

public LocalDate getReleaseDate() {
	return releaseDate;
}


public List<Feature> getListOfFeatures() {
	return listOfFeatures;
}


public void addListOfFeatures(List<Feature> listOfFeatures) {
	this.listOfFeatures = listOfFeatures;
}


	
}
