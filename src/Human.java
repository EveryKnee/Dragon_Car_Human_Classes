
public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human("Kanessa", "English", "Brown", 32, 12);
		Human human2 = new Human("Garrian", "English", "Brown", 24, 12);
		Human human3 = new Human("CL", "Spanish", "Gold", 28, 100);
		human1.goToSchool();
		human2.tellMeAboutYourself();
	}

		String name;
		String language;
		String eyeColor;
		int age;
		int wisdom;
		static int eyeballs;
		
		Human (String name, String language, String eyeColor, int age, int wisdom) {
//			points to the current instance
			this.name = name;
			this.language = language;
			this.eyeColor = eyeColor;
			this.age = age;
			this.wisdom = wisdom;
		}
		
		public void goToSchool() {
			this.wisdom +=5;
			System.out.println("wisdom went up by 5 points, wisdom is now " + this.wisdom);
		}
		
		public void tellMeAboutYourself() {
			System.out.println("Your name is " + this.name);
			System.out.println("Your language is " + this.language);
			System.out.println("Your eye color is " + this.eyeColor);
			System.out.println("Your age is " + this.age);
			System.out.println("Your wisdom is " + this.wisdom);
		}
}
