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
		System.out.println("프로그램 시차");
		Top d = new Top();
		Top d2 = new Top();
		d.start();    //동시에 작업을 내부적으로 시켜준다. 
		d2.start();
		System.out.println("프로그램 종료");
	}

}
