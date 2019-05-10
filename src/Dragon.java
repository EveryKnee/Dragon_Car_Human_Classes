
public class Dragon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dragon dragon1 = new Dragon("Mekoo", 100, "blue", 1000, "Korea");
		Dragon dragon2 = new Dragon("Sichuan", 10000, "red", 58, "China");
		Dragon dragon3 = new Dragon("PumPum", 100000, "orange and yellow", 5000, "Japan");
		dragon1.firePowerUpIntensity();
		dragon3.tellMe();
		dragon2.dangerLevelUp();
	}
	
	String name;
	int firepower;
	String color;
	int dangerLevel;
	String origin;
	
	Dragon (String name, int firepower, String color, int dangerLevel, String origin) {
//		points to the current instance
		this.name = name;
		this.firepower = firepower;
		this.color = color;
		this.dangerLevel = dangerLevel;
		this.origin = origin;
	}
	
	public void tellMe() {
		System.out.println("Your name is " + this.name);
		System.out.println("Your firepower is " + this.firepower);
		System.out.println("You are " + this.color);
		System.out.println("Your dangerLevel is " + this.dangerLevel);
		System.out.println("You're from " + this.origin);
	}
	
	public void firePowerUpIntensity() {
		this.firepower +=100;
		System.out.println("Fire Power is up by 100.  Your firepower is now " + this.firepower);
	}
	
	public void dangerLevelUp() {
		this.dangerLevel *=5;
		System.out.println("Danger Level went up by 5.  It's now " + this.dangerLevel);
	}
}
