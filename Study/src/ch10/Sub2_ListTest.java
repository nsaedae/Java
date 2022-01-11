package ch10;

import java.util.ArrayList;
import java.util.List;

import ch09.Apple;

/**
 * 날짜 : 2022/01/11 
 * 이름 : 김철학
 * 내용 : 자바 컬렉션 리스트 실습하기 교재 p348
 */
public class Sub2_ListTest {

	public static void main(String[] args) {
		
		// List 생성
		List<Integer> list1 = new ArrayList<>();
		
		// List 데이터 저장
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(1, 3);
		
		System.out.println("list1 : "+list1);
		
		// List 크기
		System.out.println("list1 크기 : "+list1.size());
		
		// List 데이터 출력
		System.out.println("list1.get(0) : "+list1.get(0));
		System.out.println("list1.get(3) : "+list1.get(3));
		
		// List 반복문
		for(int n : list1) {
			System.out.print(n + ", ");
		}
		
		System.out.print("\n");
		
		// 문자열 리스트
		List<String> list2 = new ArrayList<>();
		list2.add("김유신");
		list2.add("김춘추");
		list2.add("장보고");
		list2.add("강감찬");
		list2.add("이순신");
		
		System.out.println("list2 : "+list2);
		
		// 객체 리스트
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("한국", 3000));
		list3.add(new Apple("미국", 2000));
		list3.add(new Apple("일본", 1000));
		
		System.out.println("list3 : "+list3);
		
		// 한국사과 출력
		Apple a1 = list3.get(0);
		a1.toString();
		
		// 미국사과 출력
		list3.get(1).toString();
		
		// 일본사과 출력
		list3.get(2).toString();
	}
}










