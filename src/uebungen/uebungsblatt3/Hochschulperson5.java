package uebungen.uebungsblatt3;

public class Hochschulperson5 implements Person {

    public String name;
    public String telefon;
    public String hochschule;
    public Adresse5 adresse;

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

    public String getAdresse(){
        return adresse.toString();
    }

    public String getDetails() {
        StringBuilder output = new StringBuilder();
        if(adresse != null){
            output.append("Name: \n" + name + "\n");
            output.append("Telefonnummer: " + telefon + "\n");
            output.append("Adresse: " + adresse + "\n");
            output.append(hochschule);
        }
        else {
            output.append("Name: \n" + name + "\n");
            output.append("Telefonnummer: " + telefon + "\n");
            output.append(hochschule);
        }
        return output.toString();
    }


    public String getAssignment(){
        if(hochschule != null){
            return "Name: " + name + "\nHochschule: " + hochschule;
        }
        else {
            return "Keiner Hochschule zugeordnet!";
        }
    }
}