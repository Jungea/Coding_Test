
/*
 * 12922. 수박수박수박수박수박수
 */

package programmers.level1.p12922;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();

		System.out.println(s.solution(5));

		char[] a = new char[] { '1', '2' };
		System.out.println(a);

	}

}

class Solution {
	public String solution2(int n) {
		return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
	}

	public String solution(int n) {

		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < n; i++)
			answer.append(i % 2 == 0 ? '수' : '박');

		return answer.toString();
	}
}