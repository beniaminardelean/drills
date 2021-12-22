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
	{
	System.out.println(factorial(7));
	System.out.println(factIterative(10));
}
			public static int factorial (int n) {
				if(n==1) {
					return 1;
				}else {
					return n * factorial(n-1);
				}
			}
			
			  static int factIterative(int number) {
			        int factorial = 1;
			        for (int iNumber = 1; iNumber <= number; iNumber++) {
			            factorial = factorial * iNumber;
			        }
			        return factorial;
	

			  }
			  {
				System.out.println(gcd(10,5));

				}
				static int gcd(int a, int b)
				{
				  if(a == 0 || b == 0) return a+b; // base case
				  return gcd(b,a%b);
				}
}
