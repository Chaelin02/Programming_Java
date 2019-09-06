package gugudan;
//2019-03-15

import java.util.*;

public class gugudan {

	public static void main(String[] args) {

	/*	while (true) {
			System.out.println("==============================");
			System.out.println("(1,13,5,7,9)멤버 수를 입력하세요");
			// 입력받자
			Scanner sc = new Scanner(System.in);

			int member;
			member = sc.nextInt();

			if (member == 5) {
				System.out.println("itzy");
			}

			else if (member == 7) {
				System.out.println("BTS");
			}

			else if (member == 9) {
				System.out.println("EXO");
			}

			else if (member == 1) {
				System.out.println("IU");
			} 
			else if (member == 13) {
				System.out.println("Seventen");
			} 
			else {
				System.out.println("이 수의 멤버가 없습니다.");
			break;
			}

		}*/
		
		Scanner sc = new Scanner(System.in);
		int member;
		System.out.println("(1,13,5,7,9)멤버 수를 입력하세요");
		for (int i=0;;  i++) {
			member = sc.nextInt();

			if (member == 5) {
				System.out.println("itzy -이어서 입력");
			}

			else if (member == 7) {
				System.out.println("BTS -이어서 입력");
			}

			else if (member == 9) {
				System.out.println("EXO -이어서 입력");
			}

			else if (member == 1) {
				System.out.println("IU -이어서 입력");
			} 
			else if (member == 13) {
				System.out.println("Seventen -이어서 입력");
			} 
			else {
				System.out.println("이 수의 멤버가 없습니다.");
			break;
			}
		}

	}

}
