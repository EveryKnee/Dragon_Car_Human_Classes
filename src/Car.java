
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Lik Shot", "Lambo", "2018 Huracan Evo Spyder", "Italy", 5);
		Car car2 = new Car("Baby", "Ferrari", "2018 488 GTB", "Italy", 4);
		Car car3 = new Car("Patrick", "Bugatti", "2018 V6", "Italy", 5);
		car1.tellMeMake();
		car3.tellMeModel();
		car2.userRatingUp();
	}
	
	String name;
	String make; 
	String model;
	String origin;
	int userRatingPoints;
	
	Car (String name, String make, String model, String origin, int userRatingPoints) {
//		points to the current instance
		this.name = name;
		this.make = make;
		this.model = model;
		this.origin = origin;
		this.userRatingPoints = userRatingPoints;
	}
	
	public void tellMeMake() {
		System.out.println("Your make is " + this.make);
	}
	
	public void tellMeModel() {
		System.out.println("Your model is " + this.model);
	}

	public void tellMeOrigin() {
		System.out.println("Your car is from " + this.origin);
	}
	
	public void userRatingUp() {
		this.userRatingPoints +=1;
		System.out.println("Your user rating is up by 1, now " + this.userRatingPoints);
	}
}
