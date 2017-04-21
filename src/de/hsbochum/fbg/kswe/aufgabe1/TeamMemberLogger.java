package de.hsbochum.fbg.kswe.aufgabe1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class TeamMemberLogger {

	private final static  Logger LOGGER = Logger.getLogger(TeamMemberLogger.class.getName());

	public static void main(String[] args) {
		TeamMemberLogger tml = new TeamMemberLogger();
		tml.loadTeamMembers();
		tml.doLog();
	}

	private List<TeamMember> members;

	private void loadTeamMembers() {
		this.members = new ArrayList<>();

		loadMemberC();
		loadMemberB();
		loadMemberA();

	}

	private void loadMemberC() {
		this.members.add(new TeamMember("Barbara", "Klein"));
	}

	private void loadMemberB() {
		this.members.add(new TeamMember("Kevin", "Pearson"));
	}

	private void loadMemberA() {
            this.members.add(new TeamMember("Ronny", "Bennet"));
	}

	private void doLog() {
		System.out.println(String.format("%s Mitglieder insgesamt:", this.members.size()));
		this.members.stream().forEach(m -> {
			LOGGER.log(Level.INFO, m.toString());
		});
	}
}