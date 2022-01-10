/*
 * 12948. 핸드폰 번호 가리기
 */

package programmers.level1.p12948;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "01033334444";
		String answer = "";

		for (int i = 0; i < s.length() - 4; i++)
			answer += "*";
		answer += s.substring(s.length() - 4, s.length());

		System.out.println(answer);
	}

}
