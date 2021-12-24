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
	
	{
	  System.out.println("Permutation Count: " + permute("abcdg"));

		}
			
			 
			  public static int permute(String s) {
			    if (s == null) return 0;
			    return permute("", s);
			  }
			 
			  private static int permute(String c, String r) {
		
			    if (r.length() == 0) {
			      System.out.println(c);
			      return 1;
			    }
			 
			   
			    int sum = 0;
			    for (int i = 0; i < r.length(); ++i) {
			      sum += permute(c + r.charAt(i), 
			        r.substring(0, i) + r.substring(i + 1));
			    }
			    return sum;
			  

		}
}
