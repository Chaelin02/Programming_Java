import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFileExam {

	public static void main(String[] args) {
		//�����а� ��������
	
		FileReader fr ;
		try {
			//���� �а� ��������
			fr = new FileReader("src/dataw.txt");
			BufferedReader br = new BufferedReader(fr);
			//���� ����
				String s;
				while((s = br.readLine()) != null) {
				//ȭ�鿡 �������
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	
	}

}
