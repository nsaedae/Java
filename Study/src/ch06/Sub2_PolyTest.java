package ch06;

/*
 * 날짜 : 2022/01/05
 * 이름 : 김철학
 * 내용 : 자바 다형성 실습하기 교재 p205
 * 
 * 다형성(Polymorphism)
 *  - 하나의 기능이 여러 기능으로 변하는 성질
 *  - 상속관계에서 부모클래스의 기능을 자식클래스에서 다시 재정의하는 기법
 *  - 객체의 타입을 부모클래스 타입 선언 -> 프로그램의 유연성을 높인다.
 */
public class Sub2_PolyTest {

	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		Animal lion  = new Lion();
		Animal shark = new Shark();
		
		eagle.move();
		lion.move();
		shark.move();
		
		eagle.hunt();
		lion.hunt();
		shark.hunt();
	}
}
