package ch09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2022/01/10
 * 이름 : 김철학
 * 내용 : 자바 기타 내장클래스(API) 실습 교재 p311 ~ 323
 */
public class Sub4_EtcAPITest {

	public static void main(String[] args) {
		
		// Math 클래스
		System.out.println("올림값 1.2 : "+Math.ceil(1.2));
		System.out.println("올림값 1.8 : "+Math.ceil(1.8));
		System.out.println("내림값 1.2 : "+Math.floor(1.2));
		System.out.println("내림값 1.8 : "+Math.floor(1.8));
		System.out.println("반올림 1.2 : "+Math.round(1.2));
		System.out.println("반올림 1.8 : "+Math.round(1.8));
		
		double num1 = Math.random();
		System.out.println("num1 : "+num1); // 0~1사이에 임의의 실수
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+num2); // 0~10사이에 임의의 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3); // 1~10사이에 임의의 정수
		
		double result = Math.ceil(Math.random() * 45);
		System.out.println("임의의 수 : "+result);
		
		// Date 클래스
		Date date = new Date();
		System.out.println("date : "+ date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(date);
		
		System.out.println("now : "+now);
		
		// Calendar 클래스
		Calendar cal = Calendar.getInstance();
		
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int dt    = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min  = cal.get(Calendar.MINUTE);
		int sec  = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d", year, month, dt, hour, min, sec);
		
		
		
		
		
		
	}
	
}
