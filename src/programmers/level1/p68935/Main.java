package programmers.level1.p68935;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 45;

		String s = "";
		while (n > 0) {
			s += (n % 3);
			n /= 3;
		}

		System.out.println(s);

//		int answer = 0;
//		for (int i = 0; i < s.length(); i++)
//			answer += (Math.pow(3, s.length() - 1 - i) * Character.getNumericValue(s.charAt(i)));
//		System.out.println(answer);
		
		System.out.println(Integer.parseInt(s, 3));
	}

}
