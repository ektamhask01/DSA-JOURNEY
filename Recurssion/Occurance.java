public class Occurance {

    // last occurance 

    
    public static int lastOccurance(int arr[], int key , int index) {
        if (index == 0){
            return -1;
        }
        if (arr[index] == key ) {
            return index;
        }
        return lastOccurance(arr, key, index-1);
    }

    // first occurance

    public static int firstOccurance(int arr[], int index , int key) {
        if (arr.length == index) {
            return -1;
        }
        if (arr[index] == key ) {
            return index;
        }
        return  firstOccurance(arr, index +1, key);

      
    }
    public static void main(String[] args) {
        int arr [] = {8 , 3, 6,5, 9, 10, 2,5, 3};
        int key = 5;
        System.out.println("Index of first occurance is :"+firstOccurance(arr, 0, key));
        System.out.println( "Index of last occurance is : " + lastOccurance(arr, key, arr.length-1));
    }
}
