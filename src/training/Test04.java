package training;

public class Test04 {
	public static void main(String[] args) {
//		
//		자연수 1부터 시작한 모든 홀수를 더하여 
//		그 합이 몇을 더했을때 1000을 넘어서는지, 
//		그리고 1000을 넘어선 값은 얼마인지 구하라
//		(while문, break문 사용)
		
//		--------------------------------------------
		
//		<강사님의 모범답안>
		
		int a = 0;
		int b = 1;
		
		while(true) {
			// 홀수, 합이 1000보다 클것
			if(b%2 != 0); {
				a+=b;
			}
			// 합이 1000
			if (a > 1000) {
				System.out.println(b + " 더할때 1000을 넘는다");
				System.out.println("초과된 값 " +  a +  "이다");
				break;
			}
			
			b++;
		}
		
		
		
//		int a = 1;
//		int b = 0;
//		
//		while(a%3)
//		
//		while (a < 1000) {
//			System.out.println(a);
//			a++; }
//				if (a%3 > 1000) {
//					break;
//				}
//		}
//	
	
	
//	----------------------------------------------------
		
		

		
		
		
		
		
		
//		for (int a = 1; a > 1000; a++  ) {
//			if(a%3 != 0) {
//				continue;
//			}
//		}
//		
//		System.out.println(a);
//		
		
	}
}


