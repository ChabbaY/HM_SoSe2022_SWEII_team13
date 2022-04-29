package uebungen.uebungsblatt3;

public class Professor5 extends Hochschulperson5{

    public String fakultaet;

    public Professor5(String name, String telefon, String hochschule, String fakultaet) {
        super(name, telefon, hochschule);
        this.fakultaet = fakultaet;
    }
    public Professor5(String name, Adresse5 adresse, String telefon, String hochschule, String fakultaet) {
        super(name, adresse, telefon, hochschule);
        this.fakultaet = fakultaet;
    }

    public String getFakultaet(){
        return fakultaet;
    }

    public String getDetails() {
        String output = super.getDetails();
        if (fakultaet != null) {
            output += (", " + fakultaet + "\n");
            return output;
        } else {
            return "Keiner Fakultät zugeordnet!";
        }
    }

    public String getAssignment(){
        if(fakultaet != null){
            return "Name: " + name + "\nFakultät: " + fakultaet;
        }
        else {
            return "Keiner Fakultät zugeordnet!";
        }
    }
}