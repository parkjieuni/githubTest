package javabasic;


//개인과제
		/* 과제명 : 배열로또
		 * 제출 마감일 : 5월 6화
		 * 과제설명 : 배열을 이용해서 로또 645를 이용해서 프로그램을 작서하세요
		 * 프로세스
		 * 1. 프로그램 시작시 사용장에게 7개의 서로다른 1~45 사이의 숫자를 입력받는다
		 * 2.프로그램에서 랜덤한 숫자를 순서대로 7개 추축
		 * 3.등수 산정
		 * -앞에나온 6개와 사용자가 입력한 순서대로 6개가 일치하면 1등
		 * - 프로그램에서 추출한 앞 숫자 6개와 사용자가 입력한 순서대로 5개가 일치하고 보너스 숫자(맨마지막 입력)가 일치하면 2등
		 * - 프로그램에서 추출한 앞 숫자 5개와 사용자가 입력한 순서대로 5개가 일치하면 3등
		 * - 프로그램에서 추출한 앞 숫자 4개와 사용자가 입력한 순서대로 4개가 일치하면 3등
		 * - 프로그램에'서 추출한 앞 숫자 3개와 사용자가 입력한 순서대로 3개가 일치하면 3등
		 * - 나머지는 "꽝~!\ 다음기회에"*
		 * 
		 * 
		 * 5. 중요 고려사항 
		 * - 사용자가 입력한 7개의 숫자에 중복이 있는지 체크, 중복이 있다면 다시 입력받도록
		 * - 프로그램에서 랜덤하게 생선한 7개의 숫자에 중복이 없어야 ㅎ낟
		 * - 사용자 입력 수와 랜덤 수와 비교해서 등수 연산 후 출력
		 * 예시
		 *  1123456 입력시 중복숫자가 있습니다 디시 입력해주세요 
		 *  
		 * 
		 */

public class ArrayLotto {

	public static void main(String[] args) {
		//  Math.random() : 0.0 <= 랜덤실수 <1.0
		//System.out.println((int)+1Math.random()*45)+1):1~45중 랜덤한 정수 
		// 중복제거가 안된 7개의 1부터 45
		
		for(int i = 0 ; i<7;  i++) {
			System.out.println((int)(Math.random()*45)+1);
		}
		

	}

}