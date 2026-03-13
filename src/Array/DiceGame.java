package Array;
import java.util.*;
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        System.out.println("Arun Dice Choice : ");
        for(int i=0; i<arr1.length; i++) {
        	arr1[i] = in.nextInt();
        }
        System.out.println("Naveen Dice Choice : ");
        for(int i=0; i<arr2.length; i++) {
        	arr2[i] = in.nextInt();
        }
        int sum_arr1 = 0, sum_arr2 = 0;
        for(int i=0; i<arr1.length; i++) {
        	sum_arr1 += arr1[i];
        }
        for(int i=0; i<arr2.length; i++) {
        	sum_arr2 += arr2[i];
        }
        if(sum_arr1 > sum_arr2) {System.out.println("Arun Wins!!!");}
        else {System.out.println("Naveen Wins!!!");}
        in.close();
	}

}
