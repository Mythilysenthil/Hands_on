package ControlFlow;
import java.util.*;
public class InternetBrowing {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter hours : ");
	  int hour = in.nextInt();
	  System.out.println("Enter mintues :");
	  int min = in.nextInt();
	  
	  if(hour > 7 || hour == 7 && min > 0) {
		  System.out.println("Browsing time cannot exceed more than 7 hours");
	  }
	  else {
		  if(hour == 5 && min == 0) {
			  System.out.println("Bill : 200");
		  }
		  else {
			  System.out.println("Bill : "+((hour*50)+(min*1)));
		  }
	  }
	  in.close();
  }
}
