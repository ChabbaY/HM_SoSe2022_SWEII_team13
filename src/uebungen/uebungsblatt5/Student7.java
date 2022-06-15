package uebungen.uebungsblatt5;

public class Student7 extends Hochschulperson7 implements Cloneable {

    public Studiengruppe studiengruppe;


    public Student7(String name, String telefon, String hochschule, Studiengruppe studiengruppe)
                        throws NullPointerException {
        super(name, telefon, hochschule);
        if(name == null) throw new NullPointerException("Es wurde kein Name angegeben!");
        this.studiengruppe = studiengruppe;
    }
    public Student7(String name, Adresse7 adresse, String telefon, String hochschule, Studiengruppe studiengruppe)
            throws CloneNotSupportedException, NullPointerException
    {
        super(name, adresse, telefon, hochschule);
        if(name == null) throw new NullPointerException("Es wurde kein Name angegeben!");
        this.studiengruppe = studiengruppe;
    }

    public Studiengruppe getStudiengruppe(){
        return studiengruppe;
    }

    public String getDetails() {
        String output = super.getDetails();
        output += ("\nStudiengruppe:\n\t" + studiengruppe);
        return output;
    }

    //this method checks wether there is a study group defined for this student or not
    public String getAssignment(){
        if(studiengruppe != null){
            return "Name:\n\t" + name + "\nStudiengruppe:\n\t" + studiengruppe;
        }
        else {
            return "Keine Studiengruppe hinterlegt!";
        }
    }

    public boolean isSame(Student7 stud){
        return (super.isSame(stud) && getStudiengruppe() == stud.getStudiengruppe());
    }

    @Override
    public Student7 clone()
            throws CloneNotSupportedException
    {
        return (Student7)super.clone();
    }
}