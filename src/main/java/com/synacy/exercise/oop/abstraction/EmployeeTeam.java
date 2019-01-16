package com.synacy.exercise.oop.abstraction;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTeam {
	String name;
	Employee leader;
	private EmployeeList teamMembers = new EmployeeList();

	public void addMember(Employee employee){
		teamMembers.add(employee);
	}

	public List <Employee> getTeamMembers(){
		return teamMembers.getTeamMembers();
	}

	private class EmployeeList {
		private List tempList = new ArrayList();

		public void add(Employee employee) {
			tempList.add(employee);
		}

		public List <Employee> getTeamMembers() {
			return tempList;
		}
	}
}
