package programmers.level1.p87389;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int i;

		for (i = 2; i < n; i++) {
			if (n % i == 1)
				break;
		}
		System.out.println(i);
	}

}
