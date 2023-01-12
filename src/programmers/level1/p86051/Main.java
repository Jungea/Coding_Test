package programmers.level1.p86051;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[] { 1, 2, 3, 4, 6, 7, 8, 0 };

		System.out.println(solution(numbers));
	}

	private static int kds(int[] numbers) {
		int answer = 0;

		Arrays.sort(numbers);
		int max = numbers[numbers.length-1];

		for (int i = 0, j = 0; i < max; i++) {
			if (i != numbers[j]) {
				answer += i;
			} else {
				j++;
			}
		}

		for (int i = max + 1; i < 10; i++) {
			answer += i;
		}

		return answer;
	}

	private static int jea(int[] numbers) {
		int sum = 0;

		boolean[] n = new boolean[10];  // 최대
		for (int i : numbers) {
			n[i] = true;
		}

		for (int i=0; i<n.length; i++) {
			if (!n[i]) {
				sum += i;
			}
		}

		return sum;
	}

	/**
	 * 0 ~ 9가 1번 나온다 라는 전제 조건
	 * @param numbers
	 * @return
	 */
	private static int solution(int[] numbers) {

		int sum = 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;

		for (int i = 0; i < numbers.length; i++)
			sum -= numbers[i];

		return sum;
	}

}
