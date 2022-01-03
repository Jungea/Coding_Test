/*
 * 12969. 직사각형 별찍기
 */

package programmers.level1.p12969;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

//		String s = new String(new char[n]).replace("\0", "*");

		StringBuilder base = new StringBuilder();
		StringBuilder builder = new StringBuilder();

		for (int i=0; i<n; i++)
			base.append("*");

		for (int i = 0; i < m; i++)
			builder.append(base + "\n");

		System.out.println(builder.toString());
	}

}
