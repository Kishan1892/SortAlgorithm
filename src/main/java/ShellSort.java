public class ShellSort {

    public int[] shellsort(int[] arrayList) {
        for (int gap = arrayList.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arrayList.length; i++) {
                int element = arrayList[i];
                int j = i;
                while (j >= gap && arrayList[j - gap] > element) {
                    arrayList[j] = arrayList[j - gap];
                    j -= gap;
                }
                arrayList[j] = element;
            }
        }
        return arrayList;
    }
}
