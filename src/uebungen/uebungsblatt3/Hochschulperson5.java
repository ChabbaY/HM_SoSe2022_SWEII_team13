package uebungen.uebungsblatt3;

public class Hochschulperson5 implements Person {

    protected String name;
    protected String telefon;
    protected String hochschule;
    protected Adresse5 adresse;

    public Hochschulperson5(String name, String telefon, String hochschule) {
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
    }

    public Hochschulperson5(String name, Adresse5 adresse, String telefon, String hochschule) {
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
        this.adresse = new Adresse5(adresse);
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

    public Adresse5 getAdresse(){ return adresse; }

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
}