package exceptions.ue.liga;

public class Team implements Comparable<Team>{
	
	private String Name;
	private int CountWon;
	private int CountLost;
	private int GoalsScored;
	private int GoalsGot;
	private int Points;
	private int PlayedRounds;
	
	public Team(String name) {
		super();
		Name = name;
		CountWon = 0;
		CountLost = 0;
		GoalsScored = 0;
		GoalsGot = 0;
		Points = 0;
		PlayedRounds = 0;
	}

	@Override
	public String toString() {
		return "Team [Name=" + Name + ", CountWon=" + CountWon + ", CountLost=" + CountLost + ", GoalsScored="
				+ GoalsScored + ", GoalsGot=" + GoalsGot + ", Points=" + Points + ", PlayedRounds=" + PlayedRounds
				+ "]";
	}

	@Override
	public int compareTo(Team o) {
		if(this.Points < o.Points) {
			return 1;
		}
		if (this.Points > o.Points) {
			return -1;
		}
		if (this.Points == o.Points) {
			if((this.GoalsScored-this.GoalsGot) < (o.GoalsScored-o.GoalsGot)) {
				return 1;
			}
		}
		return 0;
	}
	
	
	//Getter-----------------------

	public String getName() {
		return Name;
	}

	public int getCountWon() {
		return CountWon;
	}

	public int getCountLost() {
		return CountLost;
	}

	public int getGoalsScored() {
		return GoalsScored;
	}

	public int getGoalsGot() {
		return GoalsGot;
	}

	public int getPoints() {
		return Points;
	}

	public int getPlayedRounds() {
		return PlayedRounds;
	}	

}
