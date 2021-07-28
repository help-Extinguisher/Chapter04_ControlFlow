package method;

import java.util.Scanner;

public class ControlFlow {
	public static void main(String[] args) {
		
		
//		오버 로딩에 관하여
		

		
		showDisplay();
		Scanner scan = new Scanner(System.in);
		
		
		add(1, 5);
		add(16, 2);
		
		add(1.5, 4.2);
		
		int result = add(1, 2);
		System.out.println(result);
		
	}

	private static void showDisplay() {
		System.out.println("---MENU---");
		System.out.println();
		System.out.print("1. 계좌등록\t2. 입금\t3. 출금\t4. 종료\n");
		System.out.println();
		
	}

	private static void add(double d, double e) {
		System.out.println(d + e); // 자료형마다 만들어줘야하는 것도 다르다.
		
	}

	private static int add(int i, int j) {
		System.out.println(i + j);
		return i + j;
		
	}

}



//double time = 0.0;
//
//while(time > 7 && time <= 21.0) {
//	
////1. 고객 들어옴 인사해야함
//System.out.println("안녕하시렵니까 고객님");
////2. 메뉴 보여주기
//System.out.println("메뉴입니다");
////3. 입력 (주문) 받기
//System.out.println("메뉴(의 코드) 입력 받았음");
////4. 주문받은 메뉴 제조
//System.out.println("만듬");
////5. 메뉴를 고객에게 전달
//System.out.println("전달함");
////6. 고객이 나감
//System.out.println("작별인사함");
//
//}
//
////메소드 (함수)를 사용한다 
////뭐시기(); 같은거 만들어놓고 콜하는 방식으로...
//