package array.ue.lotto;

import java.util.ArrayList;
import java.util.Collections;

public class Zahl implements Comparable<Zahl>{
	
	private int zahl;
	private int counter;
	
	public Zahl(int zahl) {
		super();
		this.zahl = zahl;
		this.counter = 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
		result = prime * result + zahl;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zahl other = (Zahl) obj;
		if (zahl != other.zahl)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Zahl o) {
		if(counter < o.counter)
			return 1;
		if(counter > o.counter)
			return -1;
		return 0;
	}
	
	public static int[] findTop6Numbers(int[][] numbers) {
		ArrayList<Zahl>list = new ArrayList<>();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				boolean gefunden = false;
				for (Zahl zahl : list) {
					if(zahl.zahl == numbers[i][j]) {
						zahl.counter++;
						gefunden = true;
					}
				}
				if (!gefunden) {
					list.add(new Zahl(numbers[i][j]));
				}
			}
		}
		Collections.sort(list);
		int[] top6 = new int[6];
		for (int i = 0; i < top6.length; i++) {
			top6[i] = list.get(i).zahl;
		}
		return top6;
	}
}
