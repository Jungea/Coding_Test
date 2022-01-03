/*
 * 12944. 평균 구하기
 */

package programmers.level1.p12944;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = { 5, 4, 3 };
		Solution getMean = new Solution();

		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println("평균값 : " + getMean.solution2(x));
	}

}

class Solution {
	public double solution2(int[] arr) {
		return (int) Arrays.stream(arr).average().orElse(0);
	}

	public double solution(int[] arr) {
		double answer = 0;

		for (int a : arr)
			answer += a;

		return answer / arr.length;
	}
}