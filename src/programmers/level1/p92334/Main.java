package programmers.level1.p92334;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;

		// <신고당한 사람, 누가 신고>
		Map<String, List<String>> reported_map = new HashMap<>();
		for (int i = 0; i < report.length; i++) {
			String[] r = report[i].split(" ");

			reported_map.putIfAbsent(r[1], new ArrayList<String>());
			reported_map.get(r[1]).add(r[0]);
		}

		Map<String, Integer> id_map = new HashMap<>(); // <사람, 신고 처리 횟수>
		for (Entry<String, List<String>> entry : reported_map.entrySet()) {

			List<String> values = entry.getValue();
			if (values.size() >= k) { // 일정 신고 횟수 이상

				for (int i = 0; i < values.size(); i++) { // 신고 처리 횟수 표시
					Integer count = id_map.get(values.get(i));
					if (count == null)
						count = 0;
					count = count + 1;
					id_map.put(values.get(i), count);
				}

			}
		}

		System.out.println(reported_map.entrySet());

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
