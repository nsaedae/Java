package ch04;
/*
 * 날짜 : 2022/01/04
 * 이름 : 김철학
 * 내용 : 자바 메서드 실습하기 교재 p152
 * 
 * 메서드(Method)
 *  - 프로그래밍에서 함수를 자바에서 Method
 *  - 일련의 코드로직을 모듈화한 구조체
 *  - 함수는 정의(Define)하고 호출(Call)
 */
public class Sub3_MethodTest {
	
	public static void main(String[] args) {
		
		// 함수 호출
		int r1 = f(1);
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		int s1 = sum(1, 10);
		int s2 = sum(1, 100);
		int s3 = sum(1, 1000);
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
	}// main method end
	
	// 함수 정의
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	public static int sum(int start, int end) {
		
		int total = 0;
		
		for(int k=start ; k<=end ; k++) {
			total += k;
		}
		
		return total;
	}
}


