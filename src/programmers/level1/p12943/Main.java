package programmers.level1.p12943;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 16;

		int answer = 0;

		while (num != 1) {
			if (answer == 500)
				break;

			answer++;

			if (num % 2 == 0)
				num /= 2;
			else
				num = num * 3 + 1;

		}

		if (answer == 500)
			answer = -1;

		System.out.println(answer);

	}

}
