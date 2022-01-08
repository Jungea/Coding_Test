/*
 * 68644. 두개 뽑아서 더하기
 */

package programmers.level1.p68644;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<>();
		int[] numbers = { 2, 1, 3, 4, 1 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j)
					set.add(numbers[i] + numbers[j]);
			}
		}

		int[] answer = new int[set.size()];

		Iterator<Integer> it = set.iterator();
		int i = 0;
		while (it.hasNext())
			answer[i++] = it.next();

		System.out.println(Arrays.toString(answer));
	}

}
