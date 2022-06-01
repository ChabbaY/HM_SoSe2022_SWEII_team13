package brainfuck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BrainfuckInterpreter {
    final static String path = "src/brainfuck/Adresse7.bf";
    final static String out = "src/brainfuck/Adresse7.java";

    public static void main(String[] args) {
        writeResult(interpretBrainfuck(readFromFile()));
    }

    //one line brainfuck code
    public static String readFromFile() {
        String input = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            input = br.readLine();
        } catch (IOException e) {
            System.out.println("Something went wrong during reading the file");
        }
        return input;
    }

    //java code
    public static void writeResult(String result) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(out))) {
            bw.write(result);
        } catch (IOException e) {
            System.out.println("Something went wrong during writing the file");
        }
    }

    public static String interpretBrainfuck(String input) {
        StringBuilder result = new StringBuilder("");

        input = input.trim();

        int ptr = 0;
        List<Integer> cells = new ArrayList<>();
        cells.add(0);

        int last_loop_begin = -1;

        for (int i = 0; i < input.length(); i++) {
            String command = input.substring(i, i + 1);
            switch (command) {
                case ">"://increment pointer, increase list if necessary
                    ptr++;
                    if (cells.size() == ptr) cells.add(0);
                    break;
                case "<"://decrement pointer if possible
                    if (ptr > 0) ptr--;
                    break;
                case "+"://increment cell
                    cells.set(ptr, cells.get(ptr) + 1);
                    break;
                case "-"://decrement cell
                    cells.set(ptr, cells.get(ptr) - 1);
                    break;
                case "."://output
                    result.append(Character.toString(cells.get(ptr)));
                case ","://input
                    break;
                case "["://begin loop, jump to end if 0
                    last_loop_begin = i;
                    if (cells.get(ptr) == 0) {
                        int end = input.indexOf("]", i);
                        if (end > i) {
                            i = end;
                        }
                    }
                    break;
                case "]"://end loop, jump to begin if not 0
                    if (cells.get(ptr) != 0) {
                        if (last_loop_begin >= 0) i = last_loop_begin;
                    }
                    break;
            }
        }

        return result.toString();
    }
}
