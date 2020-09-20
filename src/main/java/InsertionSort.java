public class InsertionSort {

    public int[] insertionSort(int[] arrayList) {
        for (int lastIndexUnsorted = 1; lastIndexUnsorted < arrayList.length; lastIndexUnsorted++) {
            int element = arrayList[lastIndexUnsorted];
            int i;
            for (i = lastIndexUnsorted; i > 0 && arrayList[i - 1] > element; i--) {
                arrayList[i] = arrayList[i - 1];
            }
            arrayList[i] = element;
        }
        return arrayList;
    }
}