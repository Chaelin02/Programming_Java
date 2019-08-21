import java.io.IOException;

public class ReadFromSysExam {

	public static void main(String[] args) {
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = System.in.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("입력실페");
				
		}
		System.out.write(b,0,len);

	}

}
