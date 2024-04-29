package jieun;

import java.util.Scanner;

public class Practic_002 {

	public static void main(String[] args) {
		System.out.println("첫 번째 프로그램입니다");

		System.out.println("Fun Programming!");
		System.out.println("TTTTTTTTTT\n"
				+ "TTTTTTTTTT\n"
				+ "    TT\n"
				+ "    TT\n"
				+ "    TT");
		System.out.println("kor\r90\n"
                +"mat\r80\n"
                +"eng\r100\n"
                +"sum\r270");
		
		System.out.println("-100");
		
		int t = -100;
		System.out.println(t);
		
		int i = 10;
		int i1 = 20;
		System.out.println(i);
		System.out.println(i1);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 num을 입력해주세요");
		int num = sc.nextInt();
		System.out.println("정수 num1을 입력해주세요");
		int num2 = sc.nextInt();
		int sum = num+num2;
		
		System.out.println("결과는"+sum+"입니다");
		
		
		int a = sc.nextInt();
		System.out.println(a);
		int b= sc.nextInt();
		System.out.println(b);
		
		int result = a-b;
		System.out.println(result);
		
		int q = sc.nextInt();
		int w = sc. nextInt();
		int e = sc. nextInt();
		
		int sum10 = q+w;
		int avg = sum10/2;
		System.out.println(sum10);
		System.out.println(avg);
		
	
	}
	

}
