package test3;

/*
 * ��¥ : 0000/00/00
 * �̸� : ȫ�浿
 * ���� : �ڹ� Ŭ���� ��������
 */
public class Ex01 {
	private String name;
	private int age;
	
	public Ex01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("================");
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.age);
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		
		Ex01 kim = new Ex01("������", 23);
		Ex01 lee = new Ex01("�̼���", 31);
				
		kim.show();
		lee.show();	
	}
}


