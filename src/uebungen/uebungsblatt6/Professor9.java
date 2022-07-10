package uebungen.uebungsblatt6;

import java.util.Objects;

public class Professor9 extends Hochschulperson9 implements Cloneable {

    private final String fakultaet;

    public Professor9(String name, String telefon, String hochschule, String fakultaet) throws NullPointerException {
        super(name, telefon, hochschule);
        this.fakultaet = fakultaet;
    }
    public Professor9(String name, String telefon, String hochschule, String fakultaet, Adresse9 adresse) throws CloneNotSupportedException, NullPointerException {
        super(name, telefon, hochschule, adresse);
        this.fakultaet = fakultaet;
    }
    public Professor9(String name, String telefon, String hochschule, String fakultaet, String[] randomAdresse) throws CloneNotSupportedException, NullPointerException, AdressException {
        super(name, telefon, hochschule);
        this.fakultaet = fakultaet;
        this.adresse = new Adresse9(randomAdresse[0], randomAdresse[1], Integer.parseInt(randomAdresse[2]), Ort.valueOf(randomAdresse[3]));
    }

    public String getFakulty() {
        return fakultaet;
    }

    @Override
    public String getDetails() {
        String output = super.getDetails();
        output += ("\nFakultät:\n\t" + fakultaet);
        return output;
    }

    @Override
    public String getAssignment() {
        if (fakultaet != null) {
            return "Name:\n\t" + name + "\nFakultät:\n\t" + fakultaet;
        } else {
            return "Keine Fakultät hinterlegt!";
        }
    }

    @Override
    public Professor9 clone() throws CloneNotSupportedException
    {
        return (Professor9)super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor9 that = (Professor9) o;
        return Objects.equals(fakultaet, that.fakultaet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fakultaet);
    }
}