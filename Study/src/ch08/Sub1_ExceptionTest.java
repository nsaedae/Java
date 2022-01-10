package ch08;

/**
 * 날짜 : 2022/01/10
 * 이름 : 김철학
 * 내용 : 자바 예외처리 실습하기 교재 p264 
 */
public class Sub1_ExceptionTest {
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 2;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {
			// 에러가 발생할 가능성이 있는 코드로직 작성
			r4 = num2 / num1;
		}catch (Exception e) {
			// 에러가 발생했을 때 처리 로직 작성
			e.printStackTrace();
		}finally {
			// 에러발생 여부와 상관없이 마지막 무조건 실행되는 처리블럭
			System.out.println("예외처리 완료...");
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("프로그램 종료...");		
	}
}
