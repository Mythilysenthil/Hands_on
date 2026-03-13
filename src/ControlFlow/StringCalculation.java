package ControlFlow;
import java.util.*;
public class StringCalculation {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter the String : ");
	  String str = in.nextLine();
	  
	  int letter = 0, digit = 0, symbol = 0;
	  for(int i=0; i < str.length(); i++) {
		  char ch = str.charAt(i);
		  if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')) {
			  letter++;
		  }
		  else if(ch >= '0' && ch <= '9') {
			  digit++;
		  }
		  else {
			  symbol++;
		  }
	  }
	  System.out.println("Letters : "+letter+", Digits : "+digit+", Symbols : "+symbol);
	  in.close();
  }
}
