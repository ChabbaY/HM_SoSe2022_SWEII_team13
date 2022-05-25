package uebungen.uebungsblatt4;

import uebungen.uebungsblatt3.Studiengruppe;

public class Student6 extends Hochschulperson6 implements Cloneable {

    public Studiengruppe studiengruppe;


    public Student6(String name, String telefon, String hochschule, uebungen.uebungsblatt3.Studiengruppe studiengruppe) {
        super(name, telefon, hochschule);
        this.studiengruppe = studiengruppe;
    }
    public Student6(String name, Adresse6 adresse, String telefon, String hochschule, uebungen.uebungsblatt3.Studiengruppe studiengruppe)
            throws CloneNotSupportedException
    {
        super(name, adresse, telefon, hochschule);
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

    public boolean isSame(Student6 stud){
        return (super.isSame(stud) && getStudiengruppe() != null && getStudiengruppe() == stud.getStudiengruppe());
    }

    @Override
    public Student6 clone()
            throws CloneNotSupportedException
    {
        return (Student6)super.clone();
    }
}