package uebungen.uebungsblatt4;

public class Adresse6 implements Cloneable {

    public String strasse;
    public String hausnummer;
    public int postleitzahl;
    public String ort;

    //Constructor with the given students adress data as parameters.
    public Adresse6(String strasse, String hausnummer, int postleitzahl, Ort ort){
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.ort = ort.name();
    }

    String getStrasse () {
        return strasse;
    }

    String getHausnummer(){
        return hausnummer;
    }

    int getPLZ(){
        return postleitzahl;
    }

    String getOrt(){
        return ort;
    }

    @Override //overrides toString method with costumized adress return.

    //Method returns the students adress data in a specific order and format.
    public String toString(){
        return strasse + " " + hausnummer + ", " + postleitzahl + " " + ort;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null)
            return false;
        if(getClass() != o.getClass())
            return false;
        Adresse6 adresse = (Adresse6)o;
        if(!(getStrasse().equals(adresse.getStrasse())))
            return false;
        if(!(getHausnummer().equals((adresse.getHausnummer()))))
            return false;
        if(!(getOrt().equals(adresse.getOrt())))
            return false;
        if(!(getPLZ() == (((Adresse6)adresse).getPLZ())))
            return false;
        return true;
    }

    @Override
    public Adresse6 clone()
                throws CloneNotSupportedException
    {
        return (Adresse6)super.clone();
    }
}