package exceptions.ue.liga;

import java.util.Comparator;

public class ComparatorName implements Comparator<Team> {

	@Override
	public int compare(Team o1, Team o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
