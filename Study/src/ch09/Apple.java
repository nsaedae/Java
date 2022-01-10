package ch09;

public class Apple extends Object {
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	public void show() {
		System.out.println("사과 원산지 : "+this.country);
		System.out.println("사과 가격 : "+this.price);
	}
	
	@Override
	public String toString() {
		show();
		return super.toString();
	}
}
