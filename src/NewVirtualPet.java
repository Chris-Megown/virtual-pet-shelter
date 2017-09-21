import java.util.Random;

public class NewVirtualPet {

	Random random = new Random();
	String petName;
	String description;
	int hunger = 25;
	int thirst = 25;
	int tiredness = 25;
	int boredom = 25;

	public String intro() {
		return "Welcome to Virtual Petworld 2.0\nPlease name your pet:  ";
	}

	public String directions() {
		return "Fantastic!\n" + petName
				+ " the big white dog is your new friend and companion.\nYou will need to take good care of " + petName
				+ ".\n" + petName + " will need fed, watered, and played with."
				+ "\nAs you make choices to take care of your pet you will increase their stats.\nOver time your pets' stats will diminish and without proper care your pet will potentially die!\nTry not to let your pets stats get to 0 or there will be consequences.\nBe careful and have fun playing with your new digital friend!!";
	}

	public static String menuPet() {
		return "\nWhat would you like to do?\nPress 1 to Feed your pet.\nPress 2 to Water your pet.\nPress 3 to let your pet Rest.\nPress 4 to Play with you pet.\nPress 5 to do nothing...lame.\nPress 6 to check your pets stats.\nPlease respond: ";
	}

	public String statusPet() {
		return "\n" + petName + "'s current stats are as follows.\nHunger: " + hunger + "\nThirst: " + thirst
				+ "\nTiredness: " + tiredness + "\nBoredom: " + boredom;
	}

	public void petBasicInfo(String petName, String description) {
		this.petName = petName;
		this.description = description;
	}
	public String choiceOne() {
		return "You feed " + petName + " some food.\n";
	}

	public String choiceOneUpdate() {
		return "Your pets Hunger is at: " + hunger;
	}

	public String choiceTwo() {
		return "You give " + petName + " some water.\n";
	}

	public String choiceTwoUpdate() {
		return "Your pets Thirst is at: " + thirst;
	}

	public String choiceThree() {
		return "You lay " + petName + " to rest for a bit.\n";
	}

	public String choiceThreeUpdate() {
		return "Your pets tiredness is " + tiredness;
	}

	public String choiceFour() {
		return "You play fetch with " + petName + ".\n";
	}

	public String choiceFourUpdate() {
		return "Your pets Boredom is: " + boredom;
	}

	public String choiceFive() {
		return petName + " trudges around a bit, looking for somehting to do.";
	}

	public String notGood() {
		return petName + " has died of Dysentery...FeelsBadMan";
	}

	public String petStarve() {
		return "\n" + petName + " dies of Starvation...FeelsBadMan.";
	}

	public String petDehydrate() {
		return petName + " has died of Dehydration... FeelsBadMan";
	}

	boolean petIsNotDed() {
		if (hunger > 0 && thirst > 0) {
			return true;
		}
		return false;
	}

	boolean letsPlayAGame() {
		int rando = random.nextInt(50) + 1;
		if (rando == 25) {
			return false;
		} else {
			return true;
		}
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

