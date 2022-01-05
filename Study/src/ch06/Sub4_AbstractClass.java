package ch06;

/*
 * 날짜 : 2022/01/05
 * 이름 : 김철학
 * 내용 : 자바 추상클래스 실습하기 교재 p216
 */
public class Sub4_AbstractClass {
	public static void main(String[] args) {
		
		Unit zealot = new Zealot();
		Unit zerg   = new Zerg();
		
		zealot.move();
		zealot.attack();
		
		zerg.move();
		zerg.attack();
	}	
}
