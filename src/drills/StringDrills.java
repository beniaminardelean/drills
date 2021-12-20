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
	
	int num = 1347;
	boolean isPrime= true;{
	
	for(int i = 2; i<Math.sqrt(num);i++) {
		if(num % i ==0) {
			isPrime=false;
			break;
		}
		
		}
	
	if(isPrime) {
		System.out.println(num + " : is prime");
	}
	else {
		System.out.println("is not prime");
	}
		
}
	int n = 234;
	int temp= n;
	int r, sum= 0;{
	
	while(n>0) {
		r = n%10;
		n = n/10;
		sum = sum + r*r*r;
	}
	if(temp==sum) {
		System.out.println("is an armstrong number");
	}
	else {
		System.out.println("is not an armstrong number");
	}
	
}
}
