import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//		��õ��	 100.0 	100.0   total average
//		��õ��	 100.0 	100.0		total average
//		���ֺϱ� 	 70.0 	80.0		total average
//		���Ǳ� 	 30.0	 20.8		total average
		
public class SungDatasExam {

	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String csvStr = "";  //��� ���� \t�� ������ String
			String tmpStr = "";   //���� �б�� �ӽ�  String
			while((tmpStr = br.readLine()) != null ) {
				csvStr += tmpStr + "\t";
			}
//			System.out.println(csvStr);
		StringTokenizer parse = new StringTokenizer(csvStr,"\t");
		int length = parse.countTokens()/4;
		String[] name = new String[length];
		String[] adress = new String[length];
		double[] math = new double[length];
		double[] english = new double[length];
		double[] total = new double[length];
		double[] avg = new double[length];
		for(int i = 0; i < length; i++) {
			name[i] = parse.nextToken();
			adress[i] = parse.nextToken();
			math[i] = Double.parseDouble(parse.nextToken());
			english[i] = Double.parseDouble(parse.nextToken());
			//total,avg �������
			
			total[i] = math[i] + english[i];
			avg[i] = total[i] / 2;			
		}
		for(int i=0; i<length; i++) {
		System.out.println("�̸�:"+name[0]+" , "+"�ּ�:"+adress[0]+" ,  ����:"+math[0]
							+" , ����:"+english[0]+" , ����:"
							+total[0]+" , ���:"+avg[0]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
