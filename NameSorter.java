import java.io.*;
import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 1) {
            System.out.println("Usage: java NameSorter <input-file>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = "./sorted-names-list.txt";

        // Read names from the input file
        List<String> names = readNamesFromFile(inputFile);

        // Sort names
        Collections.sort(names);

        // Log sorted names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Write sorted names to the output file
        writeNamesToFile(names, outputFile);

        System.out.println("Names sorted successfully and saved to sorted-names-list.txt");
    }

    private static List<String> readNamesFromFile(String inputFile) {
        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
            System.exit(1);
        }
        return names;
    }

    private static void writeNamesToFile(List<String> names, String outputFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            System.exit(1);
        }
    }
}
