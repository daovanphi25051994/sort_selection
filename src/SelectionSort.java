public class SelectionSort {
    public void sort(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] > arrayNumbers[j]) {
                    int temp = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = temp;
                }
            }
        }
    }
}
