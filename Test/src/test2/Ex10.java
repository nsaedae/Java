package test2;

/*
 * ��¥ : 0000/00/00
 * �̸� : ȫ�浿
 * ���� : �ڹ� �Ǻ���ġ ���� ��� �޼��� ��������
 */
public class Ex10 {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print(fibo(i)+" ");
		}		
	}
	
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}	
}


