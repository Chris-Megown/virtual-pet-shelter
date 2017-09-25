
public class NewVirtualPet {

	String petName;
	String description;
	int hunger = 25;
	int thirst = 25;
	int boredom = 25;

	public NewVirtualPet(String petName, String description, int hunger, int thirst, int boredom) {
		this.petName = petName;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	public NewVirtualPet(String petName, String description) {
		this.petName = petName;
		this.description = description;
		hunger = 25;
		thirst = 25;
		boredom = 25;
	}

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

	public int getBoredom() {
		return boredom;
	}

	boolean petIsDed() {
		return (hunger <= 0 && thirst <= 0);
	}

	void feed() {
		hunger += 5;
	}

	void water() {
		thirst += 5;
	}

	void fetch() {
		boredom += 6;
	}

	void tick() {
		hunger -= 1;
		thirst -= 1;
		boredom -= 2;
	}
}
