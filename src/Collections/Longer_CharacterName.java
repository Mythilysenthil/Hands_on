package Collections;
import java.util.*;

public class Longer_CharacterName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        
        System.out.println("How many names do you want to input? ");
        int n = in.nextInt();
        in.nextLine();
        
        for(int i=1; i<=n; i++) {
        	System.out.println("Enter name #"+i+ ": ");
        	String name = in.nextLine();
        	names.add(name);
        }
        System.out.println("Names longer than 5 characters:");
        for(String name:names) {
        	if(name.length()>5) {
            	System.out.println(name);
            }
        }
        in.close();
	}

}
