package test2;

/*
 * ��¥ : 0000/00/00
 * �̸� : ȫ�浿
 * ���� : �ڹ� �迭 ���� ��� ��������
 */
public class Ex01 {
	public static void main(String[] args) {
		
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y','O','U'};
		int row, col;

		for (row = 1; row < 10; row++) {

			for (col = 0; col <= row; col++) {

				System.out.print(str[col]);

			}

			System.out.print("\n");
		}
	}
}

