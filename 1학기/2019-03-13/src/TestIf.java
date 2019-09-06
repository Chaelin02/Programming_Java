

public class TestIf {

	public static void main(String[] args) {
		int member = 1;
		
		/*if (member == 5) {
			System.out.println("itzy");
		}

		else if(member == 7) {
			System.out.println("BTS");
		}

		else if(member == 9) {
			System.out.println("EXO");
		}

		else if(member == 1) {
			System.out.println("IU");
		}
		else if(member == 13) {
			System.out.println("Seventen");
		}*/
		
	/*	switch문
	 * switch (member) {
		case 5:
			System.out.println("itzy");
			break;
		case 9:
			System.out.println("EXO");
			break;
		case 7:
			System.out.println("BTS");
			break;
		case 1:
			System.out.println("IU");
			break;
		case 13:
			System.out.println("Seventen");
			break;
		*/
		
		 /*int dan=2;
		for (int i = 2; i <= 9; i++) {
			System.out.println(dan +" x "+ i + " = " +dan*i);			
		}
	 */
	/* 
		int i = 1;
		while( i <= 9) {  //조건식
			System.out.println( 2 +" * "+ i +" = "+ 2*i   );
				i++;  //증감식
		} while문
*/
		//for-each문
		System.out.println("=========================");
//		System.out.println(4);
		int arr[] = new int[] {5,7,9,1,13};
		for (int a : arr) {
			System.out.println(a+"");
			member = a;
			if (member == 5) {
				System.out.println("itzy");
			}

			else if(member == 7) {
				System.out.println("BTS");
			}

			else if(member == 9) {
				System.out.println("EXO");
			}

			else if(member == 1) {
				System.out.println("IU");
			}
			else if(member == 13) {
				System.out.println("Seventen");
		}
		
	}

	}
}
