/*
 * 12931. 자릿수 더하기
 */

package programmers.level1.p12931;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
	public int solution(int n) {
		int answer = 0;

		while (n > 0) {
			answer += (n % 10);
			n /= 10;
		}

		return answer;
	}
}