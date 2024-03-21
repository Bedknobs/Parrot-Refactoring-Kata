package parrot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfricanParrotTest {

    Parrot africanParrot = new AfricanParrot();

    @Test
    @DisplayName("la velocidad de un loro africano es la velocidad base menos el peso por los cocos que lleve")
    void africanParrotSpeed() {
        assertEquals(africanParrot.getSpeed(), 3.0);
    }

    @Test
    @DisplayName("el loro africano hace Sqoork!")
    void africanParrotCry() {
        assertEquals(africanParrot.getCry(), "Sqaark!");
    }
}