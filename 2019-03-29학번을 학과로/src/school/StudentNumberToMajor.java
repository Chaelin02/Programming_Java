package school;
import java.util.*;

public class StudentNumberToMajor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요");
		
		String classNumber = sc.nextLine();  //학번입력
		
		
		if(classNumber.substring(0,1).equals("3")) {
			if(classNumber.substring(1,2).equals("1") || 
					classNumber.substring(1,2).equals("2")) {
				System.out.println("인터랙티브 미디어과");
			}
			else if(classNumber.substring(1,2).equals("3") ||
					classNumber.substring(1,2).equals("4")) {
				System.out.println("뉴 미디어 디자인과");
			}
			else if(classNumber.substring(1,2).equals("5") ||
					classNumber.substring(1,2).equals("6")) {
				System.out.println("뉴 미디어 웹솔루션과");
			}			
		} else {
			if(classNumber.substring(1,2).equals("1") || 
					classNumber.substring(1,2).equals("2")) {
				System.out.println("뉴미디어 소프트웨어과");
			}
			else if(classNumber.substring(1,2).equals("3") ||
					classNumber.substring(1,2).equals("4")) {
				System.out.println("뉴 미디어 웹솔루션과");
			}
			else if(classNumber.substring(1,2).equals("5") ||
					classNumber.substring(1,2).equals("6")) {
				System.out.println("뉴 미디어 디자인과");
			}			
		
		
		
	}

	}
}
