package ControlFlow;
import java.util.*;

public class Character {
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter the Character : ");
	   char ch = in.next().charAt(0);
	   
	   switch(ch) {
	   case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
	   case 'A' : case 'E' : case 'I' : case 'O' : case 'U' :
		   System.out.println(ch+" is a vowel");
		   break;
	 
	   default:
		   if((ch >= 'a' && ch <= 'z') || (ch >= 'A') && (ch <= 'Z')) {
			   System.out.println(ch+ " is a consonant");
		   }
		   else {
			   System.out.println(ch+ " is a symbol");
		   }
	   }
	   in.close();
    }
}
 