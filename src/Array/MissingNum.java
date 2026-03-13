package Array;
import java.util.*;
public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of array : "); 
       int n = in.nextInt(); 
       int[] arr = new int[n];
       
       System.out.println("Enter the value : ");
       int sum=0;
       for(int i=0; i<n; i++) {
    	   arr[i] = in.nextInt();
    	   sum += arr[i];
       }
       int actual = (100*101)/2;
       int missing = actual-sum;
       System.out.println("Missing Number : "+missing);
       in.close();
	}

}
