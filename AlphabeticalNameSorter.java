
// AlphabeticalNameSorter.java 
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Sorts names alphabetically
public class AlphabeticalNameSorter implements NameSorter {
    @Override
    public void sortNames(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] name1 = s1.split(" ");
                String[] name2 = s2.split(" ");
                return name1[name1.length - 1].compareTo(name2[name2.length - 1]);
            }
        });
    }
}
