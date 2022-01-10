/*
 * 12930. 이상한 문자 만들기
 */

package programmers.level1.p12930;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "try hello world";

		s = s.toLowerCase();
		String up = s.toUpperCase();
		int p = 0;

		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			if (p % 2 == 0)
				answer += up.charAt(i);
			else
				answer += s.charAt(i);

			p++;

			if (s.charAt(i) == ' ')
				p = 0;
		}

		System.out.println(answer);

	}

}
