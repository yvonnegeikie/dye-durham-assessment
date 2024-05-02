
// NameLogger.java
import java.util.List;

// Logs names to the console
public class NameLogger {
    public void logSortedNames(List<String> names) {
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
