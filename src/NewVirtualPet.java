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
	
	public String getName() {
		return petName;
	}
	
	public String getDescription() {
		return description;
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
		tiredness -= 1;
	}

	void water() {
		thirst += 5;
		tiredness -= 1;
	}

	void rest() {
		tiredness += 10;
	}

	void fetch() {
		hunger -= 1;
		thirst -= 1;
		tiredness -= 2;
		boredom += 6;
	}

	void tick() {
		hunger -= 2;
		thirst -= 2;
		tiredness -= 3;
		boredom -= 3;
	}
}

