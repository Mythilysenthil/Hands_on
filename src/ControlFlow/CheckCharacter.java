package ControlFlow;
import java.util.*;
public class CheckCharacter {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter the character : ");
	  char ch = in.next().charAt(0);
	  
	  if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
		  System.out.println("Given Character is an Alphabet!");
	  }
	  else if(ch >= '0' && ch <= '9') {
		  System.out.println("Given Character is an Digit!");
	  }
	  else {
		  System.out.println("Given Character is an Special Symbol!");
	  }
	  in.close();
  }
}
