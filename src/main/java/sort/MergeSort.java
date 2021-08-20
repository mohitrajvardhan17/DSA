package sort;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Comparator;

/**
 * Stable Sorting Algorithms:
 * TIME COMPLEXITY
 * BEST = O(n log n)
 * AVERAGE = O(n log n)
 * WORST = O(n log n)
 *
 *
 * SPACE COMPLEXITY
 * WORST = O(n)
 *
 * WORKING PRINCIPLE
 * https://brilliant.org/wiki/merge/
 */
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class MergeSort<T> implements SortingStrategy<T> {

    private final @NonNull Comparator<T> comparator;

    @Override
    public T[] sort(T[] items) {

        return items;
    }

    @Override
    public int compare(final @NonNull T firstItem, final @NonNull T secondItem) {
        return comparator.compare(firstItem, secondItem);
    }
}
