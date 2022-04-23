package uebungen.uebungsblatt3;

public class Adresse5 {

    public String strasse;
    public String hausnummer;
    public int postleitzahl;
    public String ort;

    //Constructor with the given students adress data as parameters.
    public Adresse5(String strasse, String hausnummer, int postleitzahl,  Ort ort){
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.ort = ort.name();
    }

    public Adresse5(Adresse5 adresse) {
    }

    @Override //overrides toString method with costumized adress return.

    //Method returns the students adress data in a specific order and format.
    public String toString(){
        return strasse + " " + hausnummer + "\n" + postleitzahl + " " + ort + ",";
    }
}