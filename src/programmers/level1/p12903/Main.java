/*
 * 12903. 가운데 글자 가져오기
 */

package programmers.level1.p12903;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345";

		if (s.length() % 2 == 0)// 짝수
			System.out.println(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));
		else
			System.out.println(s.substring(s.length() / 2, s.length() / 2 + 1));

	}

}
