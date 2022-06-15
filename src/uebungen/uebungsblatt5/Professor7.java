package uebungen.uebungsblatt5;

public class Professor7 extends Hochschulperson7 implements Cloneable {

    public String fakultaet;

    public Professor7(String name, String telefon, String hochschule, String fakultaet)
                    throws NullPointerException {
        super(name, telefon, hochschule);
        this.fakultaet = fakultaet;
    }
    public Professor7(String name, Adresse7 adresse, String telefon, String hochschule, String fakultaet)
            throws CloneNotSupportedException, NullPointerException
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

    public boolean isSame(Professor7 prof){
        return (super.isSame(prof) && getFakultaet().equals(prof.getFakultaet()));
    }

    public Professor7 clone()
            throws CloneNotSupportedException
    {
        return (Professor7)super.clone();
    }
}