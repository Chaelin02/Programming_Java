
public class p151_tryCatch {

	public static void main(String[] args) {
		String[] irum = new String[3];
		irum[0] = "이채린";
		irum[1] = "원채린";
		irum[2] = "박교령";
		try {
		for(int i = 0; i<= irum.length; i++) {
			System.out.println(irum[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("익셉션");
		} finally {
			System.out.println("무조건 실행입니다.");
		}
	}
//bounds=넓은지역 
//	i<= irum.length; 하면  에러뜸. 방이3개인데 3개만 나오라고해서
}
