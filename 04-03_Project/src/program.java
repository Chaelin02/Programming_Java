import java.util.StringTokenizer;

public class program {

	public static void main(String[] args) {
		String line;
		String tmpStr = "hong ��걸 10.5 20.5";
		StringTokenizer parse = new StringTokenizer(tmpStr);
		String name, address;
		double math, english, total, avg;
		name = parse.nextToken();
		address = parse.nextToken();
//		math = Double.valueOf(parse.nextToken()).doubleValue();
		math = Double.parseDouble(parse.nextToken());  //�����Ŷ� �Ȱ���. ���������� �ٲٴ¹� = parse��¼��
//		english = Double.valueOf(parse.nextToken()).doubleValue();
		english = Double.parseDouble(parse.nextToken());
		total = math + english;
		avg = total / 2.0;
		System.out.println(name+"\t"+address+"\t"+math+"\t"+english+"\t"+total+"\t"+avg);
		
//		��ū���� �ɰ��� �ְ� �������ε� �ɰ��°� ����.
		String[] arrstr = tmpStr.split(" ");
		for(String str : arrstr) {
			System.out.println(str +"\t");
		}
	}

}
