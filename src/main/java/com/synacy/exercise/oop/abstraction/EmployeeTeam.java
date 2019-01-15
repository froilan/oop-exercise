package com.synacy.exercise.oop.abstraction;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTeam {

	String name;
	Employee leader;
	private List teamMembers = new ArrayList();

	public void addMember(Employee employee){
		teamMembers.add(employee);
	}

	public List getTeamMembers() {
		return teamMembers;
	}
}
