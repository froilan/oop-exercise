package com.synacy.exercise.oop.abstraction;

public class Main {

	public static void main(String args[]) {
		Employee francis = new Employee();
		Employee len = new Employee();
		Employee steven = new Employee();
		Employee kenichi = new Employee();

		EmployeeTeam employeeTeam = new EmployeeTeam();
		employeeTeam.teamMembers.add(francis);
		employeeTeam.teamMembers.add(len);
		employeeTeam.teamMembers.add(steven);
		employeeTeam.teamMembers.add(kenichi);
		printTeamMemberFullNames(employeeTeam);
	}

	private static void printTeamMemberFullNames(EmployeeTeam employeeTeam) {
		employeeTeam.teamMembers.forEach(teamMember -> {
			System.out.println(teamMember.lastName + teamMember.firstName);
		});
	}

}
