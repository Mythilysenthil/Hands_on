package Array;
import java.util.*;
public class ChocolateDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
        	arr[i] = in.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++) {
        	sum += arr[i];
        }
        if(sum % n == 0) { System.out.println("Yes");}
        else { System.out.println("No");}
        in.close();
	}
}
