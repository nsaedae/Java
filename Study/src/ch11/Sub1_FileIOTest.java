package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 2022/01/12
 * 이름 : 김철학
 * 내용 : 자바 파일 입출력 실습 교재 p496   
 */
public class Sub1_FileIOTest {

	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdata\\Desktop\\Test1.txt";
		String path2 = "C:\\Users\\bigdata\\Desktop\\Test2.txt";
		
		try {
			// 파일과 스트림 연결
			FileInputStream  fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int value = 0;
			
			while(true) {
				
				// 입력 스트림으로 데이터 읽기
				value = fis.read();
				
				if(value == -1) {
					break; // 더 이상 읽을 데이터가 없을 경우 종료
				}
				
				// 출력 스트림으로 데이터 쓰기
				fos.write(value);				
			}
			
			// 스트림 연결 해제
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}	
}







