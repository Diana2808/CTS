package ro.ase.csie.cts.sem4.singleton;

public class Elvis {
	
	public static Elvis theTrueElvis=new Elvis();
	
	private Elvis() {	
	}
	
	public void sing() {
		System.out.println("Elvis is singing");
	}

}
