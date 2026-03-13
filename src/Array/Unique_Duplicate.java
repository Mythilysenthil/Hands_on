package Array;

import java.util.Scanner;

public class Unique_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = in.nextInt();
		int[] arr = new int[n];
		boolean[] visited = new boolean[n];

		System.out.println("Enter the array value : ");
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		int count_dup = 0, count_uni = 0;
		for(int i=0; i<n; i++) {
			if(visited[i]) continue;
			int freq = 1;
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					freq++;
					visited[j] = true;
				}
			}
			if(freq > 1) count_dup++;
			else count_uni++;
		}
		System.out.println("No of duplicate element: "+count_dup+ " No of unique elements: "+count_uni);
		in.close();
	}

}
