package programmers.level1.p77884;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int left = 24;
		int right = 27;

		int answer = 0;

		for (int i = left; i <= right; i++) {
			if (Math.sqrt(i) == (int) Math.sqrt(i))
				answer -= i;
			else
				answer += i;
		}

		System.out.println(answer);

	}

}
