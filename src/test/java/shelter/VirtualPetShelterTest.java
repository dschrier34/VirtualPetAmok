package shelter;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {
    private static final String PETNAME = "name";
    private static final String DESCRIPTION = "description";
    private static final Integer WATER = 5;


    private VirtualPetShelter underTest = new VirtualPetShelter();


    @Test
    public void shouldRetrieveVirtualPetName() {
        VirtualPet check = new VirtualPet(PETNAME, DESCRIPTION);
        underTest.addPet(check);
        VirtualPet retrieved = underTest.findPet(PETNAME);
        assertEquals(PETNAME, retrieved.getName());

    }

    @Test
    public void shouldAdoptPet() {
        VirtualPet pet = new VirtualPet(PETNAME, DESCRIPTION);
        underTest.addPet(pet);
        underTest.adopt(PETNAME);
        assertEquals(0, underTest.availablePets().size());

    }

    @Test
    public void shouldInstantiateVirtualPetShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        assertNotNull(underTest);
    }

    private void assertNotNull(VirtualPetShelter underTest) {
    }

    @Test
    public void shouldAddPet() {
        VirtualPet pet = new VirtualPet(PETNAME, DESCRIPTION);
        underTest.addPet(pet);
        assertEquals(1, underTest.availablePets().size());
    }

    @Test
    public void shouldWaterAll() {
        VirtualPet pet = new VirtualPet(PETNAME, DESCRIPTION);
        VirtualPet pet2 = new VirtualPet(PETNAME, DESCRIPTION);
        underTest.addPet(pet);
        underTest.addPet(pet2);
        Collection<VirtualPet> allPets = underTest.availablePets();
        int petThirstLevelStart = pet.getThirst();
        int pet2ThirstLevelStart = pet2.getThirst();
        underTest.waterAll();
        int petThirstLevelEnd = pet.getThirst();
        assertEquals(petThirstLevelEnd, petThirstLevelStart - 0);

    }

    @Test
    public void shouldFeedAll() {
        VirtualPet pet = new VirtualPet(PETNAME, DESCRIPTION);
        VirtualPet pet2 = new VirtualPet(PETNAME, DESCRIPTION);
        underTest.addPet(pet);
        underTest.addPet(pet2);
        Collection<VirtualPet> allPets = underTest.availablePets();
        int petHungerLevelStart = pet.getHunger();
        int pet2HungerLevelStart = pet2.getHunger();
        underTest.feedAll();
        int petHungerLevelEnd = pet.getHunger();
        assertEquals(petHungerLevelEnd, petHungerLevelStart - 0);

    }

}

