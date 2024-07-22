package SangLyThuyet.Sang1007;

public class RedoMergeSort {

    public static void merge(int[] arr, int left, int right, int mid) {
        //Tìm kích thước của 2 mảng: nửa mảng trái & nửa mảng phải
        int m1 = mid - left + 1; // 3- 0 + 1 = 4
        int m2 = right - mid ; // 6 - 3 = 3

        //Tạo mảng tạm
        int[] tempArr1 = new int[m1];
        int[] tempArr2 = new int[m2];

        //Copy phần tử của mảng đã cho sẵn vào mảng tạm
        for (int i = 0; i < m1; ++i) {
            tempArr1[i] = arr[left + i];
        }
        for (int j = 0; j < m2; ++j) {
            tempArr2[j] = arr[mid + j + 1];
        }

        //Tạo 1 mảng tạm rồi merge
        int i = 0, j = 0;
        int k = left;

        while (i < m1 && j < m2) {
            if (tempArr1[i] <= tempArr2[j]) {
                arr[k] = tempArr1[i];
                i++;
            } else {
                arr[k] = tempArr2[j];
                j++;
            }
            k++;
        }

        //Sao chép phần tử còn lại nếu có
        while (i < m1) {
            arr[k] = tempArr1[i];
            i++;
            k++;
        }
        while (j < m2) {
            arr[k] = tempArr2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            //merge nửa bên trái
            mergeSort(arr, left, mid);
            //merge nửa bên phải
            mergeSort(arr, mid + 1, right);
            //merge 2 nửa vào mảng lớn
            merge(arr, left, mid, right);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {25, 30, 6, 45, 11, 90, 15};
        System.out.println("Mảng ban đầu: ");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
