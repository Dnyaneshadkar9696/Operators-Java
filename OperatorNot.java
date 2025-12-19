
public class OperatorNot {

	// Not & Increment and Decrement Operator
	
	// The not operator (!) is a logical operator that inverts the boolean value of an expression.
	
	public static void main(String[] args) {
		
		int a = 4;
		int b = 5;
		
		System.out.println("Use of Not operator is as follows: ");
		System.out.println(" ");
		System.out.println( "1) a is not greater than b: " + !(a > b));  // true
		System.out.println( "2) a is smaller than b: " + !(a < b)); // false 
		System.out.println(" ");
		System.out.println("Answer based on above problems is as follows: ");
		System.out.println(" ");
	
		System.out.println( "1) " + !(2 < 4 && 4 < 8 || 5==5 && 8 > 4 || !(3 > 5))); // false
		System.out.println( "2) " + !(5 > 10 || 10 < 20 && !(15 == 15) || 20 > 25)); // true
		System.out.println( "3) " + !((3 < 6 && 6 > 9) || 4 == 4 && !(7 < 5) || 8 > 10)); // false
		System.out.println( "4) " + !((1 + 1 == 2) && (2 + 2 == 5) || !(3 * 3 == 9) || (4 - 4 == 0))); // false
		
		// Increment and Decrement operator
		// ++i is pre increment , here the value will be incremented on it position
		// i++ here the previous value will be printed , it is Post increment and for next i the added value will be printed.
		System.out.println(" ");
		System.out.println("Increment and Decrement Operator:");
		System.out.println("");
		 int c = 8;
		 int d = 12;
		 
		 c++; // here the value will be incremented 
		 d--; // here the value will be decremented.
		 System.out.println("Using the increment operator value of c is: : " + c++);
		 System.out.println("Value of d after using decrement operator value of d is:  " + d);
		 System.out.println("++c is : " + ++c);
		 System.out.println("--d is : " + --d);
		 d++;
		 System.out.println("Value of d after using post increment operator is: " + d);
		
		
	}

}
