package uebungen.uebungsblatt4;

import uebungen.uebungsblatt3.Person;

public class Hochschulperson6 implements Person, Cloneable {

    protected String name;
    protected String telefon;
    protected String hochschule;
    protected Adresse6 adresse;

    public Hochschulperson6(String name, String telefon, String hochschule) {
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
    }

    public Hochschulperson6(String name, Adresse6 adresse, String telefon, String hochschule)
            throws CloneNotSupportedException
    {
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
        this.adresse = adresse.clone();
    }

    public String getName(){
        return name;
    }

    public String getTelefon(){
        return telefon;
    }

    public String getHochschule(){
        return hochschule;
    }

    public Adresse6 getAdresse(){ return adresse; }

    public String getDetails() {
        StringBuilder output = new StringBuilder();
        if(adresse != null){
            output.append("Name:\n\t" + name + "\n");
            output.append("Telefonnummer:\n\t" + telefon + "\n");
            output.append("Adresse:\n\t" + adresse + "\n");
            output.append("Hochschule:\n\t" + hochschule);
        }
        else {
            output.append("Name:\n\t" + name + "\n");
            output.append("Telefonnummer:\n\t" + telefon + "\n");
            output.append("Adresse:\n\tnull\n");
            output.append("Hochschule:\n\t" + hochschule);
        }
        return output.toString();
    }

    public String getAssignment(){
        if(hochschule != null){
            return "Name:\n\t" + name + "\nHochschule:\n\t" + hochschule;
        }
        else {
            return "Keine Hochschule hinterlegt!";
        }
    }

    public boolean equals(Object hochschulperson){
        if(hochschulperson == null)
            return false;
        if(getClass() != hochschulperson.getClass())
            return false;
        if(!(getName().equals(((Hochschulperson6)hochschulperson).getName())))
            return false;
        if(!(getTelefon().equals(((Hochschulperson6)hochschulperson).getTelefon())))
            return false;
        if(!(getHochschule() == ((Hochschulperson6)hochschulperson).getHochschule()))
            return false;
        if(this.adresse == null) {
            if (((Hochschulperson6)hochschulperson).getAdresse() == null) {
                return true;
            }
        }
        if(this.adresse != null) {
            if (((Hochschulperson6) hochschulperson).getAdresse() != null) {
                if (this.adresse.equals(((Hochschulperson6)hochschulperson).getAdresse()))
                    return true;
            }
        }
        return false;
    }

    public boolean isSame(Hochschulperson6 hp){
        return (hp != null && getClass() == hp.getClass() && getName().equals(hp) && getTelefon().equals(hp) && getHochschule().equals(hp)
                && ((this.adresse == null && hp.getAdresse() == null) || (this.adresse != null && hp.getAdresse() != null)) && getAdresse().equals(hp));
    }

    @Override
    public Hochschulperson6 clone()
            throws CloneNotSupportedException
    {
        Hochschulperson6 copy = (Hochschulperson6)super.clone();
        if(this.adresse != null) {
            copy.adresse = this.adresse.clone();
        }
        return copy;
    }
}