public class BinarySearchAlgorithm {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 7, 8, 9, 12, 14, 16, 24};
        int[] arr2 = {31, 26, 23, 20, 14, 13, 10, 6, 3, 1};
        int target = 16;
        int target2 = 13;

        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearchOrderAgnostic(arr2, target2));
    }

    /*
        Time Complexity: O(log N)
        Space Complexity: O(1)
            - If the recursive call stack is considered then the auxiliary space will be O(log N)
     */


    //iteration
    //orderAgnostic Binary Search
    static int binarySearchOrderAgnostic (int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;
        // allows us to work with ascending and descending arrays when ascending is unknown
        boolean isAscending = (arr[0] < arr[arr.length -1]);


        while (start <= end) {

            // int mid = (int) Math.floor((start + end) /2); //mid element value may exceed range of int if we add
            int mid = (start + (end-start)/2);

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else if (target > arr[mid]) {
                    start = mid + 1;
                }
                /* else {
                    return mid;
                } */
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }/* from non-order agnostic
                else {
                    return mid;
                }*/
            }
        }
        return -1;
    }



    static int binarySearch (int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while (start <= end) {

            // int mid = (int) Math.floor((start + end) /2); //mid element value may exceed range of int if we add
            int mid = (start + (end-start)/2);

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


    static int binarySearch(int arr[], int left, int right, int target){

        if (right >= left) {
            int mid = left + (right - left) / 2;

            // Returned Index of the Element
            if (arr[mid] == target)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > target)
                return binarySearch(arr, left, mid - 1, target);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, right, target);
        }

        // No Element Found
        return -1;
    }

}
