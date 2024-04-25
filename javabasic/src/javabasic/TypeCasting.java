package javabasic;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		/*표현범위가 작은 타입에서 표현범위가 큰 타입으로 형변환은 데이터 손실가능성이 없다
   		그러므로 묵시적( 자동) 형변환이 된다*/
		byte b = 100;
		int i =(int)b;
		// int 생략가능
		
		/*표현범위가 큰 타입에서 표현범위가 작은 타입으로 형변환 데이터 손실 가능성이 있다.
		그러므로 명시적(강제)으로 형변환 해줘야함*/
		
		int i2 = 2100000000;
		byte b2= (byte)i2; 
		// 컴파일타입에러
		
	//nt i3 = 100 / 0;
		// 실행해야 하는 에레 
		
		System.out.println(i);
		System.out.println(b2);
		
		// boolean 타입은 다른타입과 형변환 x
		// booleana 
		// 
	
	}

}
