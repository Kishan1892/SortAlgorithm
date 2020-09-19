public class BubbleSort {

    public static void main(String[] args) {

        int[] arrayList = {99, 55, 1, 3, -22, 15, -15};

        for (int lastIndexUnsorted = arrayList.length - 1; lastIndexUnsorted > 0; lastIndexUnsorted--) {
            for (int i = 0; i < lastIndexUnsorted; i++) {
                if (arrayList[i] > arrayList[i + 1]) {
                    swap(arrayList, i, i + 1);
                }
            }
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