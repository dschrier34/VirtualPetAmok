package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VirtualPetTest {
    public static final String PETNAME = "earl";
    public static final String DESCRIPTION = "Cudly";
    public static final int HUNGER = 40;
    public static final int THIRST = 50;
    public static final int BOREDOM = 60;

    VirtualPet underTest = new VirtualPet(PETNAME, DESCRIPTION, HUNGER, THIRST, BOREDOM);

    @Test
    public void shouldHaveAName() {
        assertEquals(underTest.getName(), PETNAME);
    }

    @Test
    public void shouldHaveADescription() {
        assertEquals(underTest.getDescription(), DESCRIPTION);
    }

    @Test
    public void shouldHaveAHungerScore() {
        assertEquals(underTest.getHunger(), 40);
    }

    @Test
    public void shouldHaveAThirstScore() {
        assertEquals(underTest.getThirst(), 50);
    }

    @Test
    public void shouldHaveABoredomScore() {
        assertEquals(underTest.getBoredom(), 60);
    }

    @Test
    public void shouldConstructNameAndDescription() {
        VirtualPet underTest = new VirtualPet("name", "description", 40, 50, 60);
        assertNotNull(underTest);
    }

}
