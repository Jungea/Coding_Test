/*
 * 12917. ���ڿ� ������������ ��ġ�ϱ�
 */

package programmers.level1.p12917;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Zbcdefg";

		String[] a = s.split("");
		Arrays.sort(a, (n, m) -> m.compareTo(n));
		System.out.println(String.join("", a));
	}

}
