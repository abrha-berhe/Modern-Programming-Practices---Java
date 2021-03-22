package Lab2_ProjectManagement;

import java.util.*;

public class Project {
	private String projectId;
	private String projectName;
	private List<Feature> features; // 1 project has set of features
	private List<Release> releases; // 1 project is delivered as more releases

	public Project(String projectId, String projectName) {
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public String getProjectId() {
		return projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public List<Release> getReleases() {
		return releases;
	}

	public void addReleases(List<Release> releases) {
		this.releases = releases;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void addFeatures(List<Feature> features) {
		this.features = features;
	}

}
