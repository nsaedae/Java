package ch02;
/*
 * 날짜 : 2021/12/31
 * 이름 : 김철학
 * 내용 : 자바 자료형(Data Type) 실습하기 교재 p38
 */
public class Sub2_DataTypeTest {
	
	public static void main(String[] args) {
		
		// 정수형
		byte  num1 = 127;
		short num2 = 32767;
		int   num3 = 2147483647;
		long  num4 = 1000L;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		
		// 실수형
		float  var1 = 1.123456789f;				// 소수점  7자리까지
		double var2 = 1.12345678901234567890;	// 소수점 16자리까지
				
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		
		// 논리형
		boolean val1 = true;
		boolean val2 = false;
		
		System.out.println("val1 : "+val1);
		System.out.println("val2 : "+val2);
		
		// 문자형
		char ch1 = 'A';
		char ch2 = '가';
		
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		
		// 문자열
		String str1 = "A";
		String str2 = "Apple";
		String str3 = "사";
		String str4 = "사과";
		String str5 = "123";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		System.out.println("str5 : "+str5);
		
	}
}
