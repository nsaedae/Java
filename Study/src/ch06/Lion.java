package ch06;

public class Lion extends Animal {

	@Override
	public void move() {
		System.out.println("Lion run...");
	}

	public void hunt() {
		System.out.println("Lion hunt...");
	}
}
