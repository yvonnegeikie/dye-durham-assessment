
// NameReader.java 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Reads names from unsorted-names-list.txt
public class NameReader {
    public List<String> readNamesFromFile(String inputFile) {
        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return names;
    }
}
