/*
 * 12937. 짝수와 홀수
 */

package programmers.level1.p12937;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 2;
		Solution s = new Solution();

		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println("평균값 : " + s.solution(x));
	}

}

class Solution {
	public String solution(int num) {
		return (num % 2 == 0) ? "Even" : "Odd";
	}
}
