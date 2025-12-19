
public class RelationalOp {
	
	public static void main(String[] args) {
		 // Today we learned Relational and Logical operators
		 // one by one example of each type is as follows.
		int a = 10;
		int b = 2;
		// we also have to give message in syso
		
		System.out.println("1) a is greater than b: " + (a > b));  // true
		System.out.println("2) a is less than b: " + (a < b));     // false
		System.out.println("3) a is greater than or equal to b: " + (a >= b)); // true
		System.out.println("4) a is less than or equal to b: " + (a <= b));    // false
		System.out.println("5) a is equal to b: " + (a == b));     // false
		
		System.out.println("6) a is not equal to b: " + (a != b)); // true
		
		// The logical operators are as follows:
		// dont use not, use only AND and OR
		System.out.println(" ");
		System.out.println("Logical Operators:");
		System.out.println("1) (a > b) AND (a != b): " + ((a > b) && (a != b))); // true	
		System.out.println("2) (a < b) OR (a == b): " + ((a < b) || (a == b)));   // false
		System.out.println("3) (a <= b) AND (a == b): " + ((a <= b) && (a == b))); // false
		System.out.println("4) (a >= b) AND (a <= b): " + ((a >= b) && (a <= b))); // false
		System.out.println("5) (a != b) OR (a == b): " + ((a != b) || (a == b)));   // true
		System.out.println("6) (a > b) AND (a < b): " + ((a > b) && (a < b))); // false
		System.out.println("7) (a > b) OR (a < b): " + ((a > b) || (a < b))); // true
		
		
	}

}
