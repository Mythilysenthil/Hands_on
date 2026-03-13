package Function;
import java.util.*;
public class Appraisal {
    static void new_salary(double salary,double rating) {
    	double New = 0;
    	if(salary != 0 || (rating>0 && rating<=10)) {
    		if(rating>=1 && rating<=4) {
    			New = salary + (0.1*salary);
    		}
    		else if(rating>=4.1 && rating<=7) {
    			New = salary + (0.25*salary);
    		}
    		else {
    			New = salary + (0.30*salary);
    		}
    		System.out.println("New Salary : "+(int)New);
    	}else {
    		System.out.println("Invalid Input");
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the salary : ");
        double salary = in.nextDouble();
        System.out.println("Enter the Performance appraisal rating :");
        double rating = in.nextDouble();
        
        new_salary(salary,rating);
        in.close();
	}

}
