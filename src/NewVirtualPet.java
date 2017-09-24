import java.util.Random;

public class NewVirtualPet {

	Random random = new Random();
	String petName;
	String description;
	int hunger = 25;
	int thirst = 25;
	int tiredness = 25;
	int boredom = 25;

	public NewVirtualPet(String petName, String description, int hunger, int thirst, int tiredness, int boredom) {
		this.petName = petName;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.tiredness = tiredness;
		this.boredom = boredom;
			}
	
	
	public NewVirtualPet(String petName, String description) {
		this.petName = petName;
		this.description = description;
	}
	
	NewVirtualPet Billy = new NewVirtualPet("Billy", "Likes to chew on tires", 10, 10, 10, 10);

	
	public String getName() {
		return petName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public int getThirst() {
		return thirst;
	}
	
	public int getTiredness() {
		return tiredness;
	}
	
	public int getBoredom() {
		return boredom;
	}

	public String statusPet() {
		return "\n" + petName + "'s current stats are as follows.\nHunger: " + hunger + "\nThirst: " + thirst
				+ "\nTiredness: " + tiredness + "\nBoredom: " + boredom;
	}
	

	public String petStarve() {
		return "\n" + petName + " dies of Starvation...FeelsBadMan.";
	}

	public String petDehydrate() {
		return petName + " has died of Dehydration... FeelsBadMan";
	}

	boolean petIsNotDed() {
		return (hunger > 0 && thirst > 0);
	}


	void feed() {
		hunger += 5;
	}

	void water() {
		thirst += 5;
	}

	void rest() {
		tiredness += 10;
	}

	void fetch() {
		boredom += 6;
	}

	void tick() {
		hunger -= 1;
		thirst -= 1;
		tiredness -= 2;
		boredom -= 2;
	}
}

