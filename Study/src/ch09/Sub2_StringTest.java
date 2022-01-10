package ch09;

/*
 * 날짜 : 2022/01/10
 * 이름 : 김철학
 * 내용 : 자바 String 내장클래스 실습 교재 p302
 */
public class Sub2_StringTest {
	
	public static void main(String[] args) {
		
		// 문자열 비교
		String str1 = "hello";
		String str2 = new String("hello");
		
		if(str1 == str2) {
			System.out.println("str1 참조값과 str2 참조값는 같다.");
		}else {
			System.out.println("str1 참조값과 str2 참조값는 다르다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1 문자열과 str2 문자열은 같다.");
		}else {
			System.out.println("str1 문자열과 str2 문자열은 다르다.");
		}
		
		// 문자열 길이
		String hello = "Hello Korea";
		
		System.out.println("문자열 hello 길이 : "+hello.length());

		// 문자열 추출
		System.out.println("문자열 hello 1번째 문자 : "+hello.charAt(0));
		System.out.println("문자열 hello 7번째 문자 : "+hello.charAt(6));
		
		// 문자열 자르기
		System.out.println("문자열 hello 1~6까지 자르기 : "+hello.substring(0, 5));
		System.out.println("문자열 hello 7~마지막까지 자르기 : "+hello.substring(6));
						
		// 문자열 인덱스
		System.out.println("문자열 hello 앞에서부터 문자 e인덱스 : "+hello.indexOf("e"));
		System.out.println("문자열 hello 뒤에서부터 문자 e인덱스 : "+hello.lastIndexOf("e"));
		
		// 문자열 교체
		System.out.println("문자열 'Korea'를 'Busan'으로 교체 : "+hello.replace("Korea", "Busan"));
		
		// 문자열 변환
		int 	var1 = 1;
		double  var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
	}
}










