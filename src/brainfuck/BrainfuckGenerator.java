package brainfuck;

import java.io.*;

public class BrainfuckGenerator {
    final static String path_root = "src/brainfuck/";
    static String path;
    static String out;

    static String[] items = {"Adresse7", "AdressException", "Hochschulperson7", "Ort", "Person", "Professor7", "Student7", "Studiengruppe", "Uebung7"};

    public static void main(String[] args) {
        for (String item : items) {
            path = path_root + item + ".txt";
            out = path_root + item + ".bf";
            writeResult(generateBrainfuck(readFromFile()));
        }
    }

    //one line ascii numbers
    public static String readFromFile() {
        String input = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            input = br.readLine();
        } catch (IOException e) {
            System.out.println("Something went wrong during reading the file");
        }
        return input;
    }

    //one line brainfuck code
    public static void writeResult(String result) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(out))) {
            bw.write(result);
        } catch (IOException e) {
            System.out.println("Something went wrong during writing the file");
        }
    }

    public static String generateBrainfuck(String input) {
        StringBuilder result = new StringBuilder("++++++++++[");

        input = input.trim();

        String[] splitted = input.split(" ");
        int[] ascii = new int[splitted.length];
        for (int i = 0; i < splitted.length; i++) {
            try {
                ascii[i] = Integer.parseInt(splitted[i]);
            } catch (NumberFormatException e) {
                System.out.println("Something went wrong during parsing the input, make sure there are only numbers");
            }
        }

        for (int j : ascii) {
            int zehner = j / 10;
            result.append(">");
            result.append("+".repeat(zehner));
        }
        result.append("<".repeat(ascii.length));
        result.append("-]");

        for (int k : ascii) {
            int mod = k % 10;
            result.append(">");
            result.append("+".repeat(mod));
            result.append(".");
        }

        return result.toString();
    }
}
