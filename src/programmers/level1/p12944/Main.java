/*
 * 12944. ��� ���ϱ�
 */

package programmers.level1.p12944;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = { 5, 4, 3 };
		Solution getMean = new Solution();

		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("��հ� : " + getMean.solution2(x));
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