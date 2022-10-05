import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer intarr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        List<String> Names = new ArrayList<String>(){};
        Names.add("Albert");
        Names.add("Robert");
        Names.add("Ulla");
        Names.add("Aske");
        Names.add("Berta");
        Names.add("Karen");

        Integer indexOfElements;

        indexOfElements = SearchMethods.SequentialSearch(intarr, 11);
        if (indexOfElements != null){
            System.out.println("in intarr 11 is at index " + indexOfElements + " and we retrieved " + intarr[indexOfElements]);
        }

        indexOfElements = SearchMethods.SequentialSearch(Names, "Ulla");
        if (indexOfElements != null){
            System.out.println("in Names Ulla is at index " + indexOfElements + " and we retrieved " + Names.get(indexOfElements));
        }


    }
}