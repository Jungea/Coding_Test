package programmers.level1.p76501;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] absolutes = { 4, 7, 12 };
		boolean[] signs = { true, false, true };

		int answer = 0;
		for (int i = 0; i < absolutes.length; i++)
			answer += (signs[i] ? absolutes[i] : -absolutes[i]);

		System.out.println(answer);
	}

}
