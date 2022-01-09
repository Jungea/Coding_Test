/*
 * 72410. 신규 아이디 추천
 * 3~15자 소문자 숫자 -, _, .(처음끝x, 연속x)
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
		// 1. 소문자로
		new_id = new_id.toLowerCase();

		// 2. 소문자, 숫자, -, _, . 외 제거
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

		// 3. 연속 . 제거
		new_id = new_id.replaceAll("[.]+", "."); //

		// 4. 처음 끝 . 제거
		new_id = new_id.replaceAll("^[.]|[.]$", ""); // "(^\\.|\\.$)"

		// 5. 빈문자열 -> "a"
		if (new_id.isEmpty())
			new_id = "a";

		// 6. 15자로 마지막 . 제거
		if (new_id.length() > 15) {
			new_id = new_id.substring(0, 15);
			new_id = new_id.replaceAll("[.]$", "");
		}

		// 7. 길이 2이하 -> 마지막 글자 반복 길이3
		if (new_id.length() <= 2) {
			while (new_id.length() != 3) {
				new_id = new_id + new_id.substring(new_id.length() - 1);
			}
		}

		return new_id;
	}
}