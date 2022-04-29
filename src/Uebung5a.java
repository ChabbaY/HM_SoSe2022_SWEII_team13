import uebungen.uebungsblatt3.*;

public abstract class Uebung5a implements Person {

    public static void main(String... args){

        Hochschulperson5 studentIsabel = new Student5("Isabel Simmet", "01839482728", "HM", Studiengruppe.IB2A);
        System.out.println(studentIsabel.getDetails());
        System.out.println(studentIsabel.getAssignment());

        Hochschulperson5 studentPaul = new Student5("Paul Müller", "01847294729", "HM", null);
        System.out.println(studentPaul.getDetails());
        System.out.println(studentPaul.getAssignment());

        Hochschulperson5 professorZimmer = new Professor5("Thorsten Zimmer", "1234567890", "HM", "Mathematik");
        System.out.println(professorZimmer.getDetails());
        System.out.println(professorZimmer.getAssignment());

        Hochschulperson5 professorZielke = new Professor5("Andreas Zielke", "1234567890", "HM", null);
        System.out.println(professorZielke.getDetails());
        System.out.println(professorZielke.getAssignment());

        Hochschulperson5 randomHochschulperson = new Hochschulperson5("Max Mustermann", "017483928374", "HM");
        System.out.println(randomHochschulperson.getDetails());
        System.out.println(randomHochschulperson.getAssignment());

        /* Person one = new Student5();
        Person two = new Professor5();
        Person three = new Student5();
        Person four = new Professor5();
        Person five = new Hochschulperson5();

        System.out.println(one.getDetails() + "\n\n" + one.getAssignment());
        System.out.println(two.getDetails() + "\n\n" + two.getAssignment());
        System.out.println(three.getDetails() + "\n\n" + three.getAssignment());
        System.out.println(four.getDetails() + "\n\n" + four.getAssignment());
        System.out.println(five.getDetails() + "\n\n" + five.getAssignment()); */
    }
}