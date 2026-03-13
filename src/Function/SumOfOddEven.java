package Function;
import java.util.*;
public class SumOfOddEven {
  static void Add(int[] arr) {
	  int sumOdd = 0;
	  int sumEven = 0;
	  for(int num : arr) {
		  if(num % 2==0) {
			  sumEven += num;
		  }
		  else {
			  sumOdd += num;
		  }
	  }
	  System.out.println("Sum of Even Numbers : "+sumEven);
	  System.out.println("Sum of Odd Numbers : "+sumOdd);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
        	arr[i] = in.nextInt();
        }
        Add(arr);
        in.close();
	}

}
