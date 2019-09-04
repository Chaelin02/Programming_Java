package Thread;
class Top3 implements Runnable{

	@Override
	public void run() {
	for(int i=0; i<30; i++) {
		System.out.println((Thread.currentThread()).getName()+i+"\t");
	}
		
	}
	
}
public class Runnable3Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시차");
		Top3 t = new Top3();
		Thread tnd1  = new Thread(t,"a");
		Thread tnd2  = new Thread(t,"b");
		tnd1.setPriority(Thread.MAX_PRIORITY);
		tnd2.setPriority(Thread.MAX_PRIORITY);
		tnd1.start();
		tnd2.start();
		System.out.println(tnd1.getPriority());
		System.out.println(tnd2.getPriority());

		System.out.println("프로그램 종료");

	}

}
