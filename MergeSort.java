public class MergeSort {
    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];
        for (int i = 0; i < n1; i++)
            larr[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            rarr[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }
    static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 1, 4, 9, 6, 3, 7};
        System.out.print("Before Sorting: ");
        for (int num : arr)
            System.out.print(num + " ");
        mergesort(arr, 0, arr.length - 1);
        System.out.println("\nAfter Sorting: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
