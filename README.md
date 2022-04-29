<h1>
    SWE II SS 2022
</h1>

<hr/>

<h2>
    <i>Übungsblatt 3</i>
</h2>

<span style="color:red">
    - <i><b>höchstmöglicher</b> Zugriffsschutz</i>
</span>

### ~~Adresse4~~ Adresse5 ###
    private String strasse, hausnummer, ort
    private int postleitzahl
    Konstruktor
    @Override public String toString()

### Hochschulperson5 implements Person ###
    protected String name, telefon, hochschule
    protected Adresse5 adresse
    2 Konstruktoren
    @Override public String getDetails()
    @Override public String getAssignment()

### Hochschulperson5_ABC (abstrakt) implements Person ###
    protected String name, telefon, hochschule
    protected Adresse5 adresse
    2 Konstruktoren, ja, auch abstrakte Klassen können Konstruktoren haben
    public abstract String getDetails()
    @Override public String getAssignment()

### Ort ###
    {München, Karlsruhe, Berlin}

### Person (Interface) ###
    (public) String getDetails();
    (public) String getAssignment();

### ~~Professor4~~ Professor5 extends Hochschulperson5 ###
    private String fakultaet
    2 Konstruktoren
    @Override public String getDetails()
    @Override public String getAssignment()

### Professor5_ABC extends Hochschulperson5_ABC ###
    private String fakultaet
    2 Konstruktoren
    @Override public String getDetails()
    @Override public String getAssignment()

### ~~Student4~~ Student5 extends Hochschulperson5 ###
    private Studiengruppe studiengruppe
    2 Konstruktoren
    @Override public String getDetails()
    @Override public String getAssignment()

### Student5_ABC extends Hochschulperson5_ABC ###
    private Studiengruppe studiengruppe
    2 Konstruktoren
    @Override public String getDetails()
    @Override public String getAssignment()

### Studiengruppe ###
    {IB2A, IB2B, IB4A, IB4B, IB4C}

### Uebung5a ###
    min. 5 mal je getDetails() und getAssignment()

### Uebung5b ###
    min. 2 mal je getDetails() und getAssignment()

### <span style="color:red">Format</span> ###
    getDetails()
    
    Name:
        $name | null
    Telefonnummer:
        $telefon | null
    Adresse:
        $adresse ($strasse $hausnummer, $plz $ort) | null
    Hochschule | Studiengruppe | Fakultät:
        $hochschule | $studiengruppe | $fakultaet | null
    
    getAssignment()
    
    Name:
        $name | null
    Hochschule | Studiengruppe | Fakultät:
        $hochschule | $studiengruppe | $fakultaet
    bzw. Keine Hochschule | Studiengruppe | Fakultät hinterlegt!

<hr/>
