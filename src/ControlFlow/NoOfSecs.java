package ControlFlow;
import java.util.*;
public class NoOfSecs {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter the number of days in a week : ");
	  int days = in.nextInt();
	  System.out.println("Seconds in a week : " +(86400*days));
	  
	  in.close();
  }
}
