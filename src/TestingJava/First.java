package TestingJava;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {

		System.out.println("Enter the number=");
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int rem;
        int original=n;
      while(n>0) {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
	}
        if(original==rev)
        {
        	System.out.println("Given number "+rev+" is palindrome");
        }
        else {
        	System.out.println("Given number "+rev+" is not palindrome");
        }
	}

}
