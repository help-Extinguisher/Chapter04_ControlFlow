package method;

import java.util.Scanner;

public class ControlFlow {
	public static void main(String[] args) {
		
		
//		���� �ε��� ���Ͽ�
		

		
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
		System.out.print("1. ���µ��\t2. �Ա�\t3. ���\t4. ����\n");
		System.out.println();
		
	}

	private static void add(double d, double e) {
		System.out.println(d + e); // �ڷ������� ���������ϴ� �͵� �ٸ���.
		
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
////1. �� ���� �λ��ؾ���
//System.out.println("�ȳ��Ͻ÷ƴϱ� ����");
////2. �޴� �����ֱ�
//System.out.println("�޴��Դϴ�");
////3. �Է� (�ֹ�) �ޱ�
//System.out.println("�޴�(�� �ڵ�) �Է� �޾���");
////4. �ֹ����� �޴� ����
//System.out.println("����");
////5. �޴��� ������ ����
//System.out.println("������");
////6. ���� ����
//System.out.println("�ۺ��λ���");
//
//}
//
////�޼ҵ� (�Լ�)�� ����Ѵ� 
////���ñ�(); ������ �������� ���ϴ� �������...
//