package ControlFlow;

public class Alphabet {
   public static void main(String[]args) {
	   char forward = 'a';
	   char backward = 'z';
	   for (int i = 0; i < 26; i++){ 
		   System.out.print(forward + "" + backward + " ");
		   forward++;
		   backward--;
	   }
   }
}
