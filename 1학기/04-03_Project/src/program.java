import java.util.StringTokenizer;

public class program {

	public static void main(String[] args) {
		String line;
		String tmpStr = "hong 용산구 10.5 20.5";
		StringTokenizer parse = new StringTokenizer(tmpStr);
		String name, address;
		double math, english, total, avg;
		name = parse.nextToken();
		address = parse.nextToken();
//		math = Double.valueOf(parse.nextToken()).doubleValue();
		math = Double.parseDouble(parse.nextToken());  //위에거랑 똑같음. 더블형으로 바꾸는법 = parse어쩌고
//		english = Double.valueOf(parse.nextToken()).doubleValue();
		english = Double.parseDouble(parse.nextToken());
		total = math + english;
		avg = total / 2.0;
		System.out.println(name+"\t"+address+"\t"+math+"\t"+english+"\t"+total+"\t"+avg);
		
//		토큰으로 쪼갤수 있고 포문으로도 쪼개는거 가능.
		String[] arrstr = tmpStr.split(" ");
		for(String str : arrstr) {
			System.out.println(str +"\t");
		}
	}

}
