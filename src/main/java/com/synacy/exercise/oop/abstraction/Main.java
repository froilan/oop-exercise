package com.synacy.exercise.oop.abstraction;

public class Main {

	public static void main(String args[]) {
		Employee francis = new Employee("Francis", "Molina");
		Employee len = new Employee("Len", "Random");
		Employee steven = new Employee("Steven", "Random2");
		Employee kenichi = new Employee("Kenichi", "Random3");

		EmployeeTeam employeeTeam = new EmployeeTeam();
		employeeTeam.addMember(francis);
		employeeTeam.addMember(len);
		employeeTeam.addMember(steven);
		employeeTeam.addMember(kenichi);
		printTeamMemberFullNames(employeeTeam);
	}

	private static void printTeamMemberFullNames(EmployeeTeam employeeTeam) {
		employeeTeam.getTeamMembers().forEach(teamMember -> {
			System.out.println(teamMember.getLastName() + teamMember.getFirstName());
		});
	}

}
