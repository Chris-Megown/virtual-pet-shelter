import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter petShelter = new VirtualPetShelter();
		NewVirtualPet billy = new NewVirtualPet("Billy", "Baby Lion", 10, 10, 10);
		NewVirtualPet stuart = new NewVirtualPet("Stuart", "Mouscateer", 4, 4, 4);
		NewVirtualPet wanda = new NewVirtualPet("Wanda", "Wooly Mammoth", 30, 30, 30);
		petShelter.addPet(billy);
		petShelter.addPet(stuart);
		petShelter.addPet(wanda);
		System.out.println("Welcome to Petopia!");
		System.out.println("The happiest pet-place on Earth!");
		System.out.println("This is the status of your current pets:");
		System.out.println();
		System.out.println("Name\t\t|Hunger\t|Thirst\t|Boredom");
		System.out.println("___________________________________________");
		for (NewVirtualPet currentPet : petShelter.myShelter.values()) {
			System.out.println(currentPet.getName() + "\t" + currentPet.getHunger() + "\t" + currentPet.getBoredom());

			String userChoice;
			while (!petShelter.myShelter.isEmpty()) {

				// System.out.println(newPet);
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
					petShelter.feedAllPets();
					System.out.println("All the pets have had their food bowls refilled!");

				case "2":
					petShelter.waterAllPets();
					System.out.println("All the pets have had their water bowls refilled!");

				case "3":
					System.out.println("Which pet would you like to play with?");
					String petPlayInput = input.next();
					petShelter.whichPet(petPlayInput).fetch();
				case "4":
					// petShelter.addPet();
				case "5":
					// petShelter.removePet(adoptedPet);
				case "6":
					System.out.println("Have a nice day.");
					System.exit(0);

				}
			}
		}
	}
}
