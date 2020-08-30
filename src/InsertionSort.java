public class InsertionSort {
    public static void main(String[] args) {

        int[] arrayList = {99, 55, 1, 3, -22, 15, -15};

        for (int lastIndexUnsorted = 1; lastIndexUnsorted < arrayList.length; lastIndexUnsorted++) {
            int element = arrayList[lastIndexUnsorted];
            int i;
            for (i = lastIndexUnsorted; i > 0 && arrayList[i - 1] > element; i--) {
                arrayList[i] = arrayList[i - 1];
            }
            arrayList[i] = element;
        }

        for (int i = 0; i < arrayList.length - 1; i++) {
            System.out.println(arrayList[i]);
        }

    }
}