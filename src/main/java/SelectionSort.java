public class SelectionSort {

    public int[] selectionSort(int[] arrayList) {
        for (int lastIndexUnsorted = arrayList.length - 1; lastIndexUnsorted > 0; lastIndexUnsorted--) {
            int largest = 0;
            for (int i = 1; i <= lastIndexUnsorted; i++) {
                if (arrayList[i] > arrayList[largest]) {
                    largest = i;
                }
            }
            swap(arrayList, lastIndexUnsorted, largest);
        }
        return arrayList;
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}