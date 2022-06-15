package uebungen.uebungsblatt5;

public class Adresse7 implements Cloneable {

    public String strasse;
    public String hausnummer;
    public int postleitzahl;
    public String ort;

    //Constructor with the given students adress data as parameters.
    public Adresse7(String strasse, String hausnummer, int postleitzahl, Ort ort)
                throws AdressException {
        if(ort == null) throw new AdressException("Es wurde kein Ort angegeben!");
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
        Adresse7 adresse = (Adresse7)o;
        if(!(getStrasse().equals(adresse.getStrasse())))
            return false;
        if(!(getHausnummer().equals((adresse.getHausnummer()))))
            return false;
        if(!(getOrt().equals(adresse.getOrt())))
            return false;
        if(!(getPLZ() == (((Adresse7)adresse).getPLZ())))
            return false;
        return true;
    }

    @Override
    public Adresse7 clone()
                throws CloneNotSupportedException
    {
        return (Adresse7)super.clone();
    }
}