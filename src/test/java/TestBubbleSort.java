import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class TestBubbleSort {
    BubbleSort instance = new BubbleSort();

    @Test
    public void testInsertionSort() {
        int[] arrayList = {99, 55, 1, 3, -22, 15, -15};
        int[] actual = instance.bubbleSort(arrayList);
        int[] expected = Arrays.stream(arrayList).sorted().toArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertionSortWithMediumArray() {
        int[] arrayList = new int[50];
        Random number = new Random();
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = number.nextInt(9999);
        }
        int[] actual = instance.bubbleSort(arrayList);
        int[] expected = Arrays.stream(arrayList).sorted().toArray();
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void testInsertionSortWithLargeArray() {
        int[] arrayList = new int[500];
        Random number = new Random();
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = number.nextInt();
        }
        int[] actual = instance.bubbleSort(arrayList);
        int[] expected = Arrays.stream(arrayList).sorted().toArray();
        Assert.assertArrayEquals(expected, actual);
    }
}
