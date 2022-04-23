package uebungen.uebungsblatt3;

public class Professor5 extends Hochschulperson5{

    public String fakultaet;

    public Professor5(String name, String telefon, String hochschule, String fakultaet) {
        super(null, null, null);
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
        this.fakultaet = fakultaet;
    }
    public Professor5(String name, Adresse5 adresse2, String telefon, String hochschule, String fakultaet) {
        super(null, null, null);
        this.adresse = new Adresse5(adresse2);
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
        this.fakultaet = fakultaet;
    }

    public String getFakultaet(){
        return fakultaet;
    }

    public String getDetails(){
        StringBuilder output = new StringBuilder();
        if(adresse != null){
            output.append("Name: \n" + name + "\n");
            output.append("Telefonnummer: " + telefon + "\n");
            output.append("Adresse: " + adresse + "\n");
            output.append(hochschule + ", " + fakultaet + "\n");
        }
        else {
            output.append("Name: \n" + name + "\n");
            output.append("Telefonnummer: " + telefon + "\n");
            output.append(hochschule + ", " + fakultaet + "\n");
        }
        return output.toString();
    }

    //this method checks wether there is a study group defined for this student or not
    public String getAssignment(){
        if(fakultaet != null){
            return "Name: " + name + "\nStudiengruppe: " + fakultaet;
        }
        else {
            return "Keiner Studiengruppe zugeordnet!";
        }
    }
}