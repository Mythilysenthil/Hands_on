package ControlFlow;
import java.util.*;
public class LuckyNum {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter the car no: ");
	  int num =in.nextInt();
	  
	  int c = num, sum = 0;
	  int len = String.valueOf(c).length();
	  if(len == 4) {
		  while(c > 0) {
			  int digit  = c % 10;
			  sum += digit;
			  c /= 10;
		  }
		  if((sum % 3==0)||(sum % 5==0)||(sum %7==0)) {
			  System.out.println("Lucky Number");
		  }else {
			  System.out.println("Sorry it’s not my lucky number");
		  }
	  }
	  else {
		  System.out.println(num+" is not a valid car number");
	  }
	  in.close();
  }
}
