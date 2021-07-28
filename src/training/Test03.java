package training;

public class Test03 {
	public static void main(String[] args) {
		
		
//		1000이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고
//		그 수들의 총 합을 출력하라
//		(while문 이용)
//	
//		-------------------------------------------------------------
//		
//		<내가 하다가 망한거>
		
//		int a = 1;
//		int b = 0;
//
//		while ((a%2) && (b%7)); {
//			System.out.println(a);
//			continue;
//		}
//		
//		
//		<강사님의 모범답안>
		
		int a = 1;
		int b = 0;
		
		while(a <= 1000) {
			if ((a % 2) == 0 && (a % 7) == 0) {
				System.out.println(a);
				b += a;
			}
			a++;
		}
		
		System.out.println("총합 : " + b);
		
		
	}

}
