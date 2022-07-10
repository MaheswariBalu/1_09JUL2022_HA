package week1.day1;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		if(n==0 || n==1)
		{System.out.println(n + " is not prime");
			}
		
		for (int i = 2; i <= n-1; i++){ {
			if (n%i==0) {
				System.out.println(n + " is not prime");
				break;
			} 		
			else
			{
				System.out.println(n + " is prime");
				break;
		}
		
		}
	
	}
	}
}

