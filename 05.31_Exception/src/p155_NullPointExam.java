
public class p155_NullPointExam {
// 실행하는 중에 발생하는 에러임
//	그 안에서 처리를 함 try-catch가 없으면 그냥 인셉션나고 죽어버리는데 하면 안죽음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		try {
			System.out.println("문자열:"+str.length());
		}
		catch (NullPointerException e) {
			System.out.println("불가능");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("완료");
		}

}
