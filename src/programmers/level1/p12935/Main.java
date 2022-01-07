/*
 * 12935. 제일 작은 수 제거하기
 */

package programmers.level1.p12935;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

class Solution {
	public int[] solution(int[] arr) {
		if (arr.length - 1 == 0)
			return new int[] { -1 };

		int minIndex = 0;
		int minValue = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minIndex = i;
				minValue = arr[i];
			}
		}

		int[] answer = new int[arr.length - 1];

		for (int i = 0, j = 0; i < arr.length; i++)
			if (i != minIndex)
				answer[j++] = arr[i];

		return answer;
	}
}