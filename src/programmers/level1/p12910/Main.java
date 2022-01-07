/*
 * 12910. 나누어 떨어지는 숫자 배열
 */

package programmers.level1.p12910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();

		System.out.println(Arrays.toString(s.solution(new int[] { 5, 9, 7, 10 }, 5)));
		System.out.println(Arrays.toString(s.solution(new int[] { 2, 36, 1, 3 }, 1)));
		System.out.println(Arrays.toString(s.solution(new int[] { 3, 2, 6 }, 10)));

	}

}

class Solution {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<>();

		for (int num : arr)
			if (num % divisor == 0)
				list.add(num);

		Collections.sort(list);

		if (list.size() == 0)
			list.add(-1);

		return list.stream().mapToInt(i -> i).toArray();
	}
}