package Thread;
class Top2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i<50; i++) {
			System.out.print(i+"\t");
		}		
	}
}
public class Runnable1Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		Top2 t = new Top2();
		Thread tnd  = new Thread(t);
	  //���ÿ� �۾��� ���������� �����ش�. 
		tnd.start();
		Thread tnd2  = new Thread(t);
			tnd2.start();
		System.out.println("���α׷� ����");

	}

}
