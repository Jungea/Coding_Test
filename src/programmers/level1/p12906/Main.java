/*
 * 12906. 같은 숫자는 싫어
 */

package programmers.level1.p12906;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<>();

		s.add(5);
		s.add(5);
		s.add(4);
		s.add(5);
		s.add(5);
		s.add(5);

		System.out.println(s);

	}

}

class Solution {
	public int[] solution(int[] arr) {

		int size = arr.length;

		for (int i = arr.length - 1; i > 0; i--)
			if (arr[i] == arr[i - 1]) {
				arr[i] = -1;
				size--;
			}

		int[] answer = new int[size];
		int j = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != -1)
				answer[j++] = arr[i];

		return answer;
	}
}
