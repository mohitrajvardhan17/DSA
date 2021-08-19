package sort;

import java.util.Arrays;

public interface SortingStrategy<T> {
    T[] sort(T[] items);

    int compare(final T firstItem,final T secondItem);

    default void swap(T[] items, int sourceIndex, int targetIndex) {
        T temp = items[sourceIndex];
        items[sourceIndex] = items[targetIndex];
        items[targetIndex] = temp;
    }

    default void display(T[] items) {
        Arrays.stream(items).forEach(System.out::print);
        System.out.println();
    }
}
