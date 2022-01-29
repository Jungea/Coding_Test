package programmers.level1.p42576;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] participant = new String[] { "leo", "kiki", "eden" };
		String[] completion = new String[] { "kiki", "eden" };

		Arrays.sort(participant);
		Arrays.sort(completion);

		int i;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i]))
				System.out.println(participant[i]);
		}

		System.out.println(participant[i]);

	}

	public void fail() {
		String[] participant = new String[] { "leo", "kiki", "eden" };
		String[] completion = new String[] { "kiki", "eden" };

		Arrays.sort(participant);
		String string_p = String.join("", participant);
		Arrays.sort(completion);
		String string_c = String.join("", completion);

		String result = "";
		for (int i = 0; i < string_c.length(); i++) {
			if (string_p.charAt(i) != string_c.charAt(i))
				result += string_p.charAt(i);
		}

		if (result.length() == 0)
			result = string_p.substring(string_c.length(), string_p.length());

		System.out.println(result);
	}

}
