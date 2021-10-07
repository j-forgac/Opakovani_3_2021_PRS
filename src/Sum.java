import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sum {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String input = "0";
		while(!input.equals("quit")){
			sum += Integer.parseInt(input);
			input = sc.nextLine();
		}
		System.out.println(sum);
	}
}
