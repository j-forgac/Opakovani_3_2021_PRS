import java.util.ArrayList;
import java.util.Scanner;

public class FruitAndVegetable {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> fruit = new ArrayList<>();
		ArrayList<String> vegetable = new ArrayList<>();
		String userInput = "";

		System.out.println("zadejte počet ovoce");
		int n = sc.nextInt();
		System.out.println("zadávejte " + n + " kusů ovoce");
		String buffer = sc.nextLine();

		for (int x = 0;x<n;x++){
			userInput = sc.nextLine();
			if(!fruit.contains(userInput)){
				fruit.add(userInput);
			} else {
				System.out.println("uz je na seznamu!");
				x--;
			}
		}

		System.out.println("zadejte počet zeleniny");
		int m = sc.nextInt();
		System.out.println("zadávejt " + m + " kusů zeleniny");
		buffer = sc.nextLine();
		for (int x = 0;x<m;x++){
			userInput = sc.nextLine();
			if(!(fruit.contains(userInput) || vegetable.contains(userInput)) && !userInput.equals(" ")){
				vegetable.add(userInput);
			} else {
				System.out.println("uz je na seznamu!");
				x--;
			}
		}

		System.out.println("zadejdávejte rostlinné druhy");
		String plant = "";
		while (sc.hasNext() && !plant.equals("END") && !userInput.equals(" ")){
			plant = sc.nextLine();
			if(fruit.contains(plant)){
				System.out.println("ovoce");
			}else if (vegetable.contains(plant)){
				System.out.println("zelenina");
			} else {
				System.out.println("ostatní");
			}
		}
	}
}
