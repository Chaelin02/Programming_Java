package school;
import java.util.*;

public class StudentNumberToMajor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�й��� �Է��ϼ���");
		
		String classNumber = sc.nextLine();  //�й��Է�
		
		
		if(classNumber.substring(0,1).equals("3")) {
			if(classNumber.substring(1,2).equals("1") || 
					classNumber.substring(1,2).equals("2")) {
				System.out.println("���ͷ�Ƽ�� �̵���");
			}
			else if(classNumber.substring(1,2).equals("3") ||
					classNumber.substring(1,2).equals("4")) {
				System.out.println("�� �̵�� �����ΰ�");
			}
			else if(classNumber.substring(1,2).equals("5") ||
					classNumber.substring(1,2).equals("6")) {
				System.out.println("�� �̵�� ���ַ�ǰ�");
			}			
		} else {
			if(classNumber.substring(1,2).equals("1") || 
					classNumber.substring(1,2).equals("2")) {
				System.out.println("���̵�� ����Ʈ�����");
			}
			else if(classNumber.substring(1,2).equals("3") ||
					classNumber.substring(1,2).equals("4")) {
				System.out.println("�� �̵�� ���ַ�ǰ�");
			}
			else if(classNumber.substring(1,2).equals("5") ||
					classNumber.substring(1,2).equals("6")) {
				System.out.println("�� �̵�� �����ΰ�");
			}			
		
		
		
	}

	}
}
