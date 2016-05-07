package exception.ue.kredit;

import java.util.ArrayList;
import java.util.Collections;

public class Bank {
	
	private ArrayList<Kredit> list = new ArrayList<>();
	
	public Bank(ArrayList<Kredit> list) {
		super();
		this.list = list;
	}

	public ArrayList<Kredit> getKredit() {
		Collections.sort(list);
		return list;
	}
	
	
	

}
