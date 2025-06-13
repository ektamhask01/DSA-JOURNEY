

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


    
    // 1 . Reverse BubbleSort  in decennding order



    public  static  void BubbleSortR(int arr[]) {
        for (int i = 0 ; i< arr.length-1 ; i++) {
            for (int j = 0 ; j< arr.length-1 -i ; j++) {
                if (arr[j]< arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
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


    // 2. Reverse Selection Sort  in decennding order

    public static void  reverseSelection (int arr[]) {
        for (int i =0 ; i<arr.length-1; i++) {
            int maxEle = i;
            for(int j = i+1 ; j<= arr.length-1; j++) {
                if (arr[maxEle] < arr[j]) {
                    maxEle = j;
                }
            }

            int temp = arr[maxEle];
            arr[maxEle] = arr[i];
            arr[i] = temp;

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



     // 3 . Reverse Insertion Sort  in decennding order


    public static void InsertionSortR(int arr[]) {
        for (int i = 1 ; i< arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while (prev>=0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
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


     // 4. Counting Sort  in decennding order


     public static void CountingSortR(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ; i< arr.length; i++) {
            largest =Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;

        for (int i = count.length-1; i>=0 ;i--) {
            while(count[i] >0) {
                arr[j ] = i;
                j++;
                count[i]--;
            }
        }
     }


    


    public static void main(String[] args) {
        int arr[] = {15, 40, 71, 3, 92};

        bubbleSort(arr);   // Call 

       SelectionSort(arr);  // Call

       InsertionSort(arr);   // Call

       CountingSort(arr); // Call
        // Print sorted array
        System.out.println("Sorted array in Acending order :");
        for (int i = 0 ; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        reverseSelection(arr);

       BubbleSortR(arr);

       InsertionSortR(arr);

       CountingSortR(arr);


        // Print sorted array
        System.out.println("Sorted array in Decending order :");
        for (int i = 0 ; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}