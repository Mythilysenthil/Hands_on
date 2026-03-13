package Function;
import java.util.*;
public class BloodDonor {
    static void eligible(int age,int weight) {
       	if((age > 18 && age <= 55)&& weight >= 40) {
       		System.out.println(" Eligible for donating blood");
       	}
       	else {
       		System.out.println("Not eligible for donating blood");
       	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = in.nextInt();
		System.out.println("Enter the weight : ");
		int weight = in.nextInt();
		eligible(age,weight);
		in.close();
	}

}
