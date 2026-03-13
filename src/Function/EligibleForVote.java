package Function;
import java.util.*;
public class EligibleForVote {
    static void vote(int age) {
    	if(age >= 18) {
    		System.out.println("Eligible to vote");
    	}
    	else {
    		System.out.println("Not eligible to vote");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = in.nextInt();
        vote(age);
        in.close();
	}

}
