package ch05;

/**
 * ��¥ : 2022/01/05
 * �̸� : ��ö��
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� ���� p140 
 */
public class Sub1_ClassTest {
	
	public static void main(String[] args) {
		
		// Car��ü ����
		Car sonata = new Car("�ҳ�Ÿ", "���", 0);
		sonata.speedUp(100);
		sonata.speedDown(60);
		sonata.show();
		
		// bmw ��ü ����
		Car bmw = new Car("520d", "����", 0);
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		// Account ��ü ����
		Account kb = new Account("��������", "101-12-1010", "������", 10000);
		kb.deposit(40000);
		kb.withdraw(5000);
		
		// ���������� ��ü�� ������ ���� �����ؼ� ����� �߻� --> ĸ��ȭ �������� ����ڵ� ����
		//kb.balance--;		
		kb.show();
		
		Account wr = new Account("�츮����", "111-11-1012", "������", 30000);
		wr.deposit(10000);
		wr.withdraw(12000);
		wr.show();
	}
}













