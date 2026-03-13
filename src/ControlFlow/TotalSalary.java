package ControlFlow;
import java.util.*;
public class TotalSalary {
   public static void main(String[] args) {
	   Scanner in =new Scanner(System.in);
	   
	   System.out.println("Enter the Employee Name : ");
	   String name = in.next();
	   System.out.println("Enter the Wage : ");
	   int wage = in.nextInt();
	   System.out.println("Enter the Number of days worked : ");
	   int work = in.nextInt();
	   
	   System.out.println("Name : "+name);
	   System.out.println("Wage per day: "+wage);
	   System.out.println("Days Worked : "+work);
	   System.out.println("Total Salary : "+(wage*work));
	   
	   in.close();
   }
}