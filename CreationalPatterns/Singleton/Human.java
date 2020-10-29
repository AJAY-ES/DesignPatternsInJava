/*This is a Singleton class with Lazy instantiation
1.private constructor
2.global access instance to create object
we are using "alive" to check that we are dealing with the same (Singleton)Human
*/
public class Human {
	private static Human uniqueInstance = new Human();
	private static boolean alive;

	private Human() {
		/* Constructor is privatetised,so that no one can create object of it. */
		alive = true;
		System.out.println("I'm Born for first on here");
	}

	public static Human getInstance() {
		 /* 2.globally accesible method (public) to get the Singleton object  */
		if (alive)
			System.out.println("I'm here, nice to meet you");
		else
			System.out.println("You are talking the spirit dear!!!");
		return uniqueInstance;
	}

	public void setLife(boolean alive) {
		this.alive = alive;
		if (alive)
			System.out.println("Thanking you God,I'm reborn");
		else
			System.out.println("I'm died! But why you kill me God!");
	}

	public boolean getLife() {
		
		return this.alive;
	}
}
