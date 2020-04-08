
public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] numbers = {9,5,8,4,3,7};
        selectionSort.sort(numbers);
        for (int x : numbers){
            System.out.println(x);
        }
    }
}
