package Files;
import java.io.*;

public class ReadLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("output.txt"));

        String a = "";
        String b = "";

        while((a = br.readLine()) != null){
            b = b + a;
        }

        System.out.println("File Content:");
        System.out.println(b);

        br.close();
	}
}