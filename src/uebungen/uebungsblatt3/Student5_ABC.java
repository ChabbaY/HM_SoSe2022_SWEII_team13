package uebungen.uebungsblatt3;

public class Student5_ABC extends Hochschulperson5_ABC {

    public Studiengruppe studiengruppe;

    public Student5_ABC(String name, String telefon, String hochschule, Studiengruppe studiengruppe) {
        super(name, telefon, hochschule);
        this.studiengruppe = studiengruppe;
    }
    public Student5_ABC(String name, Adresse5 adresse, String telefon, String hochschule, Studiengruppe studiengruppe) {
        super(name, adresse, telefon, hochschule);
        this.studiengruppe = studiengruppe;
    }

    public Studiengruppe getStudiengruppe(){
        return studiengruppe;
    }

    public String getDetails() {
        //String output = super.getDetails();
        StringBuilder output = new StringBuilder();
        if(adresse != null){
            output.append("Name: \n" + name + "\n");
            output.append("Telefonnummer: " + telefon + "\n");
            output.append("Adresse: " + adresse + "\n");
            output.append(hochschule + ", " + studiengruppe + "\n");
        }
        else {
            output.append("Name: \n" + name + "\n");
            output.append("Telefonnummer: " + telefon + "\n");
            output.append(hochschule + ", " + studiengruppe + "\n");
        }
        return output.toString();
        //output += (", " + fakultaet + "\n");
        //return output;
    }

    //this method checks wether there is a study group defined for this student or not
    public String getAssignment(){
        if(studiengruppe != null){
            return "Name: " + name + "\nStudiengruppe: " + studiengruppe + "\n";
        }
        else {
            return "Keiner Studiengruppe zugeordnet!\n";
        }
    }
}