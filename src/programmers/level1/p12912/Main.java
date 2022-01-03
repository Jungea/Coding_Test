/*
 * 12912. 두 정수 사이의 합
 */

package programmers.level1.p12912;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {

	// 등차수열의 합 공식
	public long solution3(int a, int b) {
		return sumAtoB(Math.min(a, b), Math.max(b, a));
	}

	private long sumAtoB(long a, long b) {
		return (b - a + 1) * (a + b) / 2;
	}

	public long solution2(int a, int b) {
		long answer = 0;

		int start = Math.min(a, b);
		int end = Math.max(a, b);

		for (int i = start; i <= end; i++) {
			answer += i;
		}

		return answer;
	}

	public long solution(int a, int b) {
		long answer = 0;

		int small, big;

		if (a <= b) {
			small = a;
			big = b;
		} else {
			small = b;
			big = a;
		}

		for (int i = small; i <= big; i++)
			answer += i;

		return answer;
	}
}