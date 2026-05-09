package _07_duck;

public class Duck {
	private int numberOfFriends;
	private String favoriteFood;
	void quack() {
		System.out.println("Daffy quacks when seeing "+favoriteFood+" and when she sees her friends which she has " +numberOfFriends+" of");
	}
	void waddle() {
		System.out.println("Daffy waddles");
	}

	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
}
