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

        Person one = new Student5("Isabel Simmet", "01839482728", "HM", Studiengruppe.IB2A);
        Person two = new Professor5("Thorsten Zimmer", "1234567890", "HM", "Mathematik");
        Person three = new Student5("Paul Müller", "01847294729", "HM", null);
        Person four = new Professor5("Andreas Zielke", "1234567890", "HM", null);
        Person five = new Hochschulperson5("Max Mustermann", "017483928374", "HM");

        if(one instanceof Student5){
            System.out.println(((Student5) one).getDetails());
        }
        else {
            System.out.println("Nicht kompatibel");
        }
        System.out.println(one.getAssignment());

        if(two instanceof Professor5){
            System.out.println(((Professor5) two).getDetails());
        }
        else {
            System.out.println("Nicht kompatibel");
        }
        System.out.println(two.getAssignment());

        if(three instanceof Student5){
            System.out.println(((Student5) three).getDetails());
        }
        else {
            System.out.println("Nicht kompatibel");
        }
        System.out.println(three.getAssignment());

        if(four instanceof Professor5){
            System.out.println(((Professor5) four).getDetails());
        }
        else {
            System.out.println("Nicht kompatibel");
        }
        System.out.println(four.getAssignment());

        if(five instanceof Hochschulperson5){
            System.out.println(((Hochschulperson5) five).getDetails());
        }
        else {
            System.out.println("Nicht kompatibel");
        }
        System.out.println(five.getAssignment());
    }
}