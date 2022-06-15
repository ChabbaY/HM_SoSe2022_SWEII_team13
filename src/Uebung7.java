import general.RandomValue;
import uebungen.uebungsblatt5.*;

public class Uebung7 {

    public static void main(String... args) throws Exception {

        try {
            //Testing equals-method with random Adresse6 objects
            Adresse7 one = new Adresse7("Musterstraße", "15", 81928, Ort.Karlsruhe);
            Adresse7 two = new Adresse7("Musterstraße", "20", 81928, Ort.Berlin);
            System.out.println("Zwei Adressen mit unterschiedlicher Hausnummer. false == " + one.equals(two));

            Adresse7 three = new Adresse7("Musterstraße", "15", 81928, Ort.Karlsruhe);
            Adresse7 four = new Adresse7("Musterstraße", "15", 81928, Ort.München);
            System.out.println("Zwei Adressen mit unterschiedlichem Ort. false == " + four.equals(three));

            Adresse7 five = new Adresse7("Musterstraße", "15", 81928, Ort.Karlsruhe);
            Adresse7 six = new Adresse7("Musterstraße", "15", 81928, Ort.Karlsruhe);
            System.out.println("Zwei gleiche Adressen. true == " + six.equals(five));

            System.out.println();

            //Testing isSame() method with random Hochschulperson6 objects
            Hochschulperson7 hp1 = new Hochschulperson7("Max Mustermann", new Adresse7("Musterstraße", "13", 48293, Ort.Berlin), "01829382983", "HM");
            Hochschulperson7 hp2 = new Hochschulperson7("Max Mustermann", new Adresse7("Musterstraße", "13b", 48293, Ort.Berlin), "01829382983", "HM");
            System.out.println("Zwei gleiche Hochschulpersonen aber mit unterschiedlicher Hausnummer. false == " + hp1.isSame(hp2));

            Hochschulperson7 hp5 = new Hochschulperson7("Max Mustermann", new Adresse7("Musterstraße", "13", 48293, null), "01829382983", "HM");
            Hochschulperson7 hp6 = new Hochschulperson7("Max Mustermann", new Adresse7("Musterstraße", "13", 48293, Ort.Berlin), "01829382983", "HM");
            System.out.println("Zwei gleiche Hochschulpersonen mit gleicher Adresse. true == " + hp6.isSame(hp5));

            Hochschulperson7 hp7 = new Hochschulperson7(RandomValue.randomName(), "01829382983", "HM");
            Hochschulperson7 hp8 = new Hochschulperson7(RandomValue.randomName(), "01829382983", "HM");
            System.out.println("Zwei Hochschulpersonen mit unterschiedlichem Namen. false == " + hp7.isSame(hp8));

            Hochschulperson7 hp9 = new Hochschulperson7("Max Mustermann", "01829382983", "HM");
            Hochschulperson7 hp10 = new Hochschulperson7("Max Mustermann", "01829382983", "HM");
            System.out.println("Zwei gleiche Hochschulpersonen ohne Adresse. true == " + hp9.equals(hp10));

            System.out.println();

            //Testing similar objects from a different class
            Student7 stud1 = new Student7(RandomValue.randomName(), new Adresse7("Musterstraße", "13", 48293, Ort.Berlin), RandomValue.randomTelefon(), RandomValue.randomHochschule(), Studiengruppe.valueOf(RandomValue.randomE(Studiengruppe.class)));
            System.out.println("Vergleich von einer Hochschulperson mit einem Studentenobjekt. false == " + hp1.isSame(stud1));
            System.out.println();

            //Testing isSame() method with random Student6 objects
            Student7 stud2 = new Student7("Manfred Huber", "017283948928", "HM", Studiengruppe.IB2A);
            Student7 stud3 = new Student7("Manfred Huber", "017283948928", "HM", Studiengruppe.IB2A);
            System.out.println("Zwei gleiche Studentenobjekte ohne Adresse. true == " + stud3.isSame(stud2));

            Student7 stud6 = new Student7("Manfred Huber", new Adresse7("Musterstraße", "13", 72839, Ort.München), "017283948928", "LMU", Studiengruppe.IB2A);
            Student7 stud7 = new Student7("Manfred Huber", new Adresse7("Musterstraße", "13b", 72839, Ort.München), "017283948928", "LMU", Studiengruppe.IB2A);
            System.out.println("Zwei Studentenobjekte mit leicht unterschiedlicher Adresse. false ==  " + stud7.isSame(stud6));

            Student7 stud8 = new Student7("Manfred Huber", new Adresse7("Musterstraße", "13", 72839, Ort.München), "017283948928", "LMU", Studiengruppe.IB2A);
            Student7 stud9 = new Student7("Manfred Huber", new Adresse7("Musterstraße", "13", 72839, Ort.München), "017283948928", "LMU", Studiengruppe.IB2A);
            System.out.println("Zwei Studentenobjekte mit gleicher Adresse. true ==  " + stud9.isSame(stud8));
            System.out.println();

            //Testing clone-Method with random Adresse6 object
            Adresse7 seven = one.clone();
            System.out.println("Geklonte Adresse. true ==  " + seven.equals(one));

            System.out.println();

            //Testing clone() method with different Hochschulperson6 objects
            Hochschulperson7 hp3 = hp1.clone();
            System.out.println("Geklonte Hochschulperson mit Adresse. true == " + hp1.isSame(hp3));
            Hochschulperson7 hp4 = hp7.clone();
            System.out.println("Geklonte Hochschulperson ohne Adresse. true == " + hp4.isSame(hp7));

            System.out.println();

            //Testing clone() method with different Student6 objects
            Student7 stud10 = stud2.clone();
            System.out.println("Geklontes Studentenobjekt mit Adresse. true == " + stud10.isSame(stud2));
            Student7 stud11 = stud8.clone();
            System.out.println("Geklontes Studentenobjekt ohne Adresse. true == " + stud11.isSame(stud8));

            } catch (NullPointerException np) {
                System.out.println("Es ist ein Eingabefehler aufgetreten: " + np.getMessage());
            }
            catch (AdressException ae) {
                System.out.println("Es ist ein Fehler aufgetreten: " + ae.getMessage());
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        finally{
            System.out.println("Last Exit");
        }

    }
}
