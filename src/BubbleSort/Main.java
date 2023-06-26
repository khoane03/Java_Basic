package BubbleSort;

public class Main {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    // Swap arr[j] và arr[j - 1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 9, 1, 0, 8, 5};
        System.out.print("Original Array: ");
        printArr(arr);
        System.out.println();
        bubbleSort(arr);
        System.out.print("Sorted Array: ");
        printArr(arr);
    }
}
