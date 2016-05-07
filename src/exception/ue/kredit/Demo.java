package exception.ue.kredit;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Kredit> list = new ArrayList<>();
		Kredit kredit1 = new Kredit("David", "2016-05-01", 2000, 3, 200);
		Kredit kredit2 = new Kredit("David", "2016-05-15", 1000, 3, 200);
		Kredit kredit3 = new Kredit("David", "2016-05-01", 3000, 3, 200);
		
		list.add(kredit1);
		list.add(kredit2);
		list.add(kredit3);
		
		Bank bank = new Bank(list);
		bank.getKredit();
		
		for (Kredit kredit : list) {
			System.out.println(kredit);
		}
		

	}

}
