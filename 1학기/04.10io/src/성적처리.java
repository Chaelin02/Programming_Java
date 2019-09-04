
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 성적처리 {
	static ArrayList<성적> 성적들 = new ArrayList<>();
	public static void main(String[] args) {
//		csv파일은 ,또는 Tap으로 구분하는 파일입니다. 
		//파일 연결
		//버퍼 연결
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while (( line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line,"\t");
				성적 new성적 = new 성적();
				new성적.setName(st.nextToken());
				new성적.setAddress(st.nextToken());
				new성적.setMath(Double.parseDouble(st.nextToken()));
				new성적.setEnglish(Double.parseDouble(st.nextToken()));
				
				성적들.add(new성적);
			} 
//    arraylist 출력문
			for(성적 a : 성적들) {
				System.out.println(a);
			}
			
//			for(int i = 0; i<성적들.size(); i++) {
//				System.out.println(성적들.get(i);
//			}  위의 for와 같은거임.
			//파일저장
//			파일열기
			FileWriter fw = new FileWriter("src/save.txt");
//			버퍼열기
			BufferedWriter bw = new BufferedWriter(fw);
//			쓰자
			for(성적 a:성적들) {
				bw.write(a.getName()+"\t"+a.getAddress()+"\t");
				bw.write(a.getName()+"\t"+a.getEnglish()+"\t");
				bw.write(a.getName()+"\t"+a.getAverage()+"\t");
				bw.newLine();
			}
			fr.close();
			fw.close();
			br.close();
			bw.close();
//			닫자
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}