package Thread;

public class SyncTest {
	public int num = 0;
	public int sum = 0;
//	synchronized 의 중간에 들어가는 내용들은 끊어지지 않고 작업한다. 
	public synchronized void IncreaseNumber() {
		num++;		//읽고 쓰는거	 //num = num+1
		sum = sum+num;
	}
	public void IncreaseNumber2() {
		synchronized (this) {
			num++;
		}
		sum = sum + num;	
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
