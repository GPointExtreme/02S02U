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

}
