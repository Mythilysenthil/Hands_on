package Array;
import java.util.*;
public class MaxMin {
  public static void main(String[] args) {
	  Scanner in =new Scanner(System.in);
	  System.out.println("Enter the size of array : ");
	  int n = in.nextInt();
	  int[] arr = new int[n];
	  
	  System.out.println("Enter the array value : ");
	  for(int i=0; i<n; i++) {
		  arr[i] = in.nextInt();
	  }
	  int min = arr[0];
	  int max = arr[0];
	  for(int i=0; i<n; i++) {
		  if(arr[i] > max) {max = arr[i];}
		  if(arr[i] < min) {min = arr[i];}
	  }
	  System.out.println("Maximum value : "+max);
	  System.out.println("Minimum value : "+min);
	  in.close();
  }
}
