package programmers.level1.p86051;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[] { 1, 2, 3, 4, 6, 7, 8, 0 };

		int sum = 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;

		for (int i = 0; i < numbers.length; i++)
			sum -= numbers[i];

		System.out.println(sum);
	}

}
