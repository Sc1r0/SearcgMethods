import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create integer for the index number
        Integer indexOfElements;

        // create integer array containing 10 numbers
        Integer[] intarr = {10, 7, 8, 9, 5, 4, 3, 11, 2, 1, 6};

        // create a list of names, containing 6 names
        List<String> Names = new ArrayList<>(){};
        Names.add("Albert");
        Names.add("Robert");
        Names.add("Ulla");
        Names.add("Aske");
        Names.add("Berta");

        // Use SequentialSearch to find the index number at which the object is at
        indexOfElements = SearchMethods.SequentialSearch(intarr, 11);
        if (indexOfElements != null){
            System.out.println("Sequential Search (array): we found index " + indexOfElements + " and we retrieved " + intarr[indexOfElements]);
        }

        // Use SequentialSearch to find the index number at which the object is at
        indexOfElements = SearchMethods.SequentialSearch(Names, "Ulla");
        if (indexOfElements != null){
            System.out.println("Sequential Search (list): we found index " + indexOfElements + " and we retrieved " + Names.get(indexOfElements));
        }

        // Make new lists for JumpSearch and BinarySearch methods
        Integer[] sortedIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 42};

        List<String> SortedNames = new ArrayList<>();
        SortedNames.add("Albert");
        SortedNames.add("Aske");
        SortedNames.add("Berta");
        SortedNames.add("Robert");
        SortedNames.add("Ulla");

        indexOfElements = SearchMethods.JumpSearch(sortedIntArray, 11);
        if (indexOfElements != null){
            System.out.println("Jump Search (array): we found index " + indexOfElements + " and we retrieved " + sortedIntArray[indexOfElements]);
        }

        indexOfElements = SearchMethods.JumpSearch(SortedNames, "Ulla");
        if (indexOfElements != null){
            System.out.println("Jump Search (list): we found index " + indexOfElements + " and we retrieved " + SortedNames.get(indexOfElements));
        }

        indexOfElements = SearchMethods.BinarySearch(sortedIntArray, 11, 0, intarr.length - 1);
        if (indexOfElements != null){
            System.out.println("Binary Search (array): we found index " + indexOfElements + " and we retrieved " + sortedIntArray[indexOfElements]);
        } else {
            System.out.println("Number not found.");
        }

        indexOfElements = SearchMethods.BinarySearch(SortedNames, "Ulla", 0, Names.size() - 1);
        if (indexOfElements != null){
            System.out.println("Binary Search (list): we found index " + indexOfElements + " and we retrieved " + SortedNames.get(indexOfElements));
        } else {
            System.out.println("Name not found.");
        }
    }
}