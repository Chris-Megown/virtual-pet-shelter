import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	String petName;

	Map<String, NewVirtualPet> myShelter = new HashMap<String, NewVirtualPet>();

	public NewVirtualPet whichPet(String name) {
		return myShelter.get(name);
	}

	public Collection<NewVirtualPet> allPets() {
		return myShelter.values();
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

	public void tickAllPets() {
		for (NewVirtualPet petToTick : myShelter.values()) {
			petToTick.tick();
		}
	}

	public void anyPetsDead(NewVirtualPet checkPet) {
		checkPet.petIsDed();
	}

}
