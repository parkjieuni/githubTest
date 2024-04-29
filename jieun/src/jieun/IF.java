package jieun;

import java.util.Iterator;
import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = "0";
		for (int i = 1; i < num; i++) {
			result = result + " " + i;
		}
		System.out.println(result);

	}

}
