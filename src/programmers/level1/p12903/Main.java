/*
 * 12903. ��� ���� ��������
 */

package programmers.level1.p12903;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345";

		if (s.length() % 2 == 0)// ¦��
			System.out.println(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));
		else
			System.out.println(s.substring(s.length() / 2, s.length() / 2 + 1));

	}

}
