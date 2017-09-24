import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	Map<String, NewVirtualPet> myShelter = new HashMap<String, NewVirtualPet>();
	NewVirtualPet metaPet = new NewVirtualPet(null, null, 0, 0, 0);

	NewVirtualPet Billy = new NewVirtualPet("Billy", "Likes to chew on tires", 10, 10, 10);
	myShelter.put("Billy", "Billy", "Likes to chew on tires", 10, 10, 10, 10);
	
	
	public void addPet(NewVirtualPet newPet) {
		String nameSearch = newPet.getName();
		myShelter.put(nameSearch, newPet);
	}

	public void removePet(NewVirtualPet newPet) {
		String nameSearch = newPet.getName();
		myShelter.remove(nameSearch);
	}
	
	
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
