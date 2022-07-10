import uebungen.uebungsblatt6.*;
import general.RandomValue;

import java.util.ArrayList;
import java.util.Arrays;

public class Uebung9 {
    public static void main(String[] args) {
        Hochschulperson9 hp1, hp2 = null, hp3, hp4 = null;
        hp1 = new Hochschulperson9(RandomValue.randomName(), RandomValue.randomTelefon(),
                RandomValue.randomHochschule());
        hp3 = new Hochschulperson9(RandomValue.randomName(), RandomValue.randomTelefon(),
                RandomValue.randomHochschule());
        try {
            hp2 = new Hochschulperson9(RandomValue.randomName(), RandomValue.randomTelefon(),
                    RandomValue.randomHochschule(), RandomValue.randomAdresse(Ort.class));
            hp4 = new Hochschulperson9(RandomValue.randomName(), RandomValue.randomTelefon(),
                    RandomValue.randomHochschule(), RandomValue.randomAdresse(Ort.class));
        } catch (AdressException e) {
            e.printStackTrace();
        }

        Student9 stud1, stud2 = null, stud3, stud4 = null;
        stud1 = new Student9(RandomValue.randomName(), RandomValue.randomTelefon(),
                RandomValue.randomHochschule(), Studiengruppe.valueOf(RandomValue.randomE(Studiengruppe.class)));
        stud3 = new Student9(RandomValue.randomName(), RandomValue.randomTelefon(),
                RandomValue.randomHochschule(), Studiengruppe.valueOf(RandomValue.randomE(Studiengruppe.class)));
        try {
            stud2 = new Student9(RandomValue.randomName(), RandomValue.randomTelefon(),
                    RandomValue.randomHochschule(), Studiengruppe.valueOf(RandomValue.randomE(Studiengruppe.class)),
                    RandomValue.randomAdresse(Ort.class));
            stud4 = new Student9(RandomValue.randomName(), RandomValue.randomTelefon(),
                    RandomValue.randomHochschule(), Studiengruppe.valueOf(RandomValue.randomE(Studiengruppe.class)),
                    RandomValue.randomAdresse(Ort.class));
        } catch (AdressException | CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Professor9 prof1, prof2 = null, prof3, prof4 = null;
        prof1 = new Professor9(RandomValue.randomName(), RandomValue.randomTelefon(),
                RandomValue.randomHochschule(), RandomValue.randomFakultaet());
        prof3 = new Professor9(RandomValue.randomName(), RandomValue.randomTelefon(),
                RandomValue.randomHochschule(), RandomValue.randomFakultaet());
        try {
            prof2 = new Professor9(RandomValue.randomName(), RandomValue.randomTelefon(),
                    RandomValue.randomHochschule(), RandomValue.randomFakultaet(),
                    RandomValue.randomAdresse(Ort.class));
            prof4 = new Professor9(RandomValue.randomName(), RandomValue.randomTelefon(),
                    RandomValue.randomHochschule(), RandomValue.randomFakultaet(),
                    RandomValue.randomAdresse(Ort.class));
        } catch (AdressException | CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //-----A-----

        //Initialisierung
        Person[] person = {hp1, null, hp2, null, stud1, null, stud2};

        //Tiefe Kopie
        Person[] personcopy = new Person[person.length];
        System.arraycopy(person, 0, personcopy, 0, person.length);
        System.out.println(Arrays.toString(personcopy));

        //get Assignment
        System.out.println("\nget Assignment");
        for (Person p : personcopy) {
            if (p != null) System.out.println(p.getAssignment());
        }

        //-----B-----

        //Vergleich
        System.out.println("Arrays equals? " + Arrays.equals(person, personcopy));

        //-----C-----

        //Übertrag
        ArrayList<Person> perslist = new ArrayList<>();
        for (Person p : person) {
            if (p != null) perslist.add(p);
        }

        //getStudygroup
        System.out.println("\nget Studygroup and Details");
        for (Person p : perslist) {
            if (p instanceof Student9) System.out.println("Stdygrp: " + ((Student9) p).getStudygroup());
            if (p instanceof Hochschulperson9) System.out.println(((Hochschulperson9) p).getDetails());
        }

        //-----C-----

        //conversion
        Person[] personcopy_2 = new Person[perslist.size()];
        for (int i = 0; i < personcopy_2.length; i++) {
            personcopy_2[i] = perslist.get(i);
        }

        //getAssignment
        System.out.println("\ngetAssignment");
        for (Person p : personcopy_2) {
            System.out.println(p.getAssignment());
        }
    }
}