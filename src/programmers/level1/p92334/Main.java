package programmers.level1.p92334;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] id_list = { "con", "ryan" };
		String[] report = { "ryan con", "ryan con", "ryan con", "ryan con" };
		int k = 3;

		// <신고당한 사람, 누가 신고>
		Map<String, Set<String>> reported_map = new HashMap<>();
		for (int i = 0; i < report.length; i++) {
			String[] r = report[i].split(" ");

			reported_map.putIfAbsent(r[1], new HashSet<String>());
			reported_map.get(r[1]).add(r[0]);
		}

		System.out.println(reported_map.entrySet());

		Map<String, Integer> id_map = new HashMap<>(); // <사람, 신고 처리 횟수>
		for (Entry<String, Set<String>> entry : reported_map.entrySet()) {

			Set<String> values = entry.getValue();
			if (values.size() >= k) { // 일정 신고 횟수 이상

				Iterator<String> it = values.iterator();
				while (it.hasNext()) {
					String v = it.next();
					Integer count = id_map.get(v);
					if (count == null)
						count = 0;
					count = count + 1;
					id_map.put(v, count);
				}

			}
		}

		int[] answer = new int[id_list.length];
		for (int i = 0; i < id_list.length; i++) {
			Integer v = id_map.get(id_list[i]);
			if (v != null)
				answer[i] = v;
		}

		System.out.println(id_map.entrySet());
		System.out.println(Arrays.toString(answer));

	}

}
