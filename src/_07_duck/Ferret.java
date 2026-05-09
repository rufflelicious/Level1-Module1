package _07_duck;

public class Ferret {
		private int numberOfFrerrets;
		private String favFood;
		void squeaks() {
			System.out.println("Franklin D Roosevelt squeaks in joy when seeing "+favFood+" and when she sees her friends which she has " +numberOfFrerrets+" of");
		}
		void scurry() {
			System.out.println("Franklin D Roosevelt scurries away");
		}

		Ferret(String favoriteFood, int numberOfFriends) {
		       this.favFood = favFood;
		       this.numberOfFrerrets = numberOfFrerrets;
		
}
	}
