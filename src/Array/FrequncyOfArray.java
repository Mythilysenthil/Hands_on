package Array;
import java.util.*;
public class FrequncyOfArray {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter the size of array : ");
	  int n = in.nextInt();
	  int[] arr = new int[n];
	  boolean[] visited = new boolean[n];
	  
	  System.out.println("Enter the array value : ");
	  for(int i=0; i<n; i++) {
		  arr[i] = in.nextInt();
	  }
	  for(int i=0; i<n; i++) {
		  if(visited[i]) continue;
		  int count = 1;
		  for(int j=i+1; j<n; j++) {
			  if(arr[i]==arr[j]) {
				  count++;
				  visited[j] = true;
			  }
		  }
		  System.out.println(arr[i]+ "=" +count);
	  }
	  in.close();
  }
}
