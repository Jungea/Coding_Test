/*
 * 12932. 자연수 뒤집어 배열로 만들기
 */

package programmers.level1.p12932;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = 12345;

		String[] s = Long.toString(n).split("");

		int[] arr = new int[s.length];

		for (int i = 0; i < s.length; i++) {
			arr[i] = Integer.parseInt(s[s.length - i - 1]);
		}

		System.out.println(Arrays.toString(arr));

	}

}
