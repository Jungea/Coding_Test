/*
 * 12921. 소수 찾기
 */

package programmers.level1.p12921;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();

		System.out.println(s.solution2(10));
	}

}

class Solution {

	public int solution2(int n) {

		int answer = 0;

		int[] a = new int[n + 1];

		for (int i = 2; i < a.length; i++)
			a[i] = i;

		for (int i = 2; i < a.length; i++) {
			if (a[i] == 0) continue;

			for (int j = i * 2; j < n + 1; j *= i) {  // 배수들 표시
				a[j] = 0;
			}
		}

		for (int i = 2; i < a.length; i++)
			if (a[i] != 0)
				answer++;

		return answer;
	}

	// 시간초과
	public int solution(int n) {
		int answer = 0;
		int count = 0;

		for (int i = 2; i <= n; i++) {
			count = 0;

			for (int j = 2; j < i; j++) { // ; j <= (int) Math.sqrt(i) ;
				if (i % j == 0) {
					count += 1;
					break;
				}
			}

			if (count == 0)
				answer += 1;
		}

		return answer;
	}

}