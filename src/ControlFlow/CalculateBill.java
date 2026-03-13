package ControlFlow;
import java.util.*;
public class CalculateBill {
  public static void main(String[]args) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter number of pages : ");
	  int page = in.nextInt();
	  System.out.println("Enter number of copies : ");
	  int copy = in.nextInt();
	  
	  int typing = page*3;
	  System.out.println("Typing charges : "+typing);
	  
	  int printing;
	  if(copy == 1) {
		  printing = page*1;
	  }else {
		  printing = (page*1)+(page*3*(copy-1));
	  }
	  System.out.println("Printing charges : "+printing);
	  System.out.println("Total Bill : "+(typing+printing));
	  in.close();
  }
}
