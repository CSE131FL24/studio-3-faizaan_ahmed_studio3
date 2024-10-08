package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Sieve of Eratosthenes!");
		System.out.print("What number would you like to choose ");
		int n = scanner.nextInt();
		
		 boolean prime[] = new boolean[n+1];
	        for(int i=0;i<=n;i++)
	            prime[i] = true;
	         
	        for(int p = 2; p*p <=n; p++)
	        {
	           
	            if(prime[p] == true)
	            {
	                
	                for(int i = p*p; i <= n; i += p)
	                    prime[i] = false;
	            }
	        } 
	        for(int i = 2; i <= n; i++)
	        {
	            if(prime[i] == true)
	                System.out.print(i + " ");
	        }
	}

}
