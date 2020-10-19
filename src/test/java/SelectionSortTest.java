import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class SelectionSortTest {

    @Test
    public void shouldReturnSortedArray(){
        List<Integer> numbers = new ArrayList<>(List.of(1,5,6,123,5,12,3123,6123));
        List<Integer> expected = new ArrayList<>(List.of(1,5,5,6,12,123,3123,6123));
        SelectionSort selectionSort = new SelectionSort(numbers);

        numbers = selectionSort.sort();

        Assertions.assertIterableEquals(expected , numbers);
    }

}