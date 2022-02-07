package programmers.level1.p86491;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sizes = new int[][] { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };

		int w = 0, h = 0;
//		int min = 0, max = 0;
		for (int i = 0; i < sizes.length; i++) {
//			min = Math.min(sizes[i][0], sizes[i][1]);
//			max = Math.max(sizes[i][0], sizes[i][1]);
//
//			w = max > w ? max : w;
//			h = min > h ? min : h;

			w = Math.max(w, Math.max(sizes[i][0], sizes[i][1]));
			h = Math.max(h, Math.min(sizes[i][0], sizes[i][1]));
		}

		System.out.println(w * h);
	}

}
