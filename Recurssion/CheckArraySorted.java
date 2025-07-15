
public class CheckArraySorted {

    public static boolean isSorted(int arr[], int index) {
        // base case: if we reached the last element
        if (index == arr.length-1) {
            return true;
        }

        // if current element is greater than the next, it's not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // recursively check the rest
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));  // start checking from index 0
    }
}
