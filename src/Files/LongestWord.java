package Files;
import java.io.*;
import java.util.*;

public class LongestWord {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

        File f = new File("output.txt");
        Scanner in = new Scanner(f);

        String a = "";
        String b = "";

        while(in.hasNext()){
            a = in.next();
            if(a.length() > b.length()){
                b = a;
            }
        }

        System.out.println("Longest word: " + b);
        in.close();
	}
}