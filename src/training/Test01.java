package training;

public class Test01 {
	public static void main(String[] args) {
	
//		---------------------------------------------------------------
//		
//		if 하나만 써서 해보기 (문제)
//		int num = 120;
//		if(num > 0) {
//			if((num%2) == 0) {
//				System.out.println("양수인 동시에 짝수");
//			}
//		}
		
//		if 하나만 써서 해보기 (정답 예시)
//		int num = 120;
//		if(num > 0 && num%2 == 0); {
//				System.out.println("양수인 동시에 짝수");
//				
//				
//		----------------------------------------------------------------
		
		
//		<switch 문으로 바꿔보기 (문제)>
		
//		int n = 24;
//		
//		if(n >= 0 && n < 10) {
//			System.out.println("0이상 10미만의 수");
//				
//			}
//		else if (n >= 10 && n < 20) {
//			System.out.println("10이상 20미만의 수");
//		}
//		else if (n >= 20 && n < 30) {
//			System.out.println("20이상 30미만의 수");
//		}
//		else {
//			System.out.println("음수 혹은 30이상의 수");
//		}
//		
		
		
		
//		<switch문으로 바꿔보기 (정답 예시) >
		
		int n = (int)(Math.random()*100);
		System.out.println(n);
		
		int num = n / 10;
		System.out.println(num);
		
		switch(num) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
			break;
			
	}
	}
}

//		혼자 해보기 (안됐다)....................
		
//		int n = 24;

//		switch(n) {
//		
//		case 0: case 1: case 2: case 3: case 4: case 5: 
//		case 6: case 7: case 8: case 9: case 10: 
//			
//			break;
//		
//		
//		}
//		
//		if(n >= 0 && n < 10) {
//			System.out.println("0이상 10미만의 수");
//			
//		}
//		else if (n >= 10 && n < 20) {
//			System.out.println("10이상 20미만의 수");
//		}
//		else if (n >= 20 && n < 30) {
//			System.out.println("20이상 30미만의 수");
//		}
//		else {
//			System.out.println("음수 혹은 30이상의 수");
//		}
//		}
//		
//		
//	}














