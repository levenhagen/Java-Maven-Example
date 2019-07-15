package com.redhat.main;

import java.util.ArrayList;

public class RegularDev extends Employee{
	
	private String section;
	private String team;
	private String[] prog_languages;
	
	public RegularDev() {
		// TODO Auto-generated constructor stub
		prog_languages = new String[100];//arbitrary
	}
	
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
	
	public String[] getLinguagens() {
		return prog_languages;
	}
	
	public void setLanguages(String[] l) {
		this.prog_languages = l;
	}
	
	public void tutorDev(JuniorDev dj) {}
}
