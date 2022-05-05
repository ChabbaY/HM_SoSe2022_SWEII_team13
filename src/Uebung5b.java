import uebungen.uebungsblatt3.*;

public class Uebung5b {

    public static void main(String... args){

        Hochschulperson5_ABC studentSophie = new Student5_ABC("Sophie Mustermann", "01839482728", "HM", Studiengruppe.IB2C);
        System.out.println(studentSophie.getDetails());
        System.out.println(studentSophie.getAssignment());

        Hochschulperson5_ABC studentJohannes = new Student5_ABC("Johannes Mustermann", "01847294729", "HM", null);
        System.out.println(studentJohannes.getDetails());
        System.out.println(studentJohannes.getAssignment());

        Hochschulperson5_ABC professorRuhnke = new Professor5_ABC("Professor Ruhnke", "1234567890", "HM", "Betriebswirtschaft");
        System.out.println(professorRuhnke.getDetails());
        System.out.println(professorRuhnke.getAssignment());

        Hochschulperson5_ABC professorZielke = new Professor5_ABC("Andreas Zielke", "1234567890", "HM", null);
        System.out.println(professorZielke.getDetails());
        System.out.println(professorZielke.getAssignment());

        Person one = new Student5_ABC("Isabel Simmet", "01839482728", "HM", Studiengruppe.IB2A);
        Person two = new Professor5_ABC("Thorsten Zimmer", "1234567890", "HM", "Mathematik");
        Person three = new Student5_ABC("Paul Müller", "01847294729", "HM", null);
        Person four = new Professor5_ABC("Andreas Zielke", "1234567890", "HM", null);

        if(one instanceof Student5_ABC){
            System.out.println(((Student5_ABC) one).getDetails());
        }
        else {
            System.out.println("Nicht kompatibel");
        }
        System.out.println(one.getAssignment());

        if(two instanceof Professor5_ABC){
            System.out.println(((Professor5_ABC) two).getDetails());
        }
        else {
            System.out.println("Nicht kompatibel");
        }
        System.out.println(two.getAssignment());

        if(three instanceof Student5_ABC){
            System.out.println(((Student5_ABC) three).getDetails());
        }
        else {
            System.out.println("Nicht kompatibel");
        }
        System.out.println(three.getAssignment());

        if(four instanceof Professor5_ABC){
            System.out.println(((Professor5_ABC) four).getDetails());
        }
        else {
            System.out.println("Nicht kompatibel");
        }
        System.out.println(four.getAssignment());
    }
}