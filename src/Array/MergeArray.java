package Array;
import java.util.*;
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in =new Scanner(System.in);
       
       System.out.println("Enter size of first array: "); 
       int n1 = in.nextInt(); 
       int[] A = new int[n1];
       System.out.println("Enter elements of first array: "); 
       for(int i = 0; i < n1; i++) { 
    	   A[i] = in.nextInt(); 
       }
       System.out.println("Enter size of first array: "); 
       int n2 = in.nextInt(); 
       int[] B = new int[n2];
       System.out.println("Enter elements of first array: "); 
       for(int i = 0; i < n2; i++) { 
    	   B[i] = in.nextInt(); 
       }
       int[] C = new int[n1+ n2];
       for(int i=0; i<n1; i++) {
    	   C[i] = A[i];
       }
       for(int i=0; i<n2; i++) {
    	   C[n1+i] = B[i];
       }
       System.out.println("Mergged array : "+Arrays.toString(C));
       in.close();
	}

}
