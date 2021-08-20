package sort.selection;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import sort.SortingStrategy;

import java.util.Comparator;

/**
 * Stable Sorting Algorithms:
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
public class SelectionSortStable<T> implements SortingStrategy<T> {

    private final @NonNull Comparator<T> comparator;

    @Override
    public T[] sort(T[] items) {
        int minOrMax = 0;
        for (int i = 0; i < items.length - 1; i++) {
            display(items);
            // Find minimum or maximum element from
            minOrMax = i;
            for (int j = i + 1; j < items.length; j++) {
                if (comparator.compare(items[minOrMax], items[j]) > 0) {
                    minOrMax = j;
                }
            }

            // Move minimum or maximum element at current i.
            T key = items[minOrMax];
            while (minOrMax > i) {
                // Move the adjacent element
                items[minOrMax] = items[minOrMax - 1];
                minOrMax--;
            }
            items[i] = key;

        }
        return items;
    }

    @Override
    public int compare(final @NonNull T firstItem, final @NonNull T secondItem) {
        return comparator.compare(firstItem, secondItem);
    }
}
