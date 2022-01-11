package programmers.level1.p12933;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = 118372;

		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr, Collections.reverseOrder());
		String s = String.join("", arr);

//		System.out.println(Long.parseLong(new StringBuilder(s).reverse().toString()));
		System.out.println(Long.parseLong(s));

	}

}
