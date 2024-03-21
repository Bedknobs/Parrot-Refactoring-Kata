package parrot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuropeanParrotTest {

    Parrot europeanParrot = new EuropeanParrot();

    @Test
    @DisplayName("la velocidad de un loro europeo es la velocidad base de los loros")
    void europeanParrotSpeed() {
        assertEquals(europeanParrot.getSpeed(), 12.0);
    }

    @Test
    @DisplayName("el loro europeo hace Sqoork!")
    void europeanParrotCry() {
        assertEquals(europeanParrot.getCry(), "Sqoork!");
    }
}