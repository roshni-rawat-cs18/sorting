package bubble;

public class BubbleSortMain {
    public static void main(String[] args){
        BubbleSort bsort = new BubbleSort();
        int[] array = {18,28,45,9,2,0,17,19};
        System.out.println("Array to be sorted ");
        bsort.printArray(array);
        bsort.bubbleSort(array);
        System.out.println("Sorted Array should be...");
        bsort.printArray(array);
    }
}
