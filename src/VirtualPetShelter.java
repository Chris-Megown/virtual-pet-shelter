import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	Map<String, Set<NewVirtualPet>> myShelter = new HashMap<String, Set<NewVirtualPet>>();

	public void addPet(NewVirtualPet newPet) {
		String nameSearch = newPet.getName();
		myShelter.put(nameSearch, new HashSet<>());

		Set<NewVirtualPet> adoptablePets = myShelter.get(nameSearch);
		adoptablePets.add(newPet);

	}
}
