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
        output += ("\nFakultät:\n\t" + fakultaet);
        return output;
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