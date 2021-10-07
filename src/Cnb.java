import java.util.HashMap;
import java.util.Scanner;

public class Cnb {
	public static void main(String[] a){
		CnbInput cnbInput = new CnbInput();
		HashMap<String,Float> input = cnbInput.getInput();
		Scanner sc = new Scanner(System.in);
		String user;
		String[] stuff;
		while(true){
			user = sc.nextLine();
			user = user.replaceAll("\\{","");
			user = user.replaceAll("TO","");
			stuff = user.split("}");
			Float count = Float.parseFloat(stuff[0]);
			String from = stuff[1];
			String to = stuff[2];
			System.out.println(count*input.get(from)/input.get(to));
		}
	}
}
