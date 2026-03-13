package Array;
import java.util.*;
public class DuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		  System.out.println("Enter the size of array : ");
		  int n = in.nextInt();
		  int[] arr = new int[n];
		  
		  System.out.println("Enter the array value : ");
		  for(int i=0; i<n; i++) {
			  arr[i] = in.nextInt();
		  }
		  for(int i=0; i<n; i++) {
			  for(int j=i+1; j<n; j++) {
				  if(arr[i]==arr[j]) {
					  System.out.println("Duplicate value : " +arr[i]);
					  break;
				  }
			  }
		  }
		  in.close();

	}

}
