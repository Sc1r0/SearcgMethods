import java.util.List;

class SearchMethods {

    // SEQUENTIAL SEARCH
    public static <T extends Comparable<T>> Integer SequentialSearch(T[] list, T object){
        for (int i = 0; i < list.length; i++){
            if (list[i].compareTo(object) == 0){
                return i;
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> Integer SequentialSearch(List<T> list, T object){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).compareTo(object) == 0){
                return i;
            }
        }
        return null;
    }

    // JUMP SEARCH
    public static <T extends Comparable<T>> Integer JumpSearch(T[] list, T object){
        // calculate the squareroot of the list.length
        int squareRootOfListLength = (int) Math.sqrt(list.length);
        // create an integer for the last position jumped to
        int previousPosition = 0;

        // I have no clue what the fuck is going on here - apparently it's a jumpsearch
        while (list[Math.min(squareRootOfListLength - 1, list.length - 1)].compareTo(object) < 0){
            // set the current position to the previous position
            previousPosition = squareRootOfListLength;

            // basically do square root + square root
            squareRootOfListLength = squareRootOfListLength + (int) Math.sqrt(list.length);

            // to avoid throwing an exception and ending the program, just return null if previousPosition is equal to
            // or longer than the length of the list.
            if (previousPosition >= list.length){
                // return null is used, because of the if-statement in our Main.java at line 23 and 29.
                // System.out.println("JUMPSEARCH ARRAY (Checkpoint 1, line 43)");
                return null;
            }
        }

        // apparently this does a Sequential Search
        while (list[previousPosition].compareTo(object) < 0){
            previousPosition++;

            if (previousPosition == squareRootOfListLength || previousPosition == list.length){
                // return null is used, because of the if-statement in our Main.java at line 23 and 29.
                // System.out.println("JUMPSEARCH ARRAY (Checkpoint 2, line 54)");
                return null;
            }
        }

        // not sure why we need this
        if (list[previousPosition] == object){
            // System.out.println("JUMPSEARCH ARRAY (Checkpoint 3, line 61)");
            return previousPosition;
        }

        // return null is used, because of the if-statement in our Main.java at line 23 and 29.
        // System.out.println("JUMPSEARCH ARRAY (Checkpoint 4, line 66)");
        return null;
    }

    public static <T extends Comparable<T>> Integer JumpSearch(List<T> list, T object){
        // calculate the squareroot of the list.length
        int squareRootOfListLength = (int) Math.sqrt(list.size());
        // create an integer for the last position jumped to
        int previousPosition = 0;

        // I have no clue what the fuck is going on here - apparently it's a jumpsearch
        while (list.get(Math.min(squareRootOfListLength - 1, list.size() - 1)).compareTo(object) < 0){
            // set the current position to the previous position
            previousPosition = squareRootOfListLength;

            // basically do square root + square root
            squareRootOfListLength = squareRootOfListLength + (int) Math.sqrt(list.size());

            // to avoid throwing an exception and ending the program, just return null if previousPosition is equal to
            // or longer than the length of the list.
            if (previousPosition >= list.size()){
                // return null is used, because of the if-statement in our Main.java at line 23 and 29.
                // System.out.println("JUMPSEARCH LIST (Checkpoint 5, line 88)");
                return null;
            }
        }

        // apparently this does a Sequential Search
        while (list.get(previousPosition).compareTo(object) < 0){
            previousPosition++;

            if (previousPosition == squareRootOfListLength || previousPosition == list.size()){
                // return null is used, because of the if-statement in our Main.java at line 23 and 29.
                // System.out.println("JUMPSEARCH LIST (Checkpoint 6, line 99)");
                return null;
            }
        }

        // not sure why we need this
        if (list.get(previousPosition) == object){
            // System.out.println("JUMPSEARCH LIST (Checkpoint 7, line 105)");
            return previousPosition;
        }

        // return null is used, because of the if-statement in our Main.java at line 23 and 29.
        // System.out.println("JUMPSEARCH LIST (Checkpoint 8, line 111)");
        return null;
    }

    // int low = start of the array
    // int high = length of the array
    public static <T extends Comparable<T>> Integer BinarySearch(T[] list, T object, int low, int high){
        if (low > high) {
            // System.out.println("BINARYSEARCH ARRAY (Checkpoint 9, line 119)");
            return null;
        }

        // should be the middle of the array
        int mid = (low+high) / 2;

        if (list[mid].compareTo(object) == 0){
            // System.out.println("BINARYSEARCH ARRAY (Checkpoint 10, line 125)");
            return mid;
        }

        // if mid is smaller than the object
        if (list[mid].compareTo(object) < 0){
            // System.out.println("BINARYSEARCH ARRAY (Checkpoint 11, line 133)");
            return BinarySearch(list, object, mid + 1, high);
        }

        // if mid is bigger than the object
        if (list[mid].compareTo(object) > 0){
            // System.out.println("BINARYSEARCH ARRAY (Checkpoint 12, line 139)");
            return BinarySearch(list, object, low, mid - 1);
        }

        // System.out.println("BINARYSEARCH ARRAY (Checkpoint 13, line 143)");
        return null;
    }

    // int low = start of the array
    // int high = length of the array
    public static <T extends Comparable<T>> Integer BinarySearch(List<T> list, T object, int low, int high){
        if (low > high) {
            // System.out.println("BINARYSEARCH LIST (Checkpoint 14, line 151)");
            return null;
        }

        // should be the middle of the array
        int mid = (low+high) / 2;

        if (list.get(mid).compareTo(object) == 0){
            // System.out.println("BINARYSEARCH LIST (Checkpoint 15, line 156)");
            return mid;
        }

        // if mid is smaller than the object
        if (list.get(mid).compareTo(object) < 0){
            // System.out.println("BINARYSEARCH LIST (Checkpoint 16, line 165)");
            return BinarySearch(list, object, mid + 1, high);
        }

        // if mid is bigger than the object
        if (list.get(mid).compareTo(object) > 0){
            // System.out.println("BINARYSEARCH LIST (Checkpoint 17, line 171)");
            return BinarySearch(list, object, low, mid - 1);
        }

        // System.out.println("BINARYSEARCH LIST (Checkpoint 18, line 175)");
        return null;
    }

}
