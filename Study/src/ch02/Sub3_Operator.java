package ch02;

/*
 * 날짜 : 2022/01/03
 * 이름 : 김철학
 * 내용 : 자바 연산자 실습하기 교재 p52
 */
public class Sub3_Operator {

	public static void main(String[] args) {
		
		// 산술연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num2 * num3;
		int rs4 = num4 / num3;
		int rs5 = num4 % num3; // 나머지
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		System.out.println("rs5 : "+rs5);
				
		// 증감, 감소연산자
		int num = 0;
		
		num++;
		++num;
		
		System.out.println("num : "+num);
		
		num--;
		--num;
		
		System.out.println("num : "+num);
				
		// 복합대입연산자
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		n1 += 3; // n1 = n1 + 1
		n2 -= 2; // n2 = n2 - 2
		n3 *= 3; // n3 = n3 * 3
		n4 /= 4; // n4 = n4 / 4
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println("n3 : "+n3);
		System.out.println("n4 : "+n4);			
		
		// 비교연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean r1 = var1 >  var2; // var1이 var2보다 크다.
		boolean r2 = var1 <  var2; // var1이 var2보다 작다.
		boolean r3 = var1 >= var2; // var1이 var2보다 크거나 같다.
		boolean r4 = var1 <= var2; // var1이 var2보다 작거나 같다.
		boolean r5 = var1 == var2; // var1이 var2보다 서로 같다.
		boolean r6 = var1 != var2; // var1이 var2보다 서로 다르다.
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		System.out.println("r5 : "+r5);
		System.out.println("r6 : "+r6);
		
		// 논리연산자
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = var3 > 2 && var4 > 3; 	// var3는 2보다 크고 그리고 var4는 3보다 크다.
		boolean res2 = var3 > 2 && var4 > 4; 	// var3는 2보다 크고 그리고 var4는 4보다 크다.
		boolean res3 = var3 > 2 || var4 > 4; 	// var3는 2보다 크고 또는 var4는 4보다 크다.
		boolean res4 = var3 > 4 || var4 > 5;	// var3는 4보다 크고 또는 var4는 5보다 크다.
		boolean res5 = !(var3 > var4);			// var3는 var4보다 크지 않다.
		
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);
		System.out.println("res3 : "+res3);
		System.out.println("res4 : "+res4);
		System.out.println("res5 : "+res5);
	}
}







