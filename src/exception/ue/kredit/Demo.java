package exception.ue.kredit;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Kredit> list = new ArrayList<>();
		Kredit kredit1 = new Kredit("David", "2016-05-01", 4000, 20, 200);
		Kredit kredit2 = new Kredit("David", "2016-05-15", 5000, 5, 1000);
		Kredit kredit3 = new Kredit("David", "2016-05-01", 7000, 14, 500);
		
		list.add(kredit1);
		list.add(kredit2);
		list.add(kredit3);
		
		Bank bank = new Bank(list);
		
		bank.deductAll();
		bank.deductAll();
		bank.deductAll();
		bank.deductAll();
		bank.deductAll();
		bank.deductAll();
		
		for (Kredit kredit : list) {
			System.out.println(kredit);
		}
		
		
		
	}

}
