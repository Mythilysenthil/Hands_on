package ControlFlow;
import java.util.*;

public class TotalNoOfIteration {
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int totalCount = 0;
	   while (true) { 
		   System.out.print("Enter an integer: "); 
		   int num = in.nextInt(); 
		   if (num < 0) {
			   break; 
			   } 
		   for (int i = 0; i < num; i++) {
			   System.out.println("Hello"); 
			   totalCount++; 
			   } 
		   } 
	   System.out.println("Total number of Hello displayed = " + totalCount); 
	   in.close();   
	   }
  }

