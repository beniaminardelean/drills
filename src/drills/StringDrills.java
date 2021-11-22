package drills;

import java.util.HashMap;
import java.util.Map;

public class StringDrills {

	public static String reverse(String num) {
		if (num == null || num.isEmpty()) {
			return num;
		}
		String reverse = " ";
		for (int i = num.length() - 1; i >= 0; i--) {
			reverse = reverse + num.charAt(i);
		}
		return reverse;
	}
	
	public static void countDuplicateCharacters(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charArray = str.toCharArray();

		for (char c : charArray) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
}
