
// NameSorterApplication.java 
import java.util.List;

// Coordinates the entire process of reading, sorting, logging, and writing names
public class NameSorterApplication {
    private NameReader nameReader;
    private NameSorter nameSorter;
    private NameLogger nameLogger;
    private NameWriter nameWriter;

    public NameSorterApplication(NameReader nameReader, NameSorter nameSorter, NameLogger nameLogger,
            NameWriter nameWriter) {
        this.nameReader = nameReader;
        this.nameSorter = nameSorter;
        this.nameLogger = nameLogger;
        this.nameWriter = nameWriter;
    }

    public void sortAndWriteNames(String inputFile, String outputFile) {
        List<String> names = nameReader.readNamesFromFile(inputFile);
        nameSorter.sortNames(names);
        nameLogger.logSortedNames(names);
        nameWriter.writeNamesToFile(names, outputFile);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java NameSorterApplication <input-file>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = "./sorted-names-list.txt";

        NameReader nameReader = new NameReader();
        NameSorter nameSorter = new AlphabeticalNameSorter();
        NameLogger nameLogger = new NameLogger();
        NameWriter nameWriter = new NameWriter();

        NameSorterApplication app = new NameSorterApplication(nameReader, nameSorter, nameLogger, nameWriter);
        app.sortAndWriteNames(inputFile, outputFile);

        System.out.println("Names sorted successfully and saved to sorted-names-list.txt");
    }
}
