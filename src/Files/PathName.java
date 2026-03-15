package Files;
import java.io.*;

public class PathName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File f = new File("Input.txt");

        if(f.exists()){
            System.out.println("File exists");
        }
        else{
            System.out.println("File not found");
        }
	}

}