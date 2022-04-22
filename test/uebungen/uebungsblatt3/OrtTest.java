package uebungen.uebungsblatt3;

import org.junit.jupiter.api.Test;

class OrtTest {

    @Test
    void values() {
        Ort[] orte = Ort.values();

        assert (orte.length == 3);
        assert (orte[0].name().equals("München"));
        assert (orte[1].name().equals("Karlsruhe"));
        assert (orte[2].name().equals("Berlin"));
    }

    @Test
    void valueOf() {
        Ort ort = Ort.valueOf("München");
        assert (ort == Ort.München);

        ort = Ort.valueOf("Karlsruhe");
        assert (ort == Ort.Karlsruhe);

        ort = Ort.valueOf("Berlin");
        assert (ort == Ort.Berlin);
    }
}