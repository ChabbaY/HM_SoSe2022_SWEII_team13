package image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Arrays;

public class ImageTextTranslator {
    private static final String TEXT = "src/image/text.txt";
    private static final String IMAGE = "src/image/image.png";

    public static void main(String[] args) {
        textToImage();
        imageToText();
    }

    //Main methods
    public static void textToImage() {
        String input = readText();

        //make length dividable through 4
        int toConcat = input.length() % 4;
        input = input.concat(" ".repeat(toConcat));

        //concat until pixel number is a square
        int pixel_count = input.length() / 4;
        int size = (int)Math.ceil(Math.sqrt(pixel_count));
        int pixel_target = size * size;
        input = input.concat(" ".repeat((pixel_target - pixel_count) * 4));

        //create pixel[]
        int[][][] pixel = new int[size][size][4];
        for (int column = 0; column < size; column++) {
            for (int row = 0; row < size; row++) {
                int index = column * size * 4 + row * 4;//4 Zeichen pro Pixel, jede Spalte mit size Pixeln
                String sub = input.substring(index, index + 4);

                pixel[column][row][0] = sub.charAt(0);
                pixel[column][row][1] = sub.charAt(1);
                pixel[column][row][2] = sub.charAt(2);
                pixel[column][row][3] = sub.charAt(3);
            }
        }

        //write to image
        writeImage(pixel);
    }
    public static void imageToText() {
        int[][][] pixel = readImage();
        int width = pixel[0].length, height = pixel.length;

        String result = "";

        //read pixel[]
        for (int column = 0; column < width; column++) {
            for (int row = 0; row < height; row++) {
                int[] rgb = pixel[column][row];
                result = result.concat(Character.toString(rgb[0]));
                result = result.concat(Character.toString(rgb[1]));
                result = result.concat(Character.toString(rgb[2]));
                result = result.concat(Character.toString(rgb[3]));
            }
        }

        //remove concatenated spaces
        result = result.trim();

        writeText(result);
    }

    //File handling
    public static String readText() {
        String input = "";
        try (BufferedReader br = new BufferedReader(new FileReader(TEXT))) {
            String line;
            while ((line = br.readLine()) != null) {
                input = input.concat("\n" + line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong during reading the text file");
        }
        return input;
    }
    public static void writeText(String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(TEXT))) {
            bw.write(text);
        } catch (IOException e) {
            System.out.println("Something went wrong during writing the text file");
        }
    }

    //Image handling
    public static int[][][] readImage() {
        int[][][] pixel = null;
        try {
            BufferedImage img = ImageIO.read(new File(IMAGE));
            int width = img.getWidth();
            int height = img.getHeight();
            pixel = new int[width][height][4];
            for (int column = 0; column < width; column++) {
                for (int row = 0; row < height; row++) {
                    pixel[column][row] = decodeRGB(img.getRGB(column, row));
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong during reading the image file");
        }
        return pixel;
    }
    public static void writeImage(int[][][] pixel) {
        int width = pixel[0].length, height = pixel.length;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for (int column = 0; column < width; column++) {
            for (int row = 0; row < height; row++) {
                int value = encodeRGB(pixel[column][row]);
                img.setRGB(column, row, value);
            }
        }
        try {
            ImageIO.write(img, "png", new File(IMAGE));
        } catch (IOException e) {
            System.out.println("Something went wrong during writing the image file");
        }
    }

    //Integer(32bit) to rgba format
    public static int[] decodeRGB(int rgb) {
        int[] result = new int[4];
        result[2] = rgb & 0xff;
        result[1] = (rgb & 0xff00) >> 8;
        result[0] = (rgb & 0xff0000) >> 16;
        result[3] = (rgb & 0xff000000) >>> 24;//reihenfolge argb
        return result;
    }
    //rgba format to Integer(32bit)
    public static int encodeRGB(int[] rgb) {
        if (rgb.length < 4) return 0;
        //return new Color(rgb[0], rgb[1], rgb[2], rgb[3]).getRGB();
        return rgb[2] | (rgb[1] << 8) | (rgb[0] << 16) | (rgb[3] << 24);
    }
}