package javabasic;

public class ArrayExer2 {

	public static void main(String[] args) {
		
		// 다시 풀어보기
		//실습1  1~100까지의 정수를 배열에 담아 출력
		 int [] intArray = new int[100];
		 int intArrayLeng = intArray.length;
		 for(int i = 0; i<intArrayLeng; i++) {
			 intArray[1] = i+1;
			 System.out.println(intArray[i]);
		 }
		 
		
		
		//실습 2  1~100까지의 정수중 홀수 배열에 담아 출력
		
		 int [] intArray2 = new int[50];
		 int intArrayLeng2 = intArray2.length;
		 for(int i = 0; i<intArrayLeng; i++) {
			 intArray2[i] = i*2+1;
			 System.out.println(intArray2[i]);
		 }

		 
		
		//실습 3  아래의 데이터로 2차원 배열을 만들어 출력
		// 		이름    국어   영어  수학
		// 		홍길동   100   90   90
		//		강감찬   90	80  70
		// 		이순신   80   70  60  
		 
		 //System.out.printf("%10d %10.2f %10\s ", 99999,3.1454555555555556."hello");
		 
		 String[]nameArr = {"홍","강","이"};
		 int[][]scoreArr = {
				 {100,90,90},
				 {90,80,70},
				 {80,70,60}
		 };
		 
		 int nameArrayLeng =nameArr.length;
		 int scoreArRLeng = scoreArr.length;
		 for(int i = 0; i<nameArrayLeng; i++){
			 System.out.printf("\n%10s",nameArr[i]);
			 for(int j = 0; j<nameArrayLeng; j++){
				 System.out.printf("\n%10s",nameArr[j]);
		 }
		 }

		 
		
		//실습 4 개인별 / 과목별 총적과 평균을 실습3에 추가해 출력
		 
		 
		 
		 
		 
		
		 
		 
		 
	}

}
