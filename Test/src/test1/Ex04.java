package test1;

/**
 * ��¥ : 2022/01/06
 * �̸� : ��ö��
 * ���� : �ڹ� �������� 
 */
public class Ex04 {
	public static void main(String[] args) {
		
		int num = 1;
		int result;
		
		result = num++;		
		System.out.println("result : "+result);
		
		result = ++num;		
		System.out.println("result : "+result);
		
		result = num--;		
		System.out.println("result : "+result);
		
		result = --num;		
		System.out.println("result : "+result);		
	}
}