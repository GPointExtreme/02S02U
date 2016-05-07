package exception.ue.kredit;

import java.util.Comparator;

public class KreditOffeneJahre implements Comparator<Kredit>{

	@Override
	public int compare(Kredit o1, Kredit o2) {
		if(o1.getOffeneJahre() < o2.getOffeneJahre()) {
			return -1;
		}
		if(o1.getOffeneJahre() > o2.getOffeneJahre()) {
			return 1;
		}
		if(o1.getOffeneJahre() == o2.getOffeneJahre()) {
			if(o1.getGesamtJahre() < o2.getGesamtJahre()) {
				return -1;
			}
			if(o1.getGesamtJahre() > o2.getGesamtJahre()) {
				return 1;
			}
		}
		return 0;
	}

	
	

}
