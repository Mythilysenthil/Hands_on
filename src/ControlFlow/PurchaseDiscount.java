package ControlFlow;
import java.util.*;
public class PurchaseDiscount {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter Price : ");
	  double price = in.nextInt();
	  System.out.println("Enter Quantity : ");
	  int quantity = in.nextInt();
	  
	  double purchase = price*quantity;
	  double discount;
	  
	  if(purchase > 1000) {
		  discount = purchase*0.10;
	  }else {
		  discount = purchase*0.05;
	  }
	  System.out.println("Purchase Amount : "+purchase);
	  System.out.println("Discount Amount: "+discount);
	  System.out.println("Paid Amount : "+(purchase-discount));
	  in.close();
  }
}
