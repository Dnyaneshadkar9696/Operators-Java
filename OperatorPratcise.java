
public class OperatorPratcise {
	
//	practise of bitwise operator.
	public static void main(String[] args) {
		
		int a = 13;
		int b = 19;
		
		int c = a&b;
		int d = a|b;
		System.out.println(c);
		System.out.println(d);
		
		// we also learned the shift operator 
		// >> right shift
		// << left shift
		
		int e = a >> 3; // it is like shifting 13 for 3 values right.
		int f = b << 2; // it is like shifting 19 for 2 values left.
		System.out.println("The right shift result: " + e);
		System.out.println("The left shift result: " + f);
	}

}
