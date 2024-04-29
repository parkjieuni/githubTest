package javabasic;

import java.util.Iterator;

public class StringExer {

	public static void main(String[] args) {
		// 3일차
		
		// 리터널
		String str1 = "안녕하세요";
		
		// constructor 생성자 방식
		char[]charArry = {'안','녕','하','세','요'};
		String str2 = new String(charArry);
		
		System.out.println(str1);
		System.out.println(str2);
		
		// 문자열의 인덱스(index)/길이(length)
		// 인덱스 = 0~ lenght-1
		String str3 = "Hello Java";// 인덱스 0~9. 랭스 10
		System.out.println(str3.charAt(0));//H
		System.out.println(str3.charAt(5));//공백문자
		System.out.println(str3.length());//10
		
		// 반복문 
		// 성능이 좋은 코드를 위해서 동일한 결과를 내는 메소드(기능은) 한번만 수행해서 변수에
		// 값을 담아두고 변수를 사용하는 것이 반복적으로 메소드를 호출하지 않는 좋은 코드
		int leng = str3.length();// 성능이 좋은 코드를 위해서
		for(int i = 0; i<str3.length(); i++) {
			System.out.println(str3.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
	}
}


		


