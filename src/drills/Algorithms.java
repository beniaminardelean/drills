package drills;

public class Algorithms {

	public int bigDiff(int[] nums) {
		int minim = nums[0];
		int maxim = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < minim) {
				minim = nums[i];
			}
			if (nums[i] > maxim) {
				maxim = nums[i];
			}
		}
		return maxim - minim;
	}

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6) {
			return true;
		} else if (nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}

	public String doubleChar(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result = result + str.charAt(i) + str.charAt(i);
		}
		return result;
	}

	public static int fib(int n) {
		int f[] = new int[n + 2];
		int i;

		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}

}
