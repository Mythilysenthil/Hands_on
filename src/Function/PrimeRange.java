package Function;
import java.util.*;
public class PrimeRange {
	static boolean isPrime(int num) { 
		if (num <= 1) return false; 
		for (int i = 2; i <= Math.sqrt(num); i++) { 
			if (num % i == 0) return false; 
		} 
		return true; 
	}
	static void printPrimes(int x, int y) { 
		if (x > y) { 
			System.out.println("Provide valid input"); 
			return; 
		} 
		for (int i = x; i <= y; i++) { 
			if (isPrime(i)) {
				System.out.print(i + " "); 
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		printPrimes(x,y);
		in.close();
	}

}
