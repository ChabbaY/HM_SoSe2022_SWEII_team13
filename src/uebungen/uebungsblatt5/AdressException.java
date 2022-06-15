package uebungen.uebungsblatt5;

public class AdressException extends Exception {

    String message;

    AdressException(){

    }
    AdressException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
