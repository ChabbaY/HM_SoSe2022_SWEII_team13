package uebungen.uebungsblatt3;

public class Professor5_ABC extends Hochschulperson5_ABC{

    public String fakultaet;

    public Professor5_ABC(String name, String telefon, String hochschule, String fakultaet) {
        super(name, telefon, hochschule);
        this.fakultaet = fakultaet;
    }
    public Professor5_ABC(String name, Adresse5 adresse, String telefon, String hochschule, String fakultaet) {
        super(name, adresse, telefon, hochschule);
        this.fakultaet = fakultaet;
    }

    public String getFakultaet(){
        return fakultaet;
    }

    public String getDetails() {
        //String output = super.getDetails();
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
            output.append(hochschule);
        }
        return output.toString();
        //output += (", " + fakultaet + "\n");
        //return output;
    }

    public String getAssignment(){
        if(fakultaet != null){
            return "Name: " + name + "\nFakultät: " + fakultaet + "\n";
        }
        else {
            return "Keiner Fakultät zugeordnet!\n";
        }
    }
}