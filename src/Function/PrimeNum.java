package Function;

public class PrimeNum {
	static void prime() {
		for(int i=1; i<=100; i++) {
			int count = 0;
			for(int j=1; j<=100; j++) {
				if(i%j == 0) count++;
			}

			if(count == 2) {
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime Numbers from 1 to 100 : ");
		prime();
	}

}
