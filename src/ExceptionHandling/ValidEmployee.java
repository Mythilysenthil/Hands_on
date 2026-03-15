package ExceptionHandling;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

class InvalidEmpNumberException extends Exception {
    InvalidEmpNumberException(String m) {
        super(m);
    }
}

class InvalidDateOfJoinException extends Exception {
    InvalidDateOfJoinException(String m) {
        super(m);
    }
}

class Employee {
    int a;
    String b;
    LocalDate c;
    LocalDate d;

    Employee(int a, String b, LocalDate c, LocalDate d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void show() {
        long e = ChronoUnit.YEARS.between(d, LocalDate.now());
        System.out.println("Employee Code: " + a);
        System.out.println("Name: " + b);
        System.out.println("DOB: " + c);
        System.out.println("Date of Appointment: " + d);
        System.out.println("Experience: " + e + " years");
    }
}
public class ValidEmployee {

	    public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);

	        try {

	            System.out.println("Enter code:");
	            int a = in.nextInt();
	            in.nextLine();

	            if (a <= 0) {
	                throw new InvalidEmpNumberException("Invalid Employee Code");
	            }

	            System.out.println("Enter name:");
	            String b = in.nextLine();

	            System.out.println("Enter DOB (yyyy-mm-dd):");
	            LocalDate c = LocalDate.parse(in.nextLine());

	            System.out.println("Enter Date of Appointment (yyyy-mm-dd):");
	            LocalDate d = LocalDate.parse(in.nextLine());

	            if (!c.isBefore(d)) {
	                throw new InvalidDateOfJoinException("DOB must be before Date of Appointment");
	            }

	            Employee e = new Employee(a, b, c, d);
	            e.show();

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        in.close();
	    }
	}

