package test2;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 자바 배열 문자 출력 연습문제
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


