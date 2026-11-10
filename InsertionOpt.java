public class InsertionOpt {
    public static void sort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            
            int left = 0;
            int right = i - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (key < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            for (int j = i - 1; j >= left; j--) {
                arr[j + 1] = arr[j];
            }
            
            arr[left] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {37, 23, 0, 17, 12, 72, 31};
        System.out.println("Avant le tri :");
        printArray(arr);

        sort(arr);

        System.out.println("Après le tri par insertion dichotomique :");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}