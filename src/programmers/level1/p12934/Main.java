/*
 * 12934. 정수 제곱근 판별
 */

package programmers.level1.p12934;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();
		System.out.println(s.solution(121));
		System.out.println(s.solution(3));

	}

}

class Solution {
	public long solution(long n) {
        
        double sqrt = Math.sqrt(n);
        double x = (long) sqrt;
        
        if(sqrt == x)
        	return (long) Math.pow(x + 1, 2);
        
        return -1;
    }
}
