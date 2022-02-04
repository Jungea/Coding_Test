package programmers.level1.p12901;

public class Main {

	public static void main(String[] args) {

		int a = 5;
		int b = 24;

		String[] day = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		int[] month_num = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String answer = "";

		int sum = 0;
		for (int i = 0; i < a - 1; i++)
			sum += month_num[i];

		sum += b;

		System.out.println(sum);
		System.out.println(day[sum % 7]);

	}

}
