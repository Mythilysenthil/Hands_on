package ExceptionHandling;
import java.util.*;


class Invoice {

 int a;      
 String b;   
 int c;      
 double d;   

 
 Invoice(int a, String b, int c, double d) {
     this.a = a;
     this.b = b;
     this.c = c;
     this.d = d;
 }


 void show() {
     System.out.println("Part Number: " + a);
     System.out.println("Part Description: " + b);
     System.out.println("Quantity: " + c);
     System.out.println("Price per Item: " + d);
     System.out.println("Total Amount: " + (c * d));
 }
}


public class GroceryStory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

        try {

            System.out.println("Enter part number:");
            int a = in.nextInt();

            in.nextLine(); 

            System.out.println("Enter part description:");
            String b = in.nextLine();

            System.out.println("Enter quantity:");
            int c = in.nextInt();

            System.out.println("Enter price per item:");
            double d = in.nextDouble();

            
            if (a <= 0 || b == null || b.equals("") || c <= 0 || d <= 0) {
                System.out.println("Invalid input values");
                return;
            }

            
            Invoice x = new Invoice(a, b, c, d);

            
            x.show();

        } catch (InputMismatchException e) {
            System.out.println("Input type mismatch error");
        }
        in.close();
	}
}