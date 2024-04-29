package jieun;

public class Practic_003 {

	public static void main(String[] args) {
		
		
        for(int i = 0; i < 5; i++){
            for(int j = i; j < 5; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 
                for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = i; j < 5; j++){
                System.out.print("*");
            }
            for(int j = i+1; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
	}
        // 나머지 연산을 해보기        
                for(int i = 0; i < 5; i++){
                    for(int j = 0; j < i; j++){
                        System.out.print(" ");
                    }
                    for(int j = i; j < 5; j++){
                        System.out.print("*");
                    }
                    for(int j = i+1; j < 5; j++){
                        System.out.print("*");
                    }
                    System.out.println();
        	}        

	}
}
