package javabasic;

public class Operator {
	public static void main(String[] args) {
	
		int i =100;
		int j = -i;
		
		int i2 = i + j;
		
		int i3 = i2==100? 100:0;
				
		int i4 =10;
		int i5 =20;
		
		System.out.println(i4+i5);
		System.out.println(i4%i5);
		
		int i6 =15;
		if (i6==15) {
			System.out.println("i6은 15입니다");
		}else {
				System.out.println("i6은 15가 아닙니다.");
				
		boolean b = false;
		System.out.println(b&true);
		System.out.println(b&false);
		System.out.println(b&false);
		System.out.println(b|false);
		System.out.println(b|true);
		
		// &&는 좌항이 false면 우항을 평가하지 않음, 전체가 false 되무로
		// ||는 좌 이 true 우황을 평가하지 않음 , 전체가 true 되므로
		System.out.println(b&&true);
		System.out.println(b&&false);
		System.out.println(b||false);
		System.out.println(b||true);
		
		
		}
		
		
		
		
		
		
		
		
}// main
}//class
