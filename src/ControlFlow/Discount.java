package ControlFlow;
import java.util.*;
public class Discount {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter price per item : ");
	  int item = in.nextInt();
	  System.out.println("Enter quantity : ");
	  int quantity = in.nextInt();
	  
	  int amount = item*quantity;
	  System.out.println("Purchase amount : "+amount);
	  
	  if(amount > 500) {
		  System.out.println("Discount : "+(amount*0.15));
		  System.out.println("Total expenses : "+(amount-(amount*0.15)));
	  }
	  else {
		  System.out.println("Discount : 0");
		  System.out.println("Total expenses : "+(amount));
	  }
	  in.close();
	  
  }
}
