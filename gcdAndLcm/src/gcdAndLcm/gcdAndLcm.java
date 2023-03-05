package gcdAndLcm;

import java.util.Scanner;
public class gcdAndLcm {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Please input 2 Numbers.");
	 
	 System.out.print("input First Numbers: ");
	 int firstNUM = scan.nextInt();
	 System.out.print("input Second Numbers: ");
	 int secondNUM = scan.nextInt();
	 
	 
	 System.out.println("");
	 solutionGCD(firstNUM,secondNUM);
	 int i = theGCD(firstNUM,secondNUM);
	 System.out.print("The GCD of ("+firstNUM+", "+ secondNUM +") is: "+ i);
	 
	}
	
	//For the solution
	static void solutionGCD(int firstNUM, int secondNUM) {
		int rem = 1;
		while(rem!=0) {
			int quotient = firstNUM / secondNUM; 
		    rem = firstNUM % secondNUM;  
		    System.out.println(firstNUM + " = "+ secondNUM+" ("+quotient+") +"+rem);    
			firstNUM = secondNUM;
			secondNUM = rem;
		}
	}
	
		//For the GCD
		static int theGCD(int firstNUM , int secondNUM) {	
			        if (firstNUM == 0)
			            return secondNUM;
			 
			        return theGCD(secondNUM % firstNUM, firstNUM);
			    }
		 
}


