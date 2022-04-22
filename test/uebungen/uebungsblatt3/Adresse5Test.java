package uebungen.uebungsblatt3;

import org.junit.jupiter.api.Test;

class Adresse5Test {

    @Test
    void testToString() {
        Adresse5 adresse = new Adresse5("Hauptstraße", "1A", 12345, Ort.Karlsruhe);

        assert adresse.toString().equals("Hauptstraße 1A, 12345 Karlsruhe");

        adresse = new Adresse5("Hauptstraße", "1A", 12345, null);

        assert adresse.toString().equals("Hauptstraße 1A, 12345 null");
    }
}