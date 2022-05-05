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
            output.append("Name:\n\t" + name + "\n");
            output.append("Telefonnummer:\n\t" + telefon + "\n");
            output.append("Adresse:\n\t" + adresse + "\n");
            output.append("Hochschule:\n\t" + hochschule + "\nStudiengruppe:\n\t" + studiengruppe);
        }
        else {
            output.append("Name:\n\t" + name + "\n");
            output.append("Telefonnummer:\n\t" + telefon + "\n");
            output.append("Adresse:\n\tnull\n");
            output.append("Hochschule:\n\t" + hochschule + "\nStudiengruppe:\n\t" + studiengruppe);
        }
        return output.toString();
        //output += (", " + fakultaet + "\n");
        //return output;
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
}