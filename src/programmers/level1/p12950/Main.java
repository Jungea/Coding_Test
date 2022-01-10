/*
 * 12950. Çà·ÄÀÇ µ¡¼À
 */

package programmers.level1.p12950;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();

		System.out.println(s.solution(null, null));
	}

}

class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr1.length; i++)
			for (int j = 0; j < arr1[i].length; j++)
				answer[i][j] = arr1[i][j] + arr2[i][j];

		return answer;
	}
}