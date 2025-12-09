public class CeilingOfAnArray {

    public static void main(String[] args) {

        /*
            Ceiling of a Number:
                    If you are given a number, you have to find the smallest element greater than or equal to
                        the target;
         */
        int[] arr = {1, 3, 4, 5, 7, 8, 9, 12, 14, 16, 24};
        int target = 13;

        System.out.println("Ceiling: " + ceiling(arr, target));
    }

    public static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;

        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }

        }
        return start;
    }
}
