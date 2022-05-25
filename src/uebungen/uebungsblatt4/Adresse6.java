package uebungen.uebungsblatt4;

import uebungen.uebungsblatt3.Ort;

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

    public boolean equals(Object adresse){
        if(adresse == null)
            return false;
        if(getClass() != adresse.getClass())
            return false;
        if(!(getStrasse().equals(((Adresse6)adresse).getStrasse())))
            return false;
        if(!(getHausnummer() == ((Adresse6)adresse).getHausnummer()))
            return false;
        if(!(getOrt().equals(((Adresse6)adresse).getOrt())))
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