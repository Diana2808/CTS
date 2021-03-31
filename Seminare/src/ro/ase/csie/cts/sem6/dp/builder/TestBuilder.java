package ro.ase.csie.cts.sem6.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1. construiesti obiectul
		//SuperErou superErou = new SuperErou();
		
		//2. initializarea atributelor
		//superErou.nume = "Superman";
		
		//SuperErou superErou2 = 
		//		new SuperErou("Batman", 100, false, false, new Arma(), null ,null, null);
	
		SuperErou superman = 
				new SuperErou.SuperErouBuilder("Superman", 100)
				.setArmaDreapta(new Arma())
				.setArmaStanga(new Arma())
				.build(); 
		// SuperErouBuilder ( clasa static )
		//superman.nume ="Superman"; -> nu se mai poate pt ca sunt private
		
		SuperErou joker = 
				new SuperErou.SuperErouBuilder("Joker", 200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build(); 
		
		SuperErou joker2 = 
				new SuperErou.SuperErouBuilder("Joker", 200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build();
	}

}
