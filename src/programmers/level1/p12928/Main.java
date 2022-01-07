/*
 * 12928. 약수의 합
 */

package programmers.level1.p12928;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				answer += i;

				if (i != (n / i))
					answer += (n / i);
			}
		}

		return answer;
	}
}