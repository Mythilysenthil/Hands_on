package Array;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even = 0, odd = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i=1; i<=arr.length; i++) {
        	if(i%2==0) {even += i;}
        	else {odd += i; }
        }
        System.out.println("Even Array : "+even);
        System.out.println("Odd Array : "+odd);
	}

}
