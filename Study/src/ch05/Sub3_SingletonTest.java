package ch05;

/*
 * ³¯Â¥ : 2022/01/06
 * ÀÌ¸§ : ±èÃ¶ÇÐ
 * ³»¿ë : ÀÚ¹Ù ½Ì±ÛÅæ °´Ã¼ ½Ç½ÀÇÏ±â ±³Àç p185
 */
public class Sub3_SingletonTest {

	public static void main(String[] args) {

		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(2, 3);
		int r4 = c.div(4, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
	}
}
