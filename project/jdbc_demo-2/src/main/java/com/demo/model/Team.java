package com.demo.model;

public class Team {
	private String teamid;
	private String teamName;
	private String location;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTeamid() {
		return teamid;
	}
	public void setTeamid(String teamid) {
		this.teamid = teamid;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", teamName=" + teamName + ", location=" + location + "]";
	}
	public Team(String teamid, String teamName, String location) {
		super();
		this.teamid = teamid;
		this.teamName = teamName;
		this.location = location;
	}



	

}
