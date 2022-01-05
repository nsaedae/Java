package ch05;

public class Increment {

	public int num1;
	public static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("Increment num1 : "+num1);
		System.out.println("Increment num2 : "+num2);
	}
	
	// 정적메서드에서는 non-static 변수를 참조할 수 없다.
	public static void add() {
		//num1++;
		num2++;
	}
}
