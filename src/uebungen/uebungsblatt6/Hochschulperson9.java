package uebungen.uebungsblatt6;

import java.util.Objects;

public class Hochschulperson9 implements Person, Cloneable {

    protected final String name, telefon, hochschule;
    protected Adresse9 adresse;

    public Hochschulperson9(String name, String telefon, String hochschule) throws NullPointerException {
        if(name == null) throw new NullPointerException("Es wurde kein Name angegeben!");
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
    }

    public Hochschulperson9(String name, String telefon, String hochschule, Adresse9 adresse) throws CloneNotSupportedException, NullPointerException {
        if (name == null) throw new NullPointerException("Es wurde kein Name angegeben!");
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
        this.adresse = adresse.clone();
    }

    public Hochschulperson9(String name, String telefon, String hochschule, String[] randomAdresse) throws AdressException {
        if (name == null) throw new NullPointerException("Es wurde kein Name angegeben!");
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
        this.adresse = new Adresse9(randomAdresse[0], randomAdresse[1], Integer.parseInt(randomAdresse[2]), Ort.valueOf(randomAdresse[3]));
    }

    public String getName() {
        return name;
    }
    public String getTelefon() {
        return telefon;
    }
    public String getHochschule() {
        return hochschule;
    }
    public Adresse9 getAdresse() {
        return adresse;
    }

    public String getDetails() {
        StringBuilder output = new StringBuilder();
        if(adresse != null){
            output.append("Name:\n\t").append(name).append("\n");
            output.append("Telefonnummer:\n\t").append(telefon).append("\n");
            output.append("Adresse:\n\t").append(adresse).append("\n");
            output.append("Hochschule:\n\t").append(hochschule);
        }
        else {
            output.append("Name:\n\t").append(name).append("\n");
            output.append("Telefonnummer:\n\t").append(telefon).append("\n");
            output.append("Adresse:\n\tnull\n");
            output.append("Hochschule:\n\t").append(hochschule);
        }
        return output.toString();
    }

    public String getAssignment() {
        if(hochschule != null) {
            return "Name:\n\t" + name + "\nHochschule:\n\t" + hochschule;
        } else {
            return "Keine Hochschule hinterlegt!";
        }
    }

    public boolean isSame(Hochschulperson9 hp) {
        return (hp != null &&
                getClass() == hp.getClass() &&
                getName().equals(hp.getName()) &&
                getTelefon().equals(hp.getTelefon()) &&
                getHochschule().equals(hp.getHochschule()) &&
                ((this.adresse == null && hp.getAdresse() == null) || (this.adresse != null && getAdresse().equals(hp.getAdresse()))));
    }

    @Override
    public Hochschulperson9 clone() throws CloneNotSupportedException
    {
        Hochschulperson9 copy = (Hochschulperson9)super.clone();
        if (this.adresse != null) {
            copy.adresse = this.adresse.clone();
        }
        return copy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hochschulperson9 that = (Hochschulperson9) o;
        return Objects.equals(name, that.name) && Objects.equals(telefon, that.telefon) && Objects.equals(hochschule, that.hochschule) && Objects.equals(adresse, that.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, telefon, hochschule, adresse);
    }
}