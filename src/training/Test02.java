package training;

public class Test02 {
	public static void main(String[] args) {
//		while문, do while문을 이용하여 1~100 출력하기
//		그리고 거꾸로 100~1 출력
	
		
//		< 내가 한거 >
		
//		int num = 1;
//		
//		while (num <= 100-1) {
//			System.out.println(num);
//			num++;
//		}
//		
//		while (num >= 0) {
//			System.out.println(num);
//			num--;
//		}
//	}
	
//	-------------------------------------------------
	
//		< 강사님의 모범답안 >
	
	int num = 1; 
	
	while (num <= 100) {
		System.out.println(num++);
	}
	
	do {
		System.out.println(--num);
	}
	
	while (num > 1);
	
	
	}
}

	


