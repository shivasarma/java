package hackerRankPractise;

import java.util.*;
public class PrimeNumber {
	
	public static boolean isPrime(int i) {
		int k;
		boolean caze = true;
		if(i == 1)
			caze = false;
		
		for(k=1; k<i ;k ++) {
			
			if(i % k == 0 )
			{
				caze = false;
				break;
			}
			
		
	}
		return caze;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long start = System.currentTimeMillis();
		while(n-- > 0) {
			int k = sc.nextInt();
			System.out.println(isPrime(k) ? "Prime" : "Not Prime");
		}
		long Duration = System.currentTimeMillis() - start;
		System.out.println(Duration);

	}

}
