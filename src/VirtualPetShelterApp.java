import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Petopia!");
		System.out.println("The happiest pet-place on Earth!");

		String userChoice;
		VirtualPetShelter petShelter = new VirtualPetShelter();
		while (petShelter.myShelter.isEmpty()) {
			System.out.println("This is the status of your current pets:");
	//		System.out.println(newPet);
			// need to put the for-each loop for initial pets here

			do {
				System.out.println("What would you like to do next?");

				System.out.println("\t1. Feed the pets");
				System.out.println("\t2. Water the pets");
				System.out.println("\t3. Play with a pet");
				System.out.println("\t4. Adopt a pet");
				System.out.println("\t5. Admit a pet");
				System.out.println("\t6. Quit");
				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4") && !userChoice.equals("5") && !userChoice.equals("6"));

			switch (userChoice) {

			case "1":
			}
		}
	}
}
