package Thread;
class Top extends Thread {

	@Override
	public void run() {
		for(int i =0; i<50; i++) {
			System.out.print(i+"\t");
		}
	}
	
}
public class ThreadExam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		Top d = new Top();
		Top d2 = new Top();
		d.start();    //���ÿ� �۾��� ���������� �����ش�. 
		d2.start();
		System.out.println("���α׷� ����");
	}

}
