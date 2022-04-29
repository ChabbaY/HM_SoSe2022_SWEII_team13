package uebungen.uebungsblatt3;

public class Student5 extends Hochschulperson5 {

    public Studiengruppe studiengruppe;


    public Student5(String name, String telefon, String hochschule, Studiengruppe studiengruppe) {
        super(name, telefon, hochschule);
        this.studiengruppe = studiengruppe;
    }
    public Student5(String name, Adresse5 adresse, String telefon, String hochschule, Studiengruppe studiengruppe) {
        super(name, adresse, telefon, hochschule);
        this.studiengruppe = studiengruppe;
    }

    public Studiengruppe getStudiengruppe(){
        return studiengruppe;
    }

    public String getDetails() {
        String output = super.getDetails();
        if (studiengruppe != null) {
            output += (", " + studiengruppe + "\n");
            return output;
        } else {
            return "Keiner Studiengruppe zugeordnet!";
        }
    }

    //this method checks wether there is a study group defined for this student or not
    public String getAssignment(){
        if(studiengruppe != null){
            return "Name: " + name + "\nStudiengruppe: " + studiengruppe;
        }
        else {
            return "Keiner Studiengruppe zugeordnet!";
        }
    }
}