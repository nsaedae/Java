package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜 : 2022/01/13
 * 이름 : 김철학
 * 내용 : 자바 데이터베이스 프로그래밍(JDBC) 실습하기 교재 p557
 */
public class Sub1_JDBCTest {
	public static void main(String[] args) {
		
		// JDBC 접속 테스트
		String host = "jdbc:mysql://54.180.160.240:3306/test";
		String user = "test";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!!!");
			}
			
			// 3단계 - Statement(SQL실행 객체) 생성
			// 4단계 - SQL실행
			// 5단계 - 결과처리(SELECT일 경우)
			// 6단계 - 데이터베이스 종료
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("JDBC 프로그램 종료...");		
	}
}
