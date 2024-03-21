package parrot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NorwegianParrotTest {

    Parrot norwegianParrot = new NorwegianParrot(0, false);

    @Test
    @DisplayName("la velocidad de un loro noruego clavado es 0")
    void norwegianParrotSpeed() {
        assertEquals(norwegianParrot.getSpeed(), 0.0);
    }

    @Test
    @DisplayName("el loro noruego hace Sqoork!")
    void norwegianParrotCry() {
        assertEquals(norwegianParrot.getCry(), "...");
    }
}
