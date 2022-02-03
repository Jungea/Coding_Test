package programmers.level1.p12926;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println((int) 'a');

		int n = 25;
		String s = "Z z";

		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			int c = (int) s.charAt(i);

			if (c == 32)
				answer += ' ';

			else {
				int sum = c + n;

				answer += (char) ((65 <= c && c <= 90 && sum <= 90) || (97 <= c && c <= 122 && sum <= 122) ? sum
						: sum - 26);

			}
		}

		System.out.println(answer);

	}

}
