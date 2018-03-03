package pack1;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        System.out.println("num! = " + factorial(num));
		
		
	}
	public static long factorial(long number)
	{
	    // base condition - if the number is 0 or 1, return 1
	    if (number <= 1)
	        return 1;
	    else
	    {
	        // recursive call to get the factorial again
	        return number * factorial(number - 1);
	    }
	}

}
