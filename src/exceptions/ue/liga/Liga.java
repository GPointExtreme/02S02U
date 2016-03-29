package exceptions.ue.liga;

import java.util.ArrayList;
import java.util.Collections;

public class Liga {
	
	private String Name;
	private ArrayList<Team> Teams;
	
	public Liga(String name) {
		super();
		Name = name;
		Teams = new ArrayList<>();
	}
	
	public void add(String name) throws TeamAlreadyExistsException {
		for (Team team : Teams) {
			if(team.getName().equals(name)) {
				throw new TeamAlreadyExistsException();
			}
		}
		this.Teams.add(new Team(name));
	}

	public ArrayList<Team> getTeamsByPoints() {
		Collections.sort(Teams);
		return Teams;
	}
	
	public ArrayList<Team> getAllTeams() {
		Collections.sort(Teams, new ComparatorName());
		return Teams;
	}
	
	private Team findTeam(String name) {
		for (Team team : Teams) {
			if(team.getName().equals(name));
			return team;
		}
		return null;
	}
	
	public void newGame(String teamA, int goalsA, String teamB, int goalsB) throws TeamNotFoundException, LigaException {
		Team a = findTeam(teamA);
		Team b = findTeam(teamB);
		
		if(a == null || b == null) {
			throw new TeamNotFoundException();
		}
		try {
			a.gameFinished(goalsA, goalsB);
			b.gameFinished(goalsB, goalsA);
		} catch (GoalsMustBePrositivException e) {
			throw new LigaException();
		}
		
	}

}