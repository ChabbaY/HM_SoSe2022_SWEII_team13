package uebungen.uebungsblatt6;

public class Adresse9 implements Cloneable {

    private final String strasse, hausnummer, ort;
    private final int postleitzahl;

    //Constructor with the given students adress data as parameters.
    public Adresse9(String strasse, String hausnummer, int postleitzahl, Ort ort) throws AdressException {
        if(ort == null) throw new AdressException("Es wurde kein Ort angegeben!");
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.ort = ort.name();
    }

    public String getStrasse () {
        return strasse;
    }
    public String getHausnummer() {
        return hausnummer;
    }
    public int getPLZ() {
        return postleitzahl;
    }
    public String getOrt() {
        return ort;
    }

    @Override
    public Adresse9 clone() throws CloneNotSupportedException {
        return (Adresse9)super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Adresse9 adresse = (Adresse9)o;
        return (adresse.strasse.equals(this.strasse) && adresse.hausnummer.equals(this.hausnummer) &&
                (adresse.postleitzahl == this.postleitzahl) && adresse.ort.equals(this.ort));
    }

    //Method returns the students adress data in a specific order and format.
    @Override
    public String toString() {
        return String.format("%s %s, %s %s", strasse, hausnummer, postleitzahl, ort);
    }
}