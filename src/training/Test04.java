package training;

public class Test04 {
	public static void main(String[] args) {
//		
//		�ڿ��� 1���� ������ ��� Ȧ���� ���Ͽ� 
//		�� ���� ���� �������� 1000�� �Ѿ����, 
//		�׸��� 1000�� �Ѿ ���� ������ ���϶�
//		(while��, break�� ���)
		
//		--------------------------------------------
		
//		<������� ������>
		
		int a = 0;
		int b = 1;
		
		while(true) {
			// Ȧ��, ���� 1000���� Ŭ��
			if(b%2 != 0); {
				a+=b;
			}
			// ���� 1000
			if (a > 1000) {
				System.out.println(b + " ���Ҷ� 1000�� �Ѵ´�");
				System.out.println("�ʰ��� �� " +  a +  "�̴�");
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


