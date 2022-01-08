/*
 * 12918. 문자열 다루기 기본
 */

package programmers.level1.p12918;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.solution("1234"));
	}

}

class Solution {
	public boolean solution(String s) {
		if (s.length() != 4 && s.length() != 6)
			return false;

		try {
			Integer.parseInt(s);
			return true;

		} catch (NumberFormatException e) {
			return false;
		}
	}

	public boolean solution2(String s) {
		return s.matches("(^[0-9]{4}|{6}$)");
	}
}