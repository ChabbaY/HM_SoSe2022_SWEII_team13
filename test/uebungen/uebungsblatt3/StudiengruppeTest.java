package uebungen.uebungsblatt3;

import org.junit.jupiter.api.Test;

class StudiengruppeTest {

    @Test
    void values() {
        Studiengruppe[] studiengruppen = Studiengruppe.values();

        assert (studiengruppen.length == 5);
        assert (studiengruppen[0].name().equals("IB2A"));
        assert (studiengruppen[1].name().equals("IB2B"));
        assert (studiengruppen[2].name().equals("IB4A"));
        assert (studiengruppen[3].name().equals("IB4B"));
        assert (studiengruppen[4].name().equals("IB4C"));
    }

    @Test
    void valueOf() {
        Studiengruppe studiengruppe = Studiengruppe.valueOf("IB2A");
        assert (studiengruppe == Studiengruppe.IB2A);

        studiengruppe = Studiengruppe.valueOf("IB2B");
        assert (studiengruppe == Studiengruppe.IB2B);

        studiengruppe = Studiengruppe.valueOf("IB4A");
        assert (studiengruppe == Studiengruppe.IB4A);

        studiengruppe = Studiengruppe.valueOf("IB4B");
        assert (studiengruppe == Studiengruppe.IB4B);

        studiengruppe = Studiengruppe.valueOf("IB4C");
        assert (studiengruppe == Studiengruppe.IB4C);
    }
}