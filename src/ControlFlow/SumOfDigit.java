package ControlFlow;
import java.util.*;
public class SumOfDigit {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter a Number : ");
	  int num = in.nextInt();
	  int c = num;
	  int sum = 0, rev =0;
	  while(c > 0) {
		  rev = c % 10;
		  sum += rev;
		  c /= 10;
	  }
	  System.out.println("Sum of digits = "+sum);
	  in.close();
  }
}
