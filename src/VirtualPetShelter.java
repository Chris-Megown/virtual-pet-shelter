import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, NewVirtualPet> myShelter = new HashMap<String, NewVirtualPet>();

	public void addPet(NewVirtualPet newPet) {
		String nameSearch = newPet.getName();
		myShelter.put(nameSearch, newPet);
	}

	public void removePet(NewVirtualPet newPet) {
		String nameSearch = newPet.getName();
		myShelter.remove(nameSearch);
	}
}
