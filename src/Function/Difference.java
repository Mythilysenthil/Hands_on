package Function;

public class Difference {

	// TODO Auto-generated method stub
	static void Add() {
		int sumOdd = 0;
		int sumEven = 0;
		for(int i=1; i<=1000; i++) {
				if(i % 2==0) {
					sumEven += i;
				}
				else {
					sumOdd += i;
				}
		}
		System.out.println("The sum of even numbers from 1 to 1000 is:  "+sumEven);
		System.out.println("The sum of odd numbers from 1 to 1000 is: "+sumOdd);
		System.out.println("The absolute difference between the two sums is: "+Math.abs(sumEven-sumOdd));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add();

	}

}
