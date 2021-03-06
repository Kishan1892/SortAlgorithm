public class BubbleSort {

    public int[] bubbleSort(int[] arrayList) {
        for (int lastIndexUnsorted = arrayList.length - 1; lastIndexUnsorted > 0; lastIndexUnsorted--) {
            for (int i = 0; i < lastIndexUnsorted; i++) {
                if (arrayList[i] > arrayList[i + 1]) {
                    swap(arrayList, i, i + 1);
                }
            }
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