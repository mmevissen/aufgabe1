package de.hsbochum.fbg.kswe.aufgabe1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TeamMemberLogger {
	
	public static void main(String[] args) {
		TeamMemberLogger tml = new TeamMemberLogger();
		tml.loadTeamMembers();
		tml.doLog();
	}

        
        
	private List<TeamMember> members;
        private Logger logger;

        public TeamMemberLogger(){
            this.logger = Logger.getLogger(TeamMemberLogger.class.getName());
        }
        
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
		this.members.stream().sorted((TeamMember m1, TeamMember m2) -> m1.getLastName().compareTo(m2.getLastName())).forEach(m -> {
			//System.out.println(m.toString());
                        logger.log(Level.INFO, m.toString());
		});
	}
	
}
