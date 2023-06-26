package SelectionSort;
public class Main {
    public static void SelectionSort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j=arr.length + 1; j < arr.length; j++){
                if(arr[j] < arr[min])
                min = j;
           
            // Swap arr[j] và arr[j - 1]
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp; 
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
        SelectionSort(arr);
        System.out.print("Sorted Array: ");
        printArr(arr);
    }
}
