public class ShellSort {
    public static void main(String[] args) {

        int[] arrayList = {99, 55, 1, 3, -22, 15, -15};

        for (int gap = arrayList.length / 2; gap > 0; gap/=2) {
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

        for (int i = 0; i < arrayList.length - 1; i++) {
            System.out.println(arrayList[i]);
        }

    }
}
