package uebungen.uebungsblatt6;

import java.util.Objects;

public class Student9 extends Hochschulperson9 implements Cloneable {

    private final Studiengruppe studiengruppe;


    public Student9(String name, String telefon, String hochschule, Studiengruppe studiengruppe) throws NullPointerException {
        super(name, telefon, hochschule);
        this.studiengruppe = studiengruppe;
    }
    public Student9(String name, String telefon, String hochschule, Studiengruppe studiengruppe, Adresse9 adresse) throws CloneNotSupportedException, NullPointerException {
        super(name, telefon, hochschule, adresse);
        this.studiengruppe = studiengruppe;
    }
    public Student9(String name, String telefon, String hochschule, Studiengruppe studiengruppe, String[] randomAdresse) throws CloneNotSupportedException, NullPointerException, AdressException {
        super(name, telefon, hochschule);
        this.studiengruppe = studiengruppe;
        this.adresse = new Adresse9(randomAdresse[0], randomAdresse[1], Integer.parseInt(randomAdresse[2]), Ort.valueOf(randomAdresse[3]));
    }

    public Studiengruppe getStudygroup() {
        return studiengruppe;
    }

    @Override
    public String getDetails() {
        String output = super.getDetails();
        output += ("\nStudiengruppe:\n\t" + studiengruppe);
        return output;
    }

    //this method checks wether there is a study group defined for this student or not
    @Override
    public String getAssignment() {
        if(studiengruppe != null) {
            return "Name:\n\t" + name + "\nStudiengruppe:\n\t" + studiengruppe;
        } else {
            return "Keine Studiengruppe hinterlegt!";
        }
    }

    @Override
    public Student9 clone() throws CloneNotSupportedException {
        return (Student9)super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student9 student9 = (Student9) o;
        return studiengruppe == student9.studiengruppe;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studiengruppe);
    }
}