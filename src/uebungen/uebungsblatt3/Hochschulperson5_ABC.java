package uebungen.uebungsblatt3;

public abstract class Hochschulperson5_ABC implements Person {

    protected String name;
    protected String telefon;
    protected String hochschule;
    protected Adresse5 adresse;

    protected Hochschulperson5_ABC(String name, String telefon, String hochschule) {
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
    }
    protected Hochschulperson5_ABC(String name, Adresse5 adresse, String telefon, String hochschule) {
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

    public abstract String getDetails();


    public String getAssignment(){
        if(hochschule != null){
            return "Name: " + name + "\nHochschule: " + hochschule + "\n";
        }
        else {
            return "Keiner Hochschule zugeordnet!\n";
        }
    }
}
