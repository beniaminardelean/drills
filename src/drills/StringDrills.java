package drills;

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
}
