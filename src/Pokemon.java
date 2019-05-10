
public class Pokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	public static Pokemon pikachu = new Pokemon(true, true, 50, "yellow", 50);
//	attributes declared
	String Type;
	boolean trained;
	static int tackle;
	String color;
	int Speed;
	
	public Pokemon(boolean electricType, boolean trained, int tackle, String color, int Speed) {
//		attributes assigned
		this.electricType = electricType;
		this.trained = trained;
		this.tackle = tackle;
		this.color = color;
		this.Speed = Speed;
	}
	
	public static String fight() {
		if (tackle > 40) {
			returns "Go Pikachu, Blitz Tackle!";
		} else {
			return "Your Charizard is out of fire";
		}
	}
	
}
