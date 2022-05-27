import uebungen.uebungsblatt4.*;
import general.RandomValue;
import uebungen.uebungsblatt4.Studiengruppe;

public class Uebung6 {

public static void main(String... args) throws Exception {

        //Testing equals-method with random Adresse6 objects
        Adresse6 one = new Adresse6("Musterstraße", "15", 81928, Ort.Karlsruhe);
        Adresse6 two = new Adresse6("Musterstraße", "20", 81928, Ort.Berlin);
        System.out.println("Zwei Adressen mit unterschiedlicher Hausnummer. false == " + one.equals(two));

        Adresse6 three = new Adresse6("Musterstraße", "15", 81928, Ort.Karlsruhe);
        Adresse6 four = new Adresse6("Musterstraße", "15", 81928, Ort.München);
        System.out.println("Zwei Adressen mit unterschiedlichem Ort. false == " + four.equals(three));

        Adresse6 five = new Adresse6("Musterstraße", "15", 81928, Ort.Karlsruhe);
        Adresse6 six = new Adresse6("Musterstraße", "15", 81928, Ort.Karlsruhe);
        System.out.println("Zwei gleiche Adressen. true == " + six.equals(five));

        System.out.println();

        //Testing isSame() method with random Hochschulperson6 objects
        Hochschulperson6 hp1 = new Hochschulperson6("Max Mustermann", new Adresse6("Musterstraße", "13", 48293, Ort.Berlin), "01829382983", "HM");
        Hochschulperson6 hp2 = new Hochschulperson6("Max Mustermann", new Adresse6("Musterstraße", "13b", 48293, Ort.Berlin), "01829382983", "HM");
        System.out.println("Zwei gleiche Hochschulpersonen aber mit unterschiedlicher Hausnummer. false == " + hp1.isSame(hp2));

        Hochschulperson6 hp5 = new Hochschulperson6("Max Mustermann", new Adresse6("Musterstraße", "13", 48293, Ort.Berlin), "01829382983", "HM");
        Hochschulperson6 hp6 = new Hochschulperson6("Max Mustermann", new Adresse6("Musterstraße", "13", 48293, Ort.Berlin), "01829382983", "HM");
        System.out.println("Zwei gleiche Hochschulpersonen mit gleicher Adresse. true == " + hp6.isSame(hp5));

        Hochschulperson6 hp7 = new Hochschulperson6(RandomValue.randomName(), "01829382983", "HM");
        Hochschulperson6 hp8 = new Hochschulperson6(RandomValue.randomName(), "01829382983", "HM");
        System.out.println("Zwei Hochschulpersonen mit unterschiedlichem Namen. false == " + hp7.isSame(hp8));

        Hochschulperson6 hp9 = new Hochschulperson6("Max Mustermann", "01829382983", "HM");
        Hochschulperson6 hp10 = new Hochschulperson6("Max Mustermann", "01829382983", "HM");
        System.out.println("Zwei gleiche Hochschulpersonen ohne Adresse. true == " + hp9.equals(hp10));

        System.out.println();

        //Testing similar objects from a different class
        Student6 stud1 = new Student6(RandomValue.randomName(), new Adresse6("Musterstraße", "13", 48293, Ort.Berlin), RandomValue.randomTelefon(), RandomValue.randomHochschule(), Studiengruppe.valueOf(RandomValue.randomE(Studiengruppe.class)));
        System.out.println("Vergleich von einer Hochschulperson mit einem Studentenobjekt. false == " + hp1.isSame(stud1));
        System.out.println();

        //Testing isSame() method with random Student6 objects
        Student6 stud2 = new Student6("Manfred Huber", "017283948928", "HM", Studiengruppe.IB2A);
        Student6 stud3 = new Student6("Manfred Huber", "017283948928", "HM", Studiengruppe.IB2A);
        System.out.println("Zwei gleiche Studentenobjekte ohne Adresse. true == " + stud3.isSame(stud2));

        Student6 stud6 = new Student6("Manfred Huber", new Adresse6("Musterstraße", "13", 72839, Ort.München), "017283948928", "LMU", Studiengruppe.IB2A);
        Student6 stud7 = new Student6("Manfred Huber", new Adresse6("Musterstraße", "13b", 72839, Ort.München),"017283948928", "LMU", Studiengruppe.IB2A);
        System.out.println("Zwei Studentenobjekte mit leicht unterschiedlicher Adresse. false ==  " + stud7.isSame(stud6));

        Student6 stud8 = new Student6("Manfred Huber", new Adresse6("Musterstraße", "13", 72839, Ort.München), "017283948928", "LMU", Studiengruppe.IB2A);
        Student6 stud9 = new Student6("Manfred Huber", new Adresse6("Musterstraße", "13", 72839, Ort.München),"017283948928", "LMU", Studiengruppe.IB2A);
        System.out.println("Zwei Studentenobjekte mit gleicher Adresse. true ==  " + stud9.isSame(stud8));
        System.out.println();

    try{
        //Testing clone-Method with random Adresse6 object
        Adresse6 seven = one.clone();
        System.out.println("Geklonte Adresse. true ==  " + seven.equals(one));

        System.out.println();

        //Testing clone() method with different Hochschulperson6 objects
        Hochschulperson6 hp3 = hp1.clone();
        System.out.println("Geklonte Hochschulperson mit Adresse. true == " + hp1.isSame(hp3));
        Hochschulperson6 hp4 = hp7.clone();
        System.out.println("Geklonte Hochschulperson ohne Adresse. true == " + hp4.isSame(hp7));

        System.out.println();

        //Testing clone() method with different Student6 objects
        Student6 stud10 = stud2.clone();
        System.out.println("Geklontes Studentenobjekt mit Adresse. true == " + stud10.isSame(stud2));
        Student6 stud11 = stud8.clone();
        System.out.println("Geklontes Studentenobjekt ohne Adresse. true == " + stud11.isSame(stud8));

    }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
