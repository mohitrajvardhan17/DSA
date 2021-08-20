package sort.bubble;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import sort.SortingStrategy;

import java.util.Comparator;

/**
 *
 * Stable Sorting Algorithms:
 * TIME COMPLEXITY
 * BEST = O(n)
 * AVERAGE = O(n^2)
 * WORST = O(n^2)
 * <p>
 * <p>
 * SPACE COMPLEXITY
 * WORST = O(1)
 * <p>
 * WORKING PRINCIPLE
 * https://brilliant.org/wiki/bubble-sort/
 */
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class BubbleSort<T> implements SortingStrategy<T> {

    private final @NonNull Comparator<T> comparator;

    @Override
    public T[] sort(T[] items) {
        for (int i = items.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(items[j], items[j + 1]) > 0) {
                    swap(items, j, j + 1);
                }
            }
            display(items);
        }
        return items;
    }

    @Override
    public int compare(final @NonNull T firstItem, final @NonNull T secondItem) {
        return comparator.compare(firstItem, secondItem);
    }

}
