package Function;
import java.util.*;
public class Employee {
    static void pay(int[] arr) {
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i]>40) {
    			System.out.println("Employee "+(i+1)+" overtime pay = "+(arr[i]-40)*15);
    		}
    		else {
    			System.out.println("Employee "+(i+1)+" overtime pay = 0");
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        
        for(int i=0; i<arr.length; i++) {
        	arr[i] = in.nextInt();
        }
        pay(arr);
        in.close();
	}

}
