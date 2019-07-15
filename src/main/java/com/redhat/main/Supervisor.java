package com.redhat.main;

public class Supervisor extends Employee{
	
	private String section;
	private String team;
	
	public Supervisor() {}
	
	public String getSection() {
		return section;
	}
	
	public void setSection(String section) {
		this.section = section;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public void supervise(RegularDev rd) {}
	
	public void supervise(JuniorDev jd) {}
}