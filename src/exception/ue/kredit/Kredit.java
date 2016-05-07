package exception.ue.kredit;

public class Kredit implements Comparable<Kredit>{
	
	private String vertragsPartner;
	private String vertragsDatum;
	private double gesamtBetrag;
	private int gesamtJahre;
	private double offenerBetrag;
	private int offeneJahre;
	private double rate;
	
	public Kredit(String vertragsPartner, String vertragsDatum, double gesamtBetrag, int gesamtJahre, double rate) {
		super();
		this.vertragsPartner = vertragsPartner;
		this.vertragsDatum = vertragsDatum;
		this.gesamtBetrag = gesamtBetrag;
		this.gesamtJahre = gesamtJahre;
		this.offenerBetrag = gesamtBetrag;
		this.offeneJahre = gesamtJahre;
		this.rate = rate;
	}

	@Override
	public int compareTo(Kredit o) {
		int i = this.vertragsDatum.compareTo(o.vertragsDatum);
		if(i < 0) {
			return 1;
		}
		if(i > 0) {
			return -1;
		}
		if(i == 0) {
			if(this.gesamtBetrag < o.gesamtBetrag) {
				return 1;
			}
			if(this.gesamtBetrag > o.gesamtBetrag) {
				return -1;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Kredit [vertragsPartner=" + vertragsPartner + ", vertragsDatum=" + vertragsDatum + ", gesamtBetrag="
				+ gesamtBetrag + ", gesamtJahre=" + gesamtJahre + ", offenerBetrag=" + offenerBetrag + ", offeneJahre="
				+ offeneJahre + ", rate=" + rate + "]";
	}

}
