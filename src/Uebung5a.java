import uebungen.uebungsblatt3.*;

public abstract class Uebung5a implements Person { //made it abstract.. but what does it mean?

    public static void main(String... args){

        Hochschulperson5 student1 = new Student5("Max Mustermann", "0987654321", "HM", Studiengruppe.IB2A);
        System.out.println(student1.getDetails());

        Hochschulperson5 professor1 = new Professor5("Thorsten Zimmer", "1234567890", "HM", "Mathematik");
        System.out.println(professor1.getDetails());

        Hochschulperson5 randomHochschulperson = new Hochschulperson5("Frau Mustermann", "08918349289", "Muster-Hochschule");

        Person one = student1;
        Person two = professor1;
        Person three = randomHochschulperson;

        System.out.println(one.getDetails() + "\n\n" + one.getAssignment());
        System.out.println(two.getDetails() + "\n\n" + two.getAssignment());
        System.out.println(three.getDetails() + "\n\n" + three.getAssignment());
    }
}