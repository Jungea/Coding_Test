/*
 * 77484. 로또의 최고 순위와 최저 순위
 */

package programmers.level1.p77484;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Solution s = new Solution();

		System.out.println(
				Arrays.toString(s.solution2(new int[] { 44, 1, 0, 0, 31, 25 }, new int[] { 31, 10, 45, 1, 6, 19 })));

	}
}

class Solution {
	int[] rank = new int[] { 6, 6, 5, 4, 3, 2, 1 };

	public int[] solution2(int[] lottos, int[] win_nums) {
		int n = 0;
		int zero = 0;

		Arrays.sort(win_nums);
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				zero++;
				continue;
			}

			if (Arrays.binarySearch(win_nums, lottos[i]) >= 0)
				n++;
		}

//		System.out.println(n + " " + zero);
		int[] answer = { rank[n + zero], rank[n] };

		return answer;
	}

	public int[] solution(int[] lottos, int[] win_nums) {
		int n = 0;
		int zero = 0;

		Arrays.sort(lottos);
		for (int i = 0; i < win_nums.length; i++)
			if (Arrays.binarySearch(lottos, win_nums[i]) >= 0)
				n++;

		for (int i = 0; i < lottos.length; i++)
			if (lottos[i] == 0)
				zero++;

		System.out.println(n + " " + zero);
		int[] answer = { rank[n + zero], rank[n] };

		return answer;
	}
}