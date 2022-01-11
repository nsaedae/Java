package ch10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch09.Apple;

/**
 * 날짜 : 2022/01/11 
 * 이름 : 김철학
 * 내용 : 자바 컬렉션 맵(Map) 실습하기 교재 p372
 */
public class Sub4_MapTest {

	public static void main(String[] args) {
		
		// Map 생성
		Map<String, String> map1 = new HashMap<>();
		map1.put("A", "Apple");
		map1.put("B", "Banana");
		map1.put("C", "Cherry");
		
		System.out.println("map1 : "+map1);
		
		// Map 크기
		System.out.println("map1 크기 : "+map1.size());
		
		// Map 출력
		System.out.println("map1 키A : "+map1.get("A"));
		System.out.println("map1 키B : "+map1.get("B"));
		System.out.println("map1 키C : "+map1.get("C"));
		
		// Map 응용
		List<Map<Integer, Apple>> mapList = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 2000));
		m1.put(103, new Apple("일본", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2000));
		m2.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("태국", 3000));
		m3.put(302, new Apple("대만", 2000));
		m3.put(303, new Apple("홍콩", 1000));

		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		
		// 한국사과 출력
		Map<Integer, Apple> appleMap = mapList.get(0);
		
		Apple apple  = appleMap.get(101);
		
		apple.toString();
		
		// 호주사과 출력(Method Chaining)
		mapList.get(1).get(203).toString();
		
		// 대만사과 출력
		mapList.get(2).get(302).toString();
		
	}
}
