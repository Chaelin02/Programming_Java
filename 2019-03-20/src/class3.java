import java.util.*;

public class class3 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		/*
		 * int user; System.out.println("����� ����Դϱ�?"); user = sc.nextInt(); if (user ==
		 * 3) { System.out.println("3�� ������ �ȳ� ~ �ñ��� ��ȣ�� �������"); int bun = sc.nextInt();
		 * switch (bun) { case 1: System.out.println("1�� ������"); break; case 2:
		 * System.out.println("2�� ������"); break; case 3: System.out.println("3�� �谡��");
		 * break; case 4: System.out.println("4�� �質��"); break; case 5:
		 * System.out.println("5�� �輱��"); break; case 6: System.out.println("6�� �����");
		 * break; case 7: System.out.println("7�� ������"); break; case 8:
		 * System.out.println("8�� �ڱ���"); break; case 9: System.out.println("9�� ������");
		 * break; case 10: System.out.println("10�� ���¿�"); break; case 11:
		 * System.out.println("11�� ������"); break; case 12: System.out.println("12�� ��ä��");
		 * break; case 13: System.out.println("13�� �̼���"); break; case 14:
		 * System.out.println("14�� ��ä��"); break; case 15: System.out.println("15�� ������");
		 * break; case 16: System.out.println("16�� ������"); break; case 17:
		 * System.out.println("17�� ������"); break; case 18: System.out.println("18�� �����");
		 * break; case 19: System.out.println("19�� �Ѵٿ�"); break; default:
		 * System.out.println("�� ��ȣ�� ����� ������ ��"); break; } else if(user == 4){
		 * System.out.println("4���� �����!"); } }
		 */
////		for(;;) �� ������ ���ѹݺ�
//		String[] ��3 = { "������", "������", "�谡��", "�質��", "�輱��", "�����", "������", "�ڱ���", "������", "���¿�", "������", "��ä��", "�̼���",
//				"��ä��", "������", "������", "������", "�����", "�Ѵٿ�" };
//		System.out.println("��ȣ�� �Է��ϼ��� �̸��� �˷��帳�ϴ�.");
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			int number = sc.nextInt();
////			1 < =number <=18
//
//			if (1 <= number && number <= ��3.length) {
//				System.out.println(��3[number - 1]);
//			} else {
//				break;
//			}
	//	}

		String[] ��3 = { "������", "������", "�谡��", "�質��", "�輱��", "�����", "������", "�ڱ���", "������", "���¿�", "������", "��ä��", "�̼���",
		"��ä��", "������", "������", "������", "�����", "�Ѵٿ�" };
		//for (int i = 0; i < ��3.length; i++) {
		//	System.out.println(��3[i]);
		//}
		//for-each��
				for (String name : ��3) {
			System.out.println(name);
		}
		
	}
}
