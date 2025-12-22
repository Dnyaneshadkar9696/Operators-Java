
public class Operatorday4 {
	
	public static void main(String[] args) {
		
		// This is the program to demonstrate the use of bitwise operators in java.
		
		// In bitwise we learn & and |
		
		int a = 4;
		System.out.println("*First guess answers in sequence.");
		a++;
		a += 3;
		--a;
		System.out.println(a++);
		a %= 2;
		System.out.println(a >> 3);
		System.out.println("Here only the calculation is done on a, the value is not assigned.");
		System.out.println(a+3);
		a++;
		System.out.println("The answer for the first guess: ");
		System.out.println(a);
		System.out.println(" ");
		
		int b = 6;
		System.out.println("*Second guess answers in sequence.");
		b--;
		b -= 2;
		++b;
		System.out.println(b--);
		b %= 3;
		System.out.println(b << 2);
		System.out.println("Here only the calculation is done on b, the value is not assigned.");
		System.out.println(b+4);
		b++;
		System.out.println("The answer for the second guess: ");
		System.out.println(b);
		System.out.println(" ");
		
		
		int e = 13;
		System.out.println("*Third guess answers in sequence.");
		e++;
		e += 4;
		--e;
		System.out.println(e++);
		e %= 4;
		System.out.println(e >> 2);
		System.out.println("Here only the calculation is done on e, the value is not assigned.");
		System.out.println(e+2);
		e++;
		System.out.println("The answer for the third guess: ");
		System.out.println(e);
		System.out.println(" ");
		
		
		
		int c = a & b;
		int d = a | b;
		System.out.println("The bitwise AND of a and b is: " + c);
		System.out.println("The bitwise OR of a and b is: " + d);
	    System.out.println("End of the program.");
		
	
	}

}
