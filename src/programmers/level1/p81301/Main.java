/*
 * 81301. 숫자 문자열과 영단어
 */
package programmers.level1.p81301;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();

		s.solution("1zerotwozero3");
	}

}

class Solution {
	String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

	public int solution(String s) {

		s = s.replaceAll("zero", "0");
		s = s.replaceAll("one", "1");
		s = s.replaceAll("two", "2");
		s = s.replaceAll("three", "3");
		s = s.replaceAll("four", "4");
		s = s.replaceAll("five", "5");
		s = s.replaceAll("six", "6");
		s = s.replaceAll("seven", "7");
		s = s.replaceAll("eight", "8");
		s = s.replaceAll("nine", "9");

		return Integer.parseInt(s);
	}
}