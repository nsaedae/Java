package ch03;

/*
 * 날짜 : 2022/01/03
 * 이름 : 김철학
 * 내용 : 자바 반복문 while 실습하기 교재 p92
 */
public class Sub3_WhileTest {
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
		
		// do ~ while문 : 최초 1번은 무조건 실행하는 반복문
		int total = 0;
		int i = 1;
				
		do {
			
			if( i%2 == 0 ) {
				total += i;
			}
			
			i++;
			
		}while( i <= 10 );
		
		System.out.println("1부터 10까지 짝수합 : "+total);
		
		// break
		int num = 1;
		
		while(true) {
						
			if(num % 5 == 0 && num % 7 == 0) {
				break; // 반복문 탈출
			}
			
			num++;
		}
		
		System.out.println("5와 7의 최소공배수 : "+num);
		
		// continue
		int tot = 0;
		int j = 0;
		
		while( j <= 10 ) {
			
			j++;
			
			if( j%2 == 1 ) {
				continue;  // 반복문 처음으로 이동
			}
			
			tot += j;			
		}
		
		System.out.println("1부터 10까지 짝수합 : "+tot);
	}
}
