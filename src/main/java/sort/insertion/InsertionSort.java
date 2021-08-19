package sort.insertion;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import sort.SortingStrategy;

import java.util.Comparator;

/**
 *
 * TIME COMPLEXITY
 * BEST = O(n)
 * AVERAGE = O(n^2)
 * WORST = O(n^2)
 *
 *
 * SPACE COMPLEXITY
 * WORST = O(1)
 *
 * WORKING PRINCIPLE
 * https://brilliant.org/wiki/insertion/
 */
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class InsertionSort<T> implements SortingStrategy<T> {

    private final @NonNull Comparator<T> comparator;

    @Override
    public T[] sort(T[] items) {
        int j = 0;
        for (int i = 0; i < items.length; i++) {
            j = i;
            while (j > 0 && compare(items[j - 1], items[j]) > 0) {
                swap(items, j - 1, j);
                j--;
            }
            display(items);
        }
        return items;
    }

    @Override
    public int compare(final @NonNull T item1, final @NonNull T item2) {
        return comparator.compare(item1, item2);
    }
}
