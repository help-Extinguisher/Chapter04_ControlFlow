package training;

public class Test03 {
	public static void main(String[] args) {
		
		
//		1000���� �ڿ��� �߿��� 2�� ������� 7�� ����� ���� ����ϰ�
//		�� ������ �� ���� ����϶�
//		(while�� �̿�)
//	
//		-------------------------------------------------------------
//		
//		<���� �ϴٰ� ���Ѱ�>
		
//		int a = 1;
//		int b = 0;
//
//		while ((a%2) && (b%7)); {
//			System.out.println(a);
//			continue;
//		}
//		
//		
//		<������� ������>
		
		int a = 1;
		int b = 0;
		
		while(a <= 1000) {
			if ((a % 2) == 0 && (a % 7) == 0) {
				System.out.println(a);
				b += a;
			}
			a++;
		}
		
		System.out.println("���� : " + b);
		
		
	}

}
