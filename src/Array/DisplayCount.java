package Array;
import java.util.*;
public class DisplayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in =new Scanner(System.in);
        int[] arr = new int[25];
        
        System.out.println("Enter the value : ");
        for(int i=0; i<arr.length; i++) {
        	arr[i] = in.nextInt();
        }
        System.out.println("Enter the Number :");
        int n= in.nextInt();
        
        int count = 0;
        for(int i=0; i<arr.length; i++) {
        	if(n == arr[i]) {
        		count++;
        	}
        }
        if(count>0) {
     	   System.out.println("Number "+n+" is present "+count+" times"); 
        }
        else {
     	   System.out.println("Number "+n+" is not present in the array");;
        }
        in.close();
	}

}
