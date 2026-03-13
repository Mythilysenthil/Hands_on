package ControlFlow;
import java.util.*;
public class ArmstrongNum {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter the 3 digit value :");
	  int num = in.nextInt();
	  
	  int c = num;
	  int sum=0;
      while(c > 0) {
		int digit = c %10;
		sum += digit*digit*digit;
	    c /= 10;
	  }
	  if(sum == num) {
		  System.out.println("Given number is Amstrong number");
	  }
	  else {
		  System.out.println("Given number is Not a Amstrong number");
	  }
	  in.close();
  }
}
