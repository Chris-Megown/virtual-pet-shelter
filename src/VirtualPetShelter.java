import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	String petName;

	Map<String, NewVirtualPet> myShelter = new HashMap<String, NewVirtualPet>();

	public NewVirtualPet whichPet(String name) {
		return myShelter.get(name);
	}

	public String getName(String petName) {
		return petName;
	}

	public void addPet(NewVirtualPet newPet) {
		myShelter.put(newPet.getName(), newPet);
	}

	public void removePet(String adoptedPet) {
		myShelter.remove(adoptedPet);
	}

	public void playWithAPet(NewVirtualPet playfulPet) {
		playfulPet.fetch();
	}

	public void feedAllPets() {
		for (NewVirtualPet petToFeed : myShelter.values()) {
			petToFeed.feed();
		}
	}

	public void waterAllPets() {
		for (NewVirtualPet watering : myShelter.values()) {
			watering.water();
		}
	}

}
