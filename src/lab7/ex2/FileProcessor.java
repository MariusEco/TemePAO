package lab7.ex2;

import java.io.*;
import java.util.*;

public class FileProcessor {

    public static String findLongestWord(String filename) throws IOException {
        String longest = "";
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > longest.length()) {
                        longest = word;
                    }
                }
            }
        }
        return longest;
    }

    public static void appendCurrentClassToFile(String sourceClassPath, String targetFilePath) throws IOException {
        try (Scanner scanner = new Scanner(new FileReader(sourceClassPath));
             FileWriter writer = new FileWriter(targetFilePath, true)) {
            writer.write(System.lineSeparator());
            while (scanner.hasNextLine()) {
                writer.write(scanner.nextLine() + System.lineSeparator());
            }
        }
    }

    public static String[] fileToArray(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        }
        return lines.toArray(new String[0]);
    }

    public static void main(String[] args) {
        // Trebuie creat fisierul input2.txt pentru acest cod, iar la classPath trebuie eliminat TemePAO/
        String filePath = "input2.txt";
        String classPath = "TemePAO/src/lab7/ex2/FileProcessor.java";

        try {
            String longest = findLongestWord(filePath);
            System.out.println("Cel mai lung cuvant: " + longest);
            appendCurrentClassToFile(classPath, filePath);
            String[] fileLines = fileToArray(filePath);
            System.out.println("Fisierul linie cu linie:");
            for (String line : fileLines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Eroare la procesarea fisierului: " + e.getMessage());
        }
    }
}