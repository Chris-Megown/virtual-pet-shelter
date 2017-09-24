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
		

		String userChoice;
		// might make this false within a boolean
		while (!petShelter.myShelter.isEmpty()) {

			do {
				System.out.println("This is the status of your current pets:");
				System.out.println();
				System.out.println("Name\t\t|Hunger\t|Thirst\t|Boredom");
				System.out.println("___________________________________________");
				for (NewVirtualPet currentPet : petShelter.allPets()) {
					System.out.println(currentPet.getName() + "\t\t" + "|  " + currentPet.getHunger() + "\t" + "|  " + currentPet.getThirst()
							+ "\t" + "|  " + currentPet.getBoredom());
					System.out.println("___________________________________________");

				}
				System.out.println("\n");
				System.out.println("\t1. Feed the pets");
				System.out.println("\t2. Water the pets");
				System.out.println("\t3. Play with a pet");
				System.out.println("\t4. Adopt a pet");
				System.out.println("\t5. Admit a pet");
				System.out.println("\t6. Quit\n");
				System.out.print("What would you like to do next:");

				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4") && !userChoice.equals("5") && !userChoice.equals("6"));

			switch (userChoice) {

			case "1":
				petShelter.feedAllPets();
				System.out.println("All the pets have had their food bowls refilled!");
				petShelter.tickAllPets();
				break;
			case "2":
				petShelter.waterAllPets();
				System.out.println("All the pets have had their water bowls refilled!");
				petShelter.tickAllPets();

				break;
			case "3":
				System.out.println("Which pet would you like to play with?");
				String petPlayInput = input.next();
				petShelter.whichPet(petPlayInput).fetch();
				System.out.println("You threw the ball with " + petPlayInput + ", and he liked it.\n");
				petShelter.tickAllPets();

			break;
			case "4":
				// petShelter.addPet();
				petShelter.tickAllPets();

			case "5":
				// petShelter.removePet(adoptedPet);
				petShelter.tickAllPets();

			case "6":
				System.out.println("Have a nice day.");
				System.exit(0);

			}
		} input.close();
	}
}
