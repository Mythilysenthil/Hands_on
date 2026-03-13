package ControlFlow;
import java.util.*;
public class Ascii {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter character : ");
	  String str = in.nextLine();
	  
	  char[] arr = str.toCharArray();
	  Arrays.sort(arr);
      
	  System.out.println("Sorter character : ");
	  for(char c : arr) {
		  System.out.println(c+ " ");
	  }
	  in.close();
  }
}
