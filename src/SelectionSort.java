public class SelectionSort {

    public static void main(String[] args) {

        int[] arrayList = {99, 55, 1, 3, -22, 15, -15};

        for (int lastIndexUnsorted = arrayList.length - 1; lastIndexUnsorted > 0; lastIndexUnsorted--) {
            int largest = 0;
            for (int i = 1; i <= lastIndexUnsorted; i++) {
                if (arrayList[i] > arrayList[largest]) {
                    largest = i;
                }
            }
            swap(arrayList, lastIndexUnsorted, largest);
        }

        for (int i = 0; i < arrayList.length - 1; i++) {
            System.out.println(arrayList[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
