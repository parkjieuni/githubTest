package javabasic;

import java.util.Iterator;

public class StringExer {

	public static void main(String[] args) {
		// 3일차
		
		// 리터널
		String str1 = "안녕하세요";
		
		
		// constructor 생성자 방식
		char[]charArray = {'안','녕','하','세','요'};
		
		String str2 = new String(charArray);
		
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
		
		// 한번만 사용되는 변수는 생성하지 않는 것이 좋은 코드
		String str4 = "Hi There";
		System.out.println(str4);
		
		// 위의 코드를 한번만 사용할시 변수를 만들지 않는다\
		System.out.println("Hi There");
		
		
		// for : 구문을 사용해서 배열의 요소 (element)들을 출력
		for(char ch : charArray) {
			System.out.println(ch);
		}
		
		
		// 변수의 생성단계
		// 선언 Declaration : 변수의 타입을 지정(메모리 크기 지정)
		int i;
		// i 는 main 메소드 내에서 선언 도니 지역 변수 입ㅁ으로 main 밖에서는 사용할 수 없다
		// i 는 main 메소드의 지역변수이므로 초기화 후에만 사용할 수 있다.
		//System.out.println("선언 후 ": i);
		// 초기화 Initiaalization: 변수에 값을 처음 할당(대입,저장)
		/*
		i = 100;
		System.out.println("초기화 후": i);
		//할당 : 초기화한 후 변수에 값을 저장
		
		i = 200;
		
		System.out.println("할당 후  ": i);
		에러가 뜸*/
		
		//문자열 조작
		String str5 = "안";
		String str6 = "녕";
		String str7 = "하";
		String str8 = "세";
		String str9 = "요";
		System.out.println(str5+str6+str7+str8+str9);
		
		
		// 문자열은 불면이므로 문자열에 접합연산(+)을 많이하면 불피요한 
		// 문자열들이 메모리 생성됨
		//StringBuffer 또는 SrtringBuilder를 사용해서 문자열 조작없음
		// 버퍼상에서 진행하고 진행하고 최종적으로 문자열 한번만 생성
		
		StringBuilder sb = new StringBuilder();
		sb.append("안");
		sb.append("녕");
		sb.append("하");
		sb.append("세");
		sb.append("요");
		System.out.println(sb.toString());
		
		// String 주요 메소드
		String str10 = "동해물과 백두산이 마르고 닳도록";
		System.out.println(str10.charAt(5)); // 백
		System.out.println(str10.contains("백"));
		System.out.println(str10.endsWith("하느님이"));
		
		
		byte[]byteArray = str10.getBytes();
		for(byte b : byteArray) {
			System.out.println((char)b);
		}
		
		System.out.println(str10.getBytes());
		
		System.out.println(str10.hashCode());
		System.out.println("동해물과 백두산이 마르고 닳도록".hashCode());
		
		
		System.out.println(str10.indexOf("산"));//7
		System.out.println(str10.indexOf("마르고"));
		System.out.println(str10.isEmpty());//false
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
	}
}


		


