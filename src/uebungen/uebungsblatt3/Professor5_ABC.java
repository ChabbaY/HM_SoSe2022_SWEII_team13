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
            output.append("Name:\n\t" + name + "\n");
            output.append("Telefonnummer:\n\t" + telefon + "\n");
            output.append("Adresse:\n\t" + adresse + "\n");
            output.append("Hochschule:\n\t" + hochschule + "\nFakultät:\n\t" + fakultaet);
        }
        else {
            output.append("Name:\n\t" + name + "\n");
            output.append("Telefonnummer:\n\t" + telefon + "\n");
            output.append("Adresse:\n\tnull\n");
            output.append("Hochschule:\n\t" + hochschule + "\nFakultät:\n\t" + fakultaet);
        }
        return output.toString();
        //output += (", " + fakultaet + "\n");
        //return output;
    }

    public String getAssignment(){
        if(fakultaet != null){
            return "Name:\n\t" + name + "\nFakultät:\n\t" + fakultaet;
        }
        else {
            return "Keine Fakultät hinterlegt!";
        }
    }
}