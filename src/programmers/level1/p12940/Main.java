/*
 * 12940. 최대공약수와 최소공배수
 * 
 */

package programmers.level1.p12940;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = new int[2];

		Solution s = new Solution();
		int n = 3, m = 12;

		answer[0] = s.gcd(n, m);
		answer[1] = n * m / answer[0];

		System.out.println(Arrays.toString(answer));
	}
}

class Solution {

	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}
