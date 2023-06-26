package InsertionSort;

public class Main {
    public static void InsertionSort(int[] arr) {
        int i, key, x;
        for (i = 1; i < arr.length; i++) {
            x = arr[i];
            key = i - 1;
            while ((key >= 0) && arr[key] > x) {
                arr[key + 1] = arr[key];
                key--;
            }
            arr[key + 1] = x;

        }

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 9, 1, 0, 8, 5 };
        System.out.print("Original Array: ");
        printArr(arr);
        System.out.println();
        InsertionSort(arr);
        System.out.print("Sorted Array: ");
        printArr(arr);
    }
}
