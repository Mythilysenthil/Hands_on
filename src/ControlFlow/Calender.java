package ControlFlow;
import java.util.*;
public class Calender {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in); 
		while (true) { 
			System.out.print("Enter month number (1-12): "); 
			int month = in.nextInt(); 
			if (month < 1 || month > 12) { 
				System.out.println("Invalid month"); 
				break; 
			} 
			System.out.print("Enter starting day (1=Mon, 7=Sun): "); 
			int startDay = in.nextInt(); 
			int days; 
			if (month == 2) { 
				System.out.print("Enter number of days in February (28 or 29): "); 
				days = in.nextInt();
			} 
			else if (month == 4 || month == 6 || month == 9 || month == 11) { 
				days = 30; 
			} 
			else { 
				days = 31; 
			} 
			System.out.println("Mon Tue Wed Thu Fri Sat Sun"); 
			for (int i = 1; i < startDay; i++) { 
				System.out.print("    "); 
			}
			for (int day = 1; day <= days; day++) { 
				System.out.printf("%3d ", day); 
				
				if ((day + startDay - 1) % 7 == 0) { 
					System.out.println(); 
				} 
			} 
			System.out.println(); 
		} 
		in.close(); 
	}
}
