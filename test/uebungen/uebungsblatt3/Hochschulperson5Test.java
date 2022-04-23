package uebungen.uebungsblatt3;

import org.junit.jupiter.api.Test;

class Hochschulperson5Test {
    @Test
    void getDetails() {
        Hochschulperson5 hochschulperson = new Hochschulperson5("Hans Meier", "123456", "HM");
        System.out.println(hochschulperson.getDetails());
        assert hochschulperson.getDetails().equals("""
                Name:
                \tHans Meier
                Telefonnummer:
                \t123456
                Adresse:
                \tnull
                Hochschule:
                \tHM""");

        hochschulperson = new Hochschulperson5("Peter Müller", new Adresse5("Hauptstraße", "1", 85747, Ort.München), "98765", "TUM");
        System.out.println(hochschulperson.getDetails());
        assert hochschulperson.getDetails().equals("""
                Name:
                \tPeter Müller
                Telefonnummer:
                \t98765
                Adresse:
                \tHauptstraße 1, 85747 München
                Hochschule:
                \tTUM""");

        hochschulperson = new Professor5("Prof. Zimmer", null, "HM", "FK07");
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

        hochschulperson = new Student5("Max Musterstudent", "1234567", "HM", Studiengruppe.IB2A);
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
        Hochschulperson5 hochschulperson = new Hochschulperson5("Hans Meier", "123456", "HM");
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("""
                Name:
                \tHans Meier
                Hochschule:
                \tHM""");

        hochschulperson = new Hochschulperson5("Peter Müller", new Adresse5("Hauptstraße", "1", 85747, Ort.München), "98765", null);
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("Keine Hochschule hinterlegt!");

        hochschulperson = new Professor5("Prof. Zimmer", null, "HM", "FK07");
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("""
                Name:
                \tProf. Zimmer
                Fakultät:
                \tFK07""");

        hochschulperson = new Professor5("Prof. Huber", null, null, null);
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("Keine Fakultät hinterlegt!");

        hochschulperson = new Student5("Max Musterstudent", "1234567", "HM", Studiengruppe.IB2A);
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("""
                Name:
                \tMax Musterstudent
                Studiengruppe:
                \tIB2A""");

        hochschulperson = new Student5("Max Musterstudent", null, "HM", null);
        System.out.println(hochschulperson.getAssignment());
        assert hochschulperson.getAssignment().equals("Keine Studiengruppe hinterlegt!");
    }
}