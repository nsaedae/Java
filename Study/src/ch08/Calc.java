package ch08;

public class Calc {

	private static Calc instance = new Calc(); 
	
	public static Calc getInstance() {
		return instance;
	}
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) throws Exception {
		
		if(x == 0) {
			Exception e1 = new Exception("x는 0이면 안됩니다.");
			throw e1;
		}
		
		if(y < 0) {
			Exception e2 = new Exception("y는 음수이면 안됩니다.");
			throw e2;
		}
		
		
		int z = x/y;
		
		return z;
	}
}
