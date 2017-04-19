package de.hsbochum.fbg.kswe.aufgabe1;

public class TeamMember {

	private final String firstName;
	private final String lastName;

	public TeamMember(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", firstName, lastName);
	}
	
}
