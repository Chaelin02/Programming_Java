import java.util.*;

public class class3 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		/*
		 * int user; System.out.println("당신은 몇반입니까?"); user = sc.nextInt(); if (user ==
		 * 3) { System.out.println("3반 여러분 안녕 ~ 궁금한 번호를 적어봐용"); int bun = sc.nextInt();
		 * switch (bun) { case 1: System.out.println("1번 강지민"); break; case 2:
		 * System.out.println("2번 강혜정"); break; case 3: System.out.println("3번 김가영");
		 * break; case 4: System.out.println("4번 김나영"); break; case 5:
		 * System.out.println("5번 김선옥"); break; case 6: System.out.println("6번 김수진");
		 * break; case 7: System.out.println("7번 류정민"); break; case 8:
		 * System.out.println("8번 박교령"); break; case 9: System.out.println("9번 서남경");
		 * break; case 10: System.out.println("10번 오승연"); break; case 11:
		 * System.out.println("11번 원예린"); break; case 12: System.out.println("12번 원채린");
		 * break; case 13: System.out.println("13번 이서현"); break; case 14:
		 * System.out.println("14번 이채린"); break; case 15: System.out.println("15번 이현수");
		 * break; case 16: System.out.println("16번 임현진"); break; case 17:
		 * System.out.println("17번 장유경"); break; case 18: System.out.println("18번 장원이");
		 * break; case 19: System.out.println("19번 한다연"); break; default:
		 * System.out.println("그 번호의 사람은 없슴당 ㅠ"); break; } else if(user == 4){
		 * System.out.println("4반은 없어요!"); } }
		 */
////		for(;;) 가 포문의 무한반복
//		String[] 반3 = { "강지민", "강혜정", "김가영", "김나영", "김선옥", "김수진", "류정민", "박교령", "서남경", "오승연", "원예린", "원채린", "이서현",
//				"이채린", "이현수", "임현진", "장유경", "장원이", "한다연" };
//		System.out.println("번호를 입력하세요 이름을 알려드립니다.");
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			int number = sc.nextInt();
////			1 < =number <=18
//
//			if (1 <= number && number <= 반3.length) {
//				System.out.println(반3[number - 1]);
//			} else {
//				break;
//			}
	//	}

		String[] 반3 = { "강지민", "강혜정", "김가영", "김나영", "김선옥", "김수진", "류정민", "박교령", "서남경", "오승연", "원예린", "원채린", "이서현",
		"이채린", "이현수", "임현진", "장유경", "장원이", "한다연" };
		//for (int i = 0; i < 반3.length; i++) {
		//	System.out.println(반3[i]);
		//}
		//for-each문
				for (String name : 반3) {
			System.out.println(name);
		}
		
	}
}
