package uebungen.uebungsblatt3;

import org.junit.jupiter.api.Test;

class Hochschulperson5ABCTest {
    @Test
    void getDetails() {
        Hochschulperson5_ABC hochschulperson = new Professor5_ABC("Prof. Zimmer", null, "HM", "FK07");
        System.out.println(hochschulperson.getDetails());
        assert hochschulperson.getDetails().equals("""
                Name:
                \tProf. Zimmer
                Telefonnummer:
                \tnull
                Adresse:
                \tnull
                Hochschule:
                \tHM
                Fakultät:
                \tFK07""");

        hochschulperson = new Student5_ABC("Max Musterstudent", "1234567", "HM", Studiengruppe.IB2A);
        System.out.println(hochschulperson.getDetails());
        assert hochschulperson.getDetails().equals("""
                Name:
                \tMax Musterstudent
                Telefonnummer:
                \t1234567
                Adresse:
                \tnull
                Hochschule:
                \tHM
                Studiengruppe:
                \tIB2A""");
    }

    @Test
    void getAssignment() {
        Hochschulperson5_ABC hochschulperson = new Hochschulperson5_ABC("Hans Maier", "123456", "HM") {
            @Override
            public String getDetails() {
                return null;
            }
        };
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("""
                Name:
                \tHans Maier
                Hochschule:
                \tHM""");

        hochschulperson = new Hochschulperson5_ABC("Hans Maier", "123456", null, null) {
            @Override
            public String getDetails() {
                return null;
            }
        };
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("Keine Hochschule hinterlegt!");

        hochschulperson = new Professor5_ABC("Prof. Zimmer", null, "HM", "FK07");
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("""
                Name:
                \tProf. Zimmer
                Fakultät:
                \tFK07""");

        hochschulperson = new Professor5_ABC("Prof. Huber", null, null, null);
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("Keine Fakultät hinterlegt!");

        hochschulperson = new Student5_ABC("Max Musterstudent", "1234567", "HM", Studiengruppe.IB2A);
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("""
                Name:
                \tMax Musterstudent
                Studiengruppe:
                \tIB2A""");

        hochschulperson = new Student5_ABC("Max Musterstudent", null, "HM", null);
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("Keine Studiengruppe hinterlegt!");
    }
}