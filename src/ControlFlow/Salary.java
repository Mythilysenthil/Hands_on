package ControlFlow;
import java.util.*;
public class Salary {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter the salary : ");
	  double salary = in.nextDouble();
	  
	  double hra,da;
	  if(salary <= 10000) {
		  hra = salary*0.20;
		  da = salary*0.80;
	  }
	  else if(salary > 10000 && salary <= 20000) {
		  hra = salary*0.25;
		  da = salary*0.90;
	  }
	  else{
		  hra = salary*0.30;
		  da = salary*0.95;
	  }
	  
	  System.out.println("HRA : "+hra);
	  System.out.println("DA : "+da);
	  double gross_salary = salary + hra + da;
	  System.out.println("Gross Salary : "+gross_salary);
	  in.close();
  }
}
