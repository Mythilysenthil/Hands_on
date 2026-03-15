package Files;
import java.io.*;
public class Extention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File(".");

        File[] a = f.listFiles();

        for(File b : a){
            if(b.getName().endsWith(".txt")){
                System.out.println(b.getName());
            }
        }
	}

}