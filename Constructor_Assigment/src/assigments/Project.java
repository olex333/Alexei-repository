package assigments;

public class Project {
	private int projectid;
	private String projectname;
	private String clientname;
	
	public Project(int projectid, String projectname, String clientname) {
		this.projectid = projectid;
		this.projectname = projectname;
		this.clientname = clientname;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	
	 
	
	

}
