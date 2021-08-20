package sort.bubble;

import org.junit.Test;
import sort.SortingStrategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BubbleSortTest {

    @Test
    public void sortString() {
        Comparator<Character> comparator = Character::compare;
        SortingStrategy<Character> insertionSort = new BubbleSort<>(comparator);
        Character[] letters = "INSERTIONSORT".chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Character[] result = insertionSort.sort(letters);
        assertNotNull("", result);
        assertEquals("", "EIINNOORRSSTT", Arrays.stream(result).map(String::valueOf).collect(Collectors.joining()));
    }

    @Test
    public void reverseSortString() {
        Comparator<Character> comparator = (i, j) -> -Character.compare(i, j);
        SortingStrategy<Character> insertionSort = new BubbleSort<>(comparator);
        Character[] letters = "INSERTIONSORT".chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Character[] result = insertionSort.sort(letters);
        assertNotNull("", result);
        assertEquals("", "TTSSRROONNIIE", Arrays.stream(result).map(String::valueOf).collect(Collectors.joining()));
    }

    @Test
    public void sortInteger() {
        Comparator<Integer> comparator = Integer::compare;
        SortingStrategy<Integer> insertionSort = new BubbleSort<>(comparator);
        Integer[] nums = {1, 7, 8, 9, 2, 5, 6, 4, 3, 0};

        Integer[] result = insertionSort.sort(nums);
        assertNotNull("", result);
        assertEquals("", new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, result);
    }

    @Test
    public void reverseSortInteger() {
        Comparator<Integer> comparator = (i, j) -> -Integer.compare(i, j);
        SortingStrategy<Integer> insertionSort = new BubbleSort<>(comparator);
        Integer[] nums = {1, 7, 8, 9, 2, 5, 6, 4, 3, 0};
        Integer[] result = insertionSort.sort(nums);
        assertNotNull("", result);
        assertEquals("", new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, result);
    }
}