package test1;

/**
 * 날짜 : 2022/01/06
 * 이름 : 김철학
 * 내용 : 자바 연습문제 
 */
public class Ex04 {
	public static void main(String[] args) {
		
		int num = 0;
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
