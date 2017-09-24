import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	NewVirtualPet metaPet = new NewVirtualPet(null, null, 0, 0, 0, 0);
	Map<String, NewVirtualPet> myShelter = new HashMap<String, NewVirtualPet>();

	public void addPet(NewVirtualPet newPet) {
		String nameSearch = newPet.getName();
		myShelter.put(nameSearch, newPet);
	}

	public void removePet(NewVirtualPet newPet) {
		String nameSearch = newPet.getName();
		myShelter.remove(nameSearch);
	}
	NewVirtualPet Billy = new NewVirtualPet("Billy", "Likes to chew on tires", 10, 10, 10, 10);
	myShelter.put(Billy);
	
	public void feedAllPets() {
		for (Entry<String, NewVirtualPet> entry : myShelter.entrySet()) {
			metaPet.feed();
		}
		System.out.println("All the pets have had their food bowls refilled!");
	}
	
	public void waterAllPets() {
		for (Entry<String, NewVirtualPet> entry : myShelter.entrySet()) {
			metaPet.water();
		}
		System.out.println("All the pets have had their water bowls refilled!");
	}

	
}
