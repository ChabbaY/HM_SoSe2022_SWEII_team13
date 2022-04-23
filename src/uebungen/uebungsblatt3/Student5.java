package uebungen.uebungsblatt3;

public class Student5 extends Hochschulperson5 {

    public Studiengruppe studiengruppe;

    public Student5(String name, String telefon, String hochschule, Studiengruppe studiengruppe) {
        super(null, null, null);
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
        this.studiengruppe = studiengruppe;
    }
    public Student5(String name, String strasse, String hausnummer, int postleitzahl, Ort ort, String telefon, String hochschule, Studiengruppe studiengruppe) {
        super(null, null, null);
        this.adresse = new Adresse5(strasse, hausnummer, postleitzahl, ort);
        this.name = name;
        this.telefon = telefon;
        this.hochschule = hochschule;
        this.studiengruppe = studiengruppe;
    }

    public Studiengruppe getStudiengruppe(){
        return studiengruppe;
    }

    public String getDetails(){
        StringBuilder output = new StringBuilder();
        if(adresse != null){
            output.append("Name: \n" + name + "\n");
            output.append("Telefonnummer: " + telefon + "\n");
            output.append(hochschule + ", " + studiengruppe + "\n");
            output.append("Adresse: " + adresse + "\n");
        }
        else {
            output.append("Name: \n" + name + "\n");
            output.append("Telefonnummer: " + telefon + "\n");
            output.append(hochschule + ", " + studiengruppe + "\n");
        }
        return output.toString();
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