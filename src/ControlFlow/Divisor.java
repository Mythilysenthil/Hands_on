package ControlFlow;
import java.util.*;

public class Divisor {
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   
	   System.out.println("Enter the Number : ");
	   int num = in.nextInt();
	   
	   if(7 % num == 0) {
		   System.out.println(num+ " is a divisor of 7");
	   }
	   in.close();
   }
}
