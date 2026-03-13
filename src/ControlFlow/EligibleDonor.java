package ControlFlow;
import java.util.*;

public class EligibleDonor {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter the age : ");
	  int age = in.nextInt();
	  System.out.println("Enter the weight : ");
	  int weight = in.nextInt();
	  
	  if(age > 18 && age < 55 && weight > 45) {
		  System.out.println("Eligible to donate blood!");
	  }else {
		  System.out.println("Not eligible to donate blood!");
	  }
	  in.close();
  }
}
