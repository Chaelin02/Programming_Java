package school;

import java.util.Scanner;

public class StudentNumber {
	 
 public static void main(String ar[]) {
	 String[] grade3 = {"인터랙티브미디어과" , "인터랙티브미디어과","뉴미디어디자인과",
				"뉴미디어디자인과","뉴미디어솔루션과","뉴미디어솔루션과"};
     String[] grade2 = {"뉴미디어소프트웨어과" , "뉴미디어소프트웨어과","뉴미디어웹솔루션과",
"뉴미디어웹솔루션과","뉴미디어디자인과","뉴미디어디자인과"};
	 Scanner sc = new Scanner(System.in);
	 String number  = sc.nextLine();
	 

	String classroomStr = number.substring(1,2);
	int classroom = Integer.parseInt(classroomStr)-1;
	System.out.println(grade2[classroom]);
	
	
 }
}
