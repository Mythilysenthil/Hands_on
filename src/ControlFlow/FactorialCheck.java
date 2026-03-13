package ControlFlow;
import java.util.*;
public class FactorialCheck {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num <= 0) {
            System.out.println("Invalid Input");
        } 
        else {
            int c = num;
            int divisor = 1;

            while (c % divisor == 0) {
                c /= divisor;
                if (c == 1) {
                    break;
                }
                divisor++;
            }
            if (c == 1) {
                System.out.println(divisor);
            } else {
                System.out.println("Sorry. The given number is not a perfect factorial");
            }
        }
        in.close();
    }
}
