package brainfuck;

import java.io.*;

public class BrainfuckGenerator {
    final static String path = "src/brainfuck/Adresse7.txt";
    final static String out = "src/brainfuck/Adresse7.bf";

    public static void main(String[] args) {
        writeResult(generateBrainfuck(readFromFile()));
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
