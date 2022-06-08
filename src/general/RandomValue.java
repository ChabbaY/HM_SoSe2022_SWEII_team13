package general;

import java.util.Random;

public class RandomValue {

    /*
    0 Straße, 1 Hausnummer, 2 PLZ, 3 Ort
     */
    public static String[] randomAdresse(final Class Ort) {
        String[] erg = new String[4];

        erg[0] = randomStrasse();
        erg[1] = randomNumber(2);
        erg[2] = randomNumber(5);
        erg[3] = randomE(Ort);

        return erg;
    }
    public static String randomFakultaet() {
        Fakultaet[] fakultaet = Fakultaet.values();
        Random r = new Random();
        return fakultaet[r.nextInt(fakultaet.length)].toString();
    }
    public static String randomHochschule() {
        Hochschule[] hochschule = Hochschule.values();
        Random r = new Random();
        return hochschule[r.nextInt(hochschule.length)].toString();
    }
    public static String randomName() {
        Vorname[] vorname = Vorname.values();
        Nachname[] nachname = Nachname.values();
        Random r = new Random();
        return vorname[r.nextInt(vorname.length)] + " " + nachname[r.nextInt(nachname.length)];
    }
    public static String randomStrasse() {
        Strasse[] strasse = Strasse.values();
        Random r = new Random();
        return strasse[r.nextInt(strasse.length)].toString();
    }
    public static String randomTelefon() {
        Random r = new Random();
        return "+" + randomNumber(2) + " " + randomNumber(7);
    }

    public static String randomE(final Class enumType) {
        Object[] values = enumType.getEnumConstants();
        Random r = new Random();
        return values[r.nextInt(values.length)].toString();
    }

    private static String randomNumber(int length) {
        StringBuilder erg = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            erg.append(r.nextInt(10));
        }
        return erg.toString();
    }
}

enum Fakultaet {
    FK01, FK02, FK03, FK04, FK05, FK06, FK07, FK08, FK09, FK10, FK11, FK12, FK13
}
enum Hochschule {
    HM, LMU, TUM
}
/*
Sammlung an Nachnamen (enthölt die 100 häufigsten)
 */
enum Nachname {
    Albiez, Albrecht, Ansorge,
    Babachev, Bader, Bartolome, Bauer, Baumann, Beck, Becker, Beckmann, Bedrich, Berger, Bergmann, Böhm, Böhmermann, Brandner, Brandt, Braun, Breuer, Brost, Brunner, Busch,
    Cuxenko,
    Dellinger, Demmel, Depp, Dietrich, Dörner, Dörrer,
    Eiber, Eichhorn, Engel, Ernst,
    Fanelli, Fassbinder, Fischer, Frank, Franke, Friedrich, Fuchs,
    Goldemond, Graf, Groß, Gruß, Günther,
    Haas, Hackenberg, Hahn, Hartmann, Heinrich, Herrmann, Herrnberger, Hoffmann, Hofmann, Hölzl, Horn, Hoyer, Hubel, Huber,
    Jäger, Jung,
    Kaiser, Kalla, Keller, Kellner, Kieweg, Klarmann, Klein, Kneidinger, Köhler, Konitz, Körtig, Krämer, Kraus, Krause, Krieg, Kroiss, Krömer, Krüger, Kuhn, Kühn,
    Lang, Lange, Lehmann, Lehmbach, Lippolt, Lorenz, Ludwig, Lutsch,
    Mahr, Maier, Mandl, Manfredi, Mannella, Martin, Mayer, Mederer, Meier, Meyer, Mohrmann, Möller, Moron, Müller,
    Neumann,
    Olbert, Orlova, Otto,
    Paril, Pecho, Peters, Petzold, Pfeiffer, Pfisterer, Pohl, Potter,
    Reschetnikow, Richter, Rot, Roth, Ruhnke,
    Sauer, Schäfer, Schmid, Schmidt, Schmidtbauer, Schmitt, Schmitz, Schneider, Scholz, Schreiber, Schröder, Schubert, Schulte, Schulz, Schulze, SchumacherSchuster, Schwarz, Seidel, Seidl, Selimi, Simmet, Simon, Sinato, Söder, Sommer, Stein, Stöger, Szücs,
    Tadic, Tarentino, Thomas,
    Ullmann, Umscheid,
    Velic, Vogel, Vogt, Voigt,
    Wagner, Walter, Weber, Weiß, Wenzel, Werner, Winkler, Winter, Wokittel, Wolf, Wolff, Wulff,
    Zander, Zeller, Zellner, Zeng, Zervakis, Ziegler, Zielke, Zimmer, Zimmermann
}
enum Strasse {
    Ahornallee, AmAnger, AmStadtpark,
    Badstraße, Bayernplatz, Brauereistraße, Burgstraße,
    Chaussestraße,
    Egerländerstraße,
    Friedrichstraße,
    Gartenstraße,
    Hafenplatz, Hauptstraße, Heubergweg, Hochschulstraße,
    Kampenwandstraße, Kreillerstraße, Kurfürstendamm,
    Lothstraße,
    Marienplatz, Mauerblumenweg, Maximilianallee,
    Neuestraße,
    Odeonsplatz, Olympiastraße,
    Parkstraße,
    Rathausplatz,
    Saalstraße, Schlossallee, Schulstraße, Seepfad, Solitudeallee,
    Turmstraße,
    Westendstraße,
    Zugspitzstraße
}
enum Vorname {
    Agustin, Alex, Alexander, Anastasia, Anastasiia, Augustin,
    Ben, Benedikt, Benjamin, Bernd, Bianka,
    Carina, Celina, Charlotte, Christian, Christine, Christoph, Clara,
    Daniel, Daniela, Dardan, David, Don, Donald, Dora, Doris,
    Elias, Elisabeth, Ella, Emil, Emilia, Emma, Ester,
    Felix, Finn, Flo, Florian, Franz, Franziska, Fynn,
    Gabriele, Gustav,
    Hanna, Hannah, Hannes, Hans, Harald, Harry, Heinrich, Henri, Henry, Hermine,
    Ida, Ingrid, Isabel, Isabella, Ismar,
    Jan, Janina, Janine, Jannik, Jasmin, Jasmina, Johann, Johannes, Julia, Julian, Juliana,
    Karin, Karl, Katharina, Kathrin, Klara, Korbinian, Kristijan,
    Laurenz, Lea, Leah, Lennart, Lenny, Lina, Linus, Liz, Leo, Leon, Leopold, Lorenz, Louis, Louisa, Ludwig, Luis, Luisa, Luise,
    Manuel, Maria, Marianne, Marina, Mario, Marion, Marti, Martin, Massimo, Matteo, Max, Maxime, Maxine, Melanie, Mia, Michael, Michaela, Mila, Moritz,
    Noah, Nora,
    Oskar,
    Pascal, Paul, Paula, Peter, Petra, Philip,
    Quentin,
    Raphael, Raphaela, Richard, Ron, Ronald,
    Sabine, Samuel, Selina, Simon, Sofia, Sofie, Sophia, Sophie, Stefan, Stephan, Susanne,
    Theodor, Tim, Timo,
    Ulrich, Ulrike, Ursula,
    Valentin, Valentina, Verena, Viktor,
    Wilhelm, Wilhelmina,
    Xanthippe, Xenophon,
    Yvonne,
    Zacharias
}