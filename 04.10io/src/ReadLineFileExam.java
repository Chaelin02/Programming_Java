import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFileExam {

	public static void main(String[] args) {
		//버퍼읽게 연결하자
	
		FileReader fr ;
		try {
			//파일 읽게 연결하자
			fr = new FileReader("src/dataw.txt");
			BufferedReader br = new BufferedReader(fr);
			//한줄 읽자
				String s;
				while((s = br.readLine()) != null) {
				//화면에 출력하자
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	
	}

}
