package ControlFlow;
import java.util.*;
public class SumOfSeries {
   public static void main(String[]args) {
	   Scanner in = new Scanner(System.in);
	   int i=1;
	   int sum = 0;
	   System.out.println("Enter the value : ");
	   int num = in.nextInt();
	   
	   do {
		   sum += i;
		   i++;
	   }while(i <= num);
	   System.out.println("Sum of the series : "+sum);
	   
	   in.close();
   }
}
