package Function;
import java.util.*;
public class Placement {
	static void HighestPlacement(int cs,int ec,int me) {
		if(cs < 0 || ec < 0 || me < 0) {
			System.out.println("Input is Invalid");
			return;
		}
		if(cs == ec && ec == me) { 
			System.out.println("None of the department has got the highest placement"); 
			return; 
		} 
		int max = Math.max(cs, Math.max(ec, me)); 
		System.out.print("Highest placement "); 
		if(cs == max) { 
			System.out.print("CS "); 
		} 
		if(ec == max) {
			System.out.print("EC "); 
		} 
		if(me == max) { 
			System.out.print("ME "); 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the no of students placed in CS:");
		int cs = in.nextInt();
		System.out.println("Enter the no of students placed in EC:");
		int ec = in.nextInt();
		System.out.println("Enter the no of students placed in ME:");
		int me = in.nextInt();

		HighestPlacement(cs,ec,me);
		in.close();
	}

}
