package sort.insertion;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import sort.SortingStrategy;

import java.util.Comparator;

/**
 * Unstable Sorting Algorithms:
 * TIME COMPLEXITY
 * BEST = O(n^2)
 * AVERAGE = O(n^2)
 * WORST = O(n^2)
 * <p>
 * <p>
 * SPACE COMPLEXITY
 * WORST = O(1)
 * <p>
 * WORKING PRINCIPLE
 * https://www.educba.com/selection-sort-in-data-structure/
 */
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class SelectionSort<T> implements SortingStrategy<T> {

    private final @NonNull Comparator<T> comparator;

    @Override
    public T[] sort(T[] items) {
        int min = 0;
        for (int i = 0; i < items.length - 1; i++) {
            display(items);
            min = i;
            for (int j = i + 1; j < items.length; j++) {
                if (comparator.compare(items[min], items[j]) > 0) {
                    min = j;
                }
            }
            swap(items, min, i);

        }
        return items;
    }

    @Override
    public int compare(final @NonNull T firstItem, final @NonNull T secondItem) {
        return comparator.compare(firstItem, secondItem);
    }
}
