/*
 * 12954. x만큼 간격이 있는 n개의 숫자
 */
package programmers.level1.p12954;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();

		System.out.println(s.solution(2, 5));
	}

}

class Solution {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long a = x;

		for (int i = 0; i < n; i++) {
			answer[i] = a;
			a += x;
		}

		return answer;
	}
}