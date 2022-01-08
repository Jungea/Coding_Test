/*
 * 12915. 문자열 내 마음대로 정렬하기
 */
package programmers.level1.p12915;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;
		Arrays.sort(strings, (a, b) -> {
			int first_condition = a.substring(n, n + 1).compareTo(b.substring(n, n + 1));
			if (first_condition != 0)
				return first_condition;
			else
				return a.compareTo(b);
		});
		System.out.println(Arrays.toString(strings));
	}

}
