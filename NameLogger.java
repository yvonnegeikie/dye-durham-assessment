
// NameLogger.java responsible for logging names
import java.util.List;

public class NameLogger {
    public void logSortedNames(List<String> names) {
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
