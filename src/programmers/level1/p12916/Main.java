/*
 * 12916. 문자열 내 p와 y의 개수
 */

package programmers.level1.p12916;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pPoooyY";
		
		s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        System.out.println(count == 0);
        
        
		/*
		 * String[] s_arr = s.split("");
		 * 
		 * int pcount = 0, ycount = 0;
		 * 
		 * for (int i = 0; i < s_arr.length; i++) { switch (s_arr[i]) { case "p": case
		 * "P": pcount++; break;
		 * 
		 * case "y": case "Y": ycount++; break; } }
		 * 
		 * System.out.println(pcount == ycount);
		 */
	}

}
