
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ����ó�� {
	static ArrayList<����> ������ = new ArrayList<>();
	public static void main(String[] args) {
//		csv������ ,�Ǵ� Tap���� �����ϴ� �����Դϴ�. 
		//���� ����
		//���� ����
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while (( line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line,"\t");
				���� new���� = new ����();
				new����.setName(st.nextToken());
				new����.setAddress(st.nextToken());
				new����.setMath(Double.parseDouble(st.nextToken()));
				new����.setEnglish(Double.parseDouble(st.nextToken()));
				
				������.add(new����);
			} 
//    arraylist ��¹�
			for(���� a : ������) {
				System.out.println(a);
			}
			
//			for(int i = 0; i<������.size(); i++) {
//				System.out.println(������.get(i);
//			}  ���� for�� ��������.
			//��������
//			���Ͽ���
			FileWriter fw = new FileWriter("src/save.txt");
//			���ۿ���
			BufferedWriter bw = new BufferedWriter(fw);
//			����
			for(���� a:������) {
				bw.write(a.getName()+"\t"+a.getAddress()+"\t");
				bw.write(a.getName()+"\t"+a.getEnglish()+"\t");
				bw.write(a.getName()+"\t"+a.getAverage()+"\t");
				bw.newLine();
			}
			fr.close();
			fw.close();
			br.close();
			bw.close();
//			����
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