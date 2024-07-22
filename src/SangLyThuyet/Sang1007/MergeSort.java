package SangLyThuyet.Sang1007;

public class MergeSort {
    // Phương thức chính để gọi Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Tìm chỉ số giữa
            int middle = (left + right) / 2;

            // Gọi đệ quy để sắp xếp hai nửa
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Gộp hai nửa đã sắp xếp
            merge(arr, left, middle, right);
        }
    }

    // Phương thức để gộp hai nửa
    public static void merge(int[] arr, int left, int middle, int right) {
        // Tìm kích thước của hai nửa để gộp
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Tạo các mảng tạm thời
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Sao chép dữ liệu vào các mảng tạm thời
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[middle + 1 + j];
        }

        // Gộp các mảng tạm thời
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L nếu có
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R nếu có
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Phương thức để in mảng
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,2,3,1};
        
        System.out.println("Mảng ban đầu:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
