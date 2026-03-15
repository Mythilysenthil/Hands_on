package Files;

import java.io.*;
import java.util.*;

public class LastModification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("Input.txt");

        long a = f.lastModified();

        Date d = new Date(a);

        System.out.println("Last Modified: " + d);
	}
}