/*
 * 12919. ���￡�� �輭�� ã��
 */

package programmers.level1.p12919;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] seoul = { "Jane", "Kim" };
		
//		int x = Arrays.asList(seoul).indexOf("Kim");
		
		int i = 0;
		while (i < seoul.length) {
			if (seoul[i].equals("Kim"))
				break;
			i++;
		}
		
		System.out.println("�輭���� " + i + "�� �ִ�");
	}

}
