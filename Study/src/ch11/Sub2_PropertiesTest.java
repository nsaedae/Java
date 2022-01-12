package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * ��¥ : 2022/01/12
 * �̸� : ��ö��
 * ���� : �ڹ� ���� ����� �ǽ� ���� p496   
 */
public class Sub2_PropertiesTest {
	
	public static void main(String[] args) {
		
		//Map<String, String> map = new HashMap<>();
		
		// ������Ƽ(Properties) - Key, Value�� ���ڿ��� ������ ����ü 
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println("prop : "+prop);
		
		String path = "C:\\Users\\bigdata\\Desktop\\Fruit.properties";
		
		try {
			// ������Ƽ ��ü ����
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("������Ƽ ��ü ����Ϸ�...");
		
		
		try {
			// ������Ƽ ���� �б�(�ҷ�����)
			FileInputStream fis = new FileInputStream(path);
			
			Properties prop2 = new Properties();
			prop2.load(fis);
			
			System.out.println("prop2 : "+prop2);
			System.out.println("prop2�� A�� : "+prop2.getProperty("A"));
			System.out.println("prop2�� B�� : "+prop2.getProperty("B"));
			System.out.println("prop2�� C�� : "+prop2.getProperty("C"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("������Ƽ ���� �ҷ����� �Ϸ�...");
		
	}
}







