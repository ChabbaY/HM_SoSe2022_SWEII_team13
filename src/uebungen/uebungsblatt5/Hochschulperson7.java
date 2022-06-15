package uebungen.uebungsblatt5;

public class Hochschulperson7 implements Person, Cloneable {

    protected String name;
    protected String telefon;
    protected String hochschule;
    protected Adresse7 adresse;

    public Hochschulperson7(String name, String telefon, String hochschule)
                throws NullPointerException {
        if(name == null) throw new NullPointerException("Es wurde kein Name angegeben!");
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
    }

    public Hochschulperson7(String name, Adresse7 adresse, String telefon, String hochschule)
            throws CloneNotSupportedException, NullPointerException
    {
        if(name == null) throw new NullPointerException("Es wurde kein Name angegeben!");
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

    public Adresse7 getAdresse(){ return adresse; }

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

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null)
            return false;
        if(getClass() != o.getClass())
            return false;
        Hochschulperson7 hochschulperson = (Hochschulperson7)o;
        if(!(getName().equals(hochschulperson.getName())))
            return false;
        if(!(getTelefon().equals(hochschulperson.getTelefon())))
            return false;
        if(!(getHochschule().equals(hochschulperson.getHochschule())))
            return false;
        if(this.adresse == null) {
            if (hochschulperson.getAdresse() == null) {
                return true;
            }
        }
        if(this.adresse != null) {
            if (hochschulperson.getAdresse() != null) {
                if (this.adresse.equals(hochschulperson.getAdresse()))
                    return true;
            }
        }
        return false;
    }

    public boolean isSame(Hochschulperson7 hp){
        return (hp != null && getClass() == hp.getClass()
                && getName().equals(hp.getName()) && getTelefon().equals(hp.getTelefon()) && getHochschule().equals(hp.getHochschule())
                && ((this.adresse == null && hp.getAdresse() == null) || (this.adresse != null && getAdresse().equals(hp.getAdresse()))));
    }

    @Override
    public Hochschulperson7 clone()
            throws CloneNotSupportedException
    {
        Hochschulperson7 copy = (Hochschulperson7)super.clone();
        if(this.adresse != null) {
            copy.adresse = this.adresse.clone();
        }
        return copy;
    }
}