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
	
	public ArrayList<Kredit> getNaechsterKreditFaellig() {
		KreditOffeneJahre k = new KreditOffeneJahre();
		Collections.sort(list, k);
		return list;
	}
	
	public void neuerKredit(Kredit k) throws ToMuchOpenCreditException {
		if(list.size() <= 3) {
			list.add(k);
		}
		else
			throw new ToMuchOpenCreditException();
	}
	
	public void deductAll() {
		for (Kredit kredit : list) {
			try {
				kredit.deduct();
			} catch (CreditAlreadyPaidException e) {
				list.remove(kredit);
				e.printStackTrace();
			}
		}
	}
	
	
	

}
