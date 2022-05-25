package uebungen.uebungsblatt4;

public class Professor6 extends Hochschulperson6 implements Cloneable {

    public String fakultaet;

    public Professor6(String name, String telefon, String hochschule, String fakultaet) {
        super(name, telefon, hochschule);
        this.fakultaet = fakultaet;
    }
    public Professor6(String name, Adresse6 adresse, String telefon, String hochschule, String fakultaet)
            throws CloneNotSupportedException
    {
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

    public Professor6 clone()
            throws CloneNotSupportedException
    {
        return (Professor6)super.clone();
    }
}