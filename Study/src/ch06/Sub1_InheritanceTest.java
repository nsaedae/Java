package ch06;

/*
 * 날짜 : 2022/01/05
 * 이름 : 김철학
 * 내용 : 자바 클래스 상속 실습하기 교재 p196
 */
public class Sub1_InheritanceTest {
	public static void main(String[] args) {
	
		StockAccount kb = new StockAccount("KB증권", "101-11-1012", "홍길동", 10000, "삼성전자", 10, 70000);

		kb.deposit(1000000);
		kb.withdraw(200000);
		kb.show();
		
		kb.buy(10, 65000);
		kb.show();
		
		kb.sell(10, 72000);
		kb.show();
	}
}
