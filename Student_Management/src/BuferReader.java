import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuferReader {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter name : ");
		String name = br.readLine();
		System.out.println(name);
		
	}

}
