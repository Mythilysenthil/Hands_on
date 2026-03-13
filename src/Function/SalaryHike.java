package Function;
import java.util.*;
public class SalaryHike {
	static void new_salary(double salary, double hike) {
		double New = salary + ((salary*hike)/100);
		System.out.println("New salary : "+New);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Enter monthly salary: ");
        double salary= in.nextDouble();
        System.out.println("Enter hike precentage: ");
        double hike = in.nextDouble();
        
        new_salary(salary,hike);
        in.close();
	}

}
