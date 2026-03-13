package Array;
import java.util.*;
public class PresentInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the value : ");
        for(int i=0; i<n; i++) {
        	arr[i] = in.nextInt();
        }
        
        System.out.println("Key : ");
        int key = in.nextInt();
        
        boolean found = false;
        for(int i=0; i<n; i++) {
        	if(key == arr[i]) {
            	found = true;
            	break;
            }
        }
        if(found) System.out.println("True");
        else System.out.println("False");
        in.close();
	}

}
