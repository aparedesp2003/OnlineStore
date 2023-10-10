package exercise02;
import java.util.Scanner;

public class MainConsole {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		//get from the user if is full or part 
		System.out.println("Choose the type of game: full or part ");
		String type = scanner.nextLine();
		
		// if is full then we create a object from the FullTimeGameTester class and we take the name from the user and we call the method Salary that already has the value 
		if(type.equalsIgnoreCase("full"))
		{
			
			System.out.println("What is the name of the game: ");
			String name = scanner.nextLine();
			FullTimeGameTester full = new FullTimeGameTester(name);
			System.out.print("The name of the game is: "+ name+ " and the salary is: " + "$"+full.Salary());
		}
		else if (type.equalsIgnoreCase("part"))
		{
			System.out.println("What is the name of the game: ");
			String name = scanner.nextLine();
			System.out.println("How many hours? ");
			int hours = scanner.nextInt(); 
			PartTimeGameTester part = new PartTimeGameTester(name,hours);
			System.out.print("The name of the game is: "+ name+ " and the salary is: " + "$"+part.Salary());
		}

	}

}
