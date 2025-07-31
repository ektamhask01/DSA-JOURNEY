public class divideAndConquer {
    public static int SearchRotatedSortedA(int arr[], int target, int si , int  ei) {

        int mid = ( si + ei )/ 2;
        if (arr[mid ] == target) {
            return mid;
        } 

        // mid on L1

        if (arr[si]<= arr[mid]) {

        }

        // mid on L2

        else {
            
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int tarIndex =SearchRotatedSortedA(arr, target, 0, arr.length-1);
        System.out.println(tarIndex);
    }
}
