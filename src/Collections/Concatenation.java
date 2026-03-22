package Collections;
import java.util.*;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        Set<String> s = new LinkedHashSet<>(); 

        System.out.print("How many names do you want to input? ");
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Elements in the Set : ");
            String str = in.nextLine();
            s.add(str);
        }

 
        Iterator<String> it = s.iterator();

        String result = "";

        while (it.hasNext()) {
            String value = it.next();
            System.out.print(value + " ");
            result += value + " ";
        }

        System.out.println("\nConcatenated result: " + result.trim());

        in.close();
	}

}