/*
 * 12937. ¦���� Ȧ��
 */

package programmers.level1.p12937;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 2;
		Solution s = new Solution();

		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("��հ� : " + s.solution(x));
	}

}

class Solution {
	public String solution(int num) {
		return (num % 2 == 0) ? "Even" : "Odd";
	}
}
