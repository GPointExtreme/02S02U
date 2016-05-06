package exception.ue.transporter;

public class Transporter {
	
	public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {
		if(urgent == true) {
			if(Math.random()<0.7) {
				throw new TransporterMalfunctionException("Beam failed Scotty!");
			}
			else {
				System.out.println("Beamed from " + from + " to " + to + "!");
			}
		}
	}
	
	public void shutdown() {
		System.out.println("Transporter shutdown");
	}
}