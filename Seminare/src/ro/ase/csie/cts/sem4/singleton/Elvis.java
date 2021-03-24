package ro.ase.csie.cts.sem4.singleton;

public class Elvis {
	
	//private final static Elvis theTrueElvis=new Elvis();
	private static Elvis theTrueElvis;

	
	private Elvis() {	
	}
	
	public static Elvis getInstance() {
		if(theTrueElvis==null) {
			// pentru 2 fire de executie vom avea nevoie sa facem clasa syncronized
			synchronized(Elvis.class) {
				// aceasta verificare ne ajuta in a nu crea obiecte noi degeaba 
				if(theTrueElvis==null) {
					theTrueElvis = new Elvis();
				}
			}
		}
		
		return theTrueElvis;
		// cand nu mai vrem sa fie singleton
		//return new Elvis();
	}
	
	public void sing() {
		System.out.println("Elvis is singing");
	}

}
