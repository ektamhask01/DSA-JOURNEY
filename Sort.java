

public class Sort{

    // 1. BubbleSort


    public static void bubbleSort(int arr[]) {
        for (int i = 0; i<arr.length -1; i++) {
            for (int j =0 ; j< arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1 ] = temp;
                    
                }
                
            }

        }
    }


    // 2. Selection Sort 

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i< arr.length-1 ; i++) {
            int minEle = i;
            for (int j = i+1;j< arr.length ; j++) {
                if (arr[j] < arr[minEle]) {
                    minEle = j;
                }
            }

           // Swap 

            int temp = arr[minEle];
            arr[minEle] = arr[i];
            arr[i ] = temp;
        }
    }


    // 3. Insertion Sort

    public static void InsertionSort (int arr[]) {
        for (int i =1 ; i< arr.length ; i++) {
            int curr = arr[i];
            int prev = i -1;

            while (prev >=0 &&  arr[prev] > curr) {
                arr[prev +1 ] = arr[prev] ;
                prev--;

            }
            arr[prev + 1] = curr;
        }
    }



    //  4 . Counting Sort

    public static void CountingSort (int arr[] ) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ; i< arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int [largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] ++;     
        }

        // Sorting 

        int j = 0;
        for (int i = 0; i<count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i ;
                j++;
                count[i]--;
             }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        bubbleSort(arr);   // Call 

       SelectionSort(arr);  // Call

       InsertionSort(arr);   // Call

       CountingSort(arr); // Call
        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}