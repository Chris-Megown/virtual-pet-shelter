import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter petShelter = new VirtualPetShelter();
		NewVirtualPet billy = new NewVirtualPet("Billy", "Baby Lion", 40, 40, 40);
		NewVirtualPet stuart = new NewVirtualPet("Stuart", "Mouscateer", 20, 20, 20);
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
				System.out.println("------------------------------------------");
				for (NewVirtualPet currentPet : petShelter.allPets()) {
					System.out.println(currentPet.getName() + "\t\t" + "|  " + currentPet.getHunger() + "\t" + "|  "
							+ currentPet.getThirst() + "\t" + "|  " + currentPet.getBoredom());
					System.out.println("------------------------------------------");

				}
				System.out.println("\n");
				System.out.println("\t1. Feed the pets");
				System.out.println("\t2. Water the pets");
				System.out.println("\t3. Play with a pet");
				System.out.println("\t4. Adopt a pet");
				System.out.println("\t5. Admit a pet");
				System.out.println("\t6. Quit\n");
				System.out.print("What would you like to do next: ");

				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4") && !userChoice.equals("5") && !userChoice.equals("6"));

			switch (userChoice) {

			case "1":
				petShelter.feedAllPets();
				System.out.println("\nAll the pets have had their food bowls refilled!\n");
				petShelter.tickAllPets();
				break;
			case "2":
				petShelter.waterAllPets();
				System.out.println("\nAll the pets have had their water bowls refilled!\n");
				petShelter.tickAllPets();

				break;
			case "3":
				System.out.println();
				for (NewVirtualPet currentPet : petShelter.allPets()) {
					System.out.println(currentPet.getName() + "\t\t" + "|  " + currentPet.getDescription() + "\n");

				}
				System.out.print("\nWhich pet would you like to play with: ");

				String petPlayInput = input.next();
				petShelter.whichPet(petPlayInput).fetch();
				System.out.println("\nYou threw the ball with " + petPlayInput + ", and he liked it.\n");
				petShelter.tickAllPets();

				break;
			case "4":
				System.out.println("Which pet would you like to adopt? Enter their name and kind of pet below.");
				for (NewVirtualPet currentPet : petShelter.allPets()) {
					System.out.println(currentPet.getName() + ", " + currentPet.getDescription());
				}
				String adoptablePet = input.next();
				petShelter.removePet(adoptablePet);
				System.out.println("You adopted " + adoptablePet);
				petShelter.tickAllPets();
				break;

			case "5":
				System.out.println("If you would like to admit an animal here we'll need some information.");
				System.out.print("What is the pet's name:");
				String newPetName = input.next();
				System.out.print("What kind of animal is this pet:");
				String newPetDescription = input.next();
				NewVirtualPet foundPet = new NewVirtualPet(newPetName, newPetDescription);
				petShelter.addPet(foundPet);
				System.out.println("\nHere at Petopia we will take great care of " + newPetName + ".\n");
				petShelter.tickAllPets();
				break;
			case "6":
				System.out.println("Have a nice day.");
				System.exit(0);

			}
		}
		input.close();
	}
}
