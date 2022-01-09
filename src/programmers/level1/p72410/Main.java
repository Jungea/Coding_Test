/*
 * 72410. �ű� ���̵� ��õ
 * 3~15�� �ҹ��� ���� -, _, .(ó����x, ����x)
 */

package programmers.level1.p72410;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();

		String id = "...!@BaT#*..y.abcdefghijklm";

		System.out.println(id);

		String answer = s.solution(id);
		System.out.println(answer);
	}

}

class Solution {
	public String solution(String new_id) {
		// 1. �ҹ��ڷ�
		new_id = new_id.toLowerCase();

		// 2. �ҹ���, ����, -, _, . �� ����
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

		// 3. ���� . ����
		new_id = new_id.replaceAll("[.]+", "."); //

		// 4. ó�� �� . ����
		new_id = new_id.replaceAll("^[.]|[.]$", ""); // "(^\\.|\\.$)"

		// 5. ���ڿ� -> "a"
		if (new_id.isEmpty())
			new_id = "a";

		// 6. 15�ڷ� ������ . ����
		if (new_id.length() > 15) {
			new_id = new_id.substring(0, 15);
			new_id = new_id.replaceAll("[.]$", "");
		}

		// 7. ���� 2���� -> ������ ���� �ݺ� ����3
		if (new_id.length() <= 2) {
			while (new_id.length() != 3) {
				new_id = new_id + new_id.substring(new_id.length() - 1);
			}
		}

		return new_id;
	}
}