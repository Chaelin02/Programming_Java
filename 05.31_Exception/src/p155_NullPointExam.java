
public class p155_NullPointExam {
// �����ϴ� �߿� �߻��ϴ� ������
//	�� �ȿ��� ó���� �� try-catch�� ������ �׳� �μ��ǳ��� �׾�����µ� �ϸ� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		try {
			System.out.println("���ڿ�:"+str.length());
		}
		catch (NullPointerException e) {
			System.out.println("�Ұ���");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("�Ϸ�");
		}

}
