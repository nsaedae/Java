package ch05;

public class Account {
	// 속성(필드) : 
	//  - 무조건 캡슐화(private) 적용한다.
	//  - 상속관계에서는 자식 클래스에서 참조 할 수 있도록 protected로 선언
	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	
	// 생성자(Constructor) : 객체 생성할 때 멤버변수를 초기화하는 메서드
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	// 기능
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("---------------");
		System.out.println("은행명 : "+this.bank);
		System.out.println("계좌번호 : "+this.id);
		System.out.println("입금주 : "+this.name);
		System.out.println("현재잔액 : "+this.balance);
		System.out.println("---------------");
	}
}
