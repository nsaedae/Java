package ch02;
/*
 * 날짜 : 2021/12/31
 * 이름 : 김철학
 * 내용 : 자바 변수 실습하기 교재 p36
 * 
 * 변수(Variable)
 *  - 데이터를 처리하기 위한 데이터 그릇
 *  - 데이터를 처리하기 위해 메모리에 생성되는 임시기억공간
 */
public class Sub1_VariableTest {
	
	public static void main(String[] args) {
		
		int num1; // 변수 선언
		num1 = 1; // 변수 대입
		
		int num2 = 2;
		
		int num3 = num1 + num2;
		
		System.out.println("num3 : "+num3);
	}
}
