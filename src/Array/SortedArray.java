package Array;
import java.util.*;
public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = in.nextInt();
		int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i] = in.nextInt();
        }
        for(int i=0; i<n; i++) {
        	for(int j=i+1; j<n; j++) {
        		if(arr[i] > arr[j]) {
        			int temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        }
        System.out.println("Sorted Array : ");
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
        
        in.close();
	}
}
