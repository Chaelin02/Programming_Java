package Thread;

public class SyncTest {
	public int num = 0;
	public int sum = 0;
//	synchronized �� �߰��� ���� ������� �������� �ʰ� �۾��Ѵ�. 
	public synchronized void IncreaseNumber() {
		num++;		//�а� ���°�	 //num = num+1
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
