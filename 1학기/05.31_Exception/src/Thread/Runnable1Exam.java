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
		System.out.println("프로그램 시차");
		
		Top2 t = new Top2();
		Thread tnd  = new Thread(t);
	  //동시에 작업을 내부적으로 시켜준다. 
		tnd.start();
		Thread tnd2  = new Thread(t);
			tnd2.start();
		System.out.println("프로그램 종료");

	}

}
