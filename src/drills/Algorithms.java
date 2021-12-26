package drills;

import java.util.LinkedHashSet;
import java.util.Scanner;

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
				int year = 3600;{
				
				if(year % 400 ==0) {
					System.out.println("leap year");
				}
				else if(year % 4 ==0 && year % 100 !=0) {
					System.out.println("leap year");
				}
				
				else {
					System.out.println("not a leap year");
				}
				}
				{
				Scanner sc = new Scanner(System.in);
				  System.out.println("Enter a number :");
				  
				      int num1 = sc.nextInt();
				      int orgNum= num1;
				      int rev = 0;
				      
				      while(num1!= 0) {
				    	  rev = rev*10 + num1%10;
				    	  num1 = num1/10;
				      }
				      if(orgNum == rev) {
				    	  System.out.println(orgNum + " is a Polindorme");
				      }
				      else {
				    	  System.out.println(orgNum + " is not a Polinmdrome");
				      }
				}

				  int a[] = {5,2,6,8,6,7,5,2,8};
			      
				  {
			        removeDuplicates(a);
			    }
			
				  

				  
				    
				    public static void removeDuplicates(int[] a)
				    {
				        LinkedHashSet<Integer> set
				            = new LinkedHashSet<Integer>();
				  
				        
				        for (int i = 0; i < a.length; i++)
				            set.add(a[i]);
				        System.out.print(set);
				    }
				    {
					int number = 987654, reverse = 0 ; 
					while(number != 0)   
					{  
					int remainder = number % 10;  
					reverse = reverse * 10 + remainder;  
					number = number/10;  
					}  
					System.out.println("The reverse of the given number is: " + reverse);  
}
}
