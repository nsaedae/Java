package ch03;
/*
 * 날짜 : 2022/01/03
 * 이름 : 김철학
 * 내용 : 자바 반복문 for 실습하기 교재 p90
 */
public class Sub2_ForTest {
	
	public static void main(String[] args) {
		
		// for
		for( int i=1 ; i<=5 ; i++ ) {
			System.out.printf("%d번 반복...\n", i);
		}
		
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			sum += k;
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
		
		// 1부터 10까지 짝수합
		int tot = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			
			if(k%2 == 0) {
				tot += k;
			}
		}
		
		System.out.println("1부터 10까지 짝수합 : "+tot);
		
		// 중첩 for
		for(int a=1 ; a<=3 ; a++) {
			System.out.println("a : "+a);
			
			for(int b=1 ; b<=4 ; b++) {
				System.out.println("b : "+b);	
				
				for(int c=1 ; c<=5 ; c++) {
					System.out.println("c : "+c);	
				}
			}
		}
		
		// 구구단
		for(int x=2 ; x<=9 ; x++) {
			
			System.out.println(x+"단");
			
			for(int y=1 ; y<=9 ; y++) {
				int z = x * y;
				System.out.printf("%d x %d = %d\n", x, y, z);
			}
		}
		
		// 별삼각형
		for(int start=10 ; start>=1 ; start--) {
			
			for(int end=1 ; end<=start; end++) {
				
				System.out.print("☆");				
			}
			
			System.out.println(); // 줄바꿈
		}
		
	}
}
