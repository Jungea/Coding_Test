/*
 * 12919. 서울에서 김서방 찾기
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
		
		System.out.println("김서방은 " + i + "에 있다");
	}

}
