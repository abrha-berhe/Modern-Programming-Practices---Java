package Lab2_ProjectManagement;

import java.util.*;

public class ProjectManager {
	private List<Project> projects; // 1 project manager may have 0..* projects
	private List<Developer> developers; //  1 project manager may manage 0..* developers	
	
	public List<Project> getProjects() {
		return projects;
	}
	
	public void addProjects(List<Project> projects) {
		this.projects = projects;
	}
	public List<Developer> getDevelopers() {
		return developers;
	}
	public void addDevelopers(List<Developer> developers) {
		this.developers = developers;
	}
	
	public void assignFeatures(Feature feature) { // Dependency 
		feature.addAssociatedDevelopers(developers);
	}
	
	
}
