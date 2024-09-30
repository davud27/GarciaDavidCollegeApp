import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;
public class GenericBag<E extends Comparable> {
    private E[] arr;
    private int nElems;

    public GenericBag(Class clazz, int maxSize) {
//Creates an array of generic type E that holds a class and has a max size
        arr = (E[]) (Array.newInstance(clazz, maxSize));
        nElems = 0;
    }
//Removes a specific value in the bag and shifts all other values to fill in the empty index
    public E[] removeShifting(Class clazz, Predicate<E> predicate) {
        E[] matchArr = (E[]) (Array.newInstance(clazz, nElems));
        int matchCount = 0;
        for (int i = 0; i < nElems; i++) {
            if (predicate.test(arr[i])) {
                matchArr[matchCount++] = arr[i];
                for (int j = i; j < nElems - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
                nElems--;
            }
        }
        return Arrays.copyOf(matchArr, matchCount);
    }
//Sequentially Searches for a specific value in the array and returns an array of any value that matched the search
    public E[] search(Class clazz, Predicate<E> predicate) {
        E[] matchArr = (E[]) (Array.newInstance(clazz, nElems));
        int matchCount = 0;
        for (int i = 0; i < nElems; i++) {
            if (predicate.test(arr[i])) {
                matchArr[matchCount++] = arr[i];
            }
        }
        return Arrays.copyOf(matchArr, matchCount);
    }
//Adds a value to the bag
    public void add(E value) {
        arr[nElems++] = value;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
