import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//		금천구	 100.0 	100.0   total average
//		양천구	 100.0 	100.0		total average
//		광주북구 	 70.0 	80.0		total average
//		관악구 	 30.0	 20.8		total average
		
public class SungDatasExam {

	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String csvStr = "";  //모든 내용 \t로 연겱한 String
			String tmpStr = "";   //한줄 읽기용 임시  String
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
			//total,avg 계산하자
			
			total[i] = math[i] + english[i];
			avg[i] = total[i] / 2;			
		}
		for(int i=0; i<length; i++) {
		System.out.println("이름:"+name[0]+" , "+"주소:"+adress[0]+" ,  수학:"+math[0]
							+" , 영어:"+english[0]+" , 총점:"
							+total[0]+" , 평균:"+avg[0]);
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
