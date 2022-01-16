package programmers.level1.p82612;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.solution(3, 20, 4));
	}

}

class Solution {
	public long solution(int price, int money, int count) {
		long answer = money - reride(price, count);
		return answer < 0 ? Math.abs(answer) : 0;
	}

	/*
	 * price : 가격 current : 현재 이용 횟수 want : 원하는 이용 횟수
	 */
	public long reride(long price, long count) {
		if (count == 0)
			return 0;
		return (price * count) + reride(price, count - 1);
	}
}