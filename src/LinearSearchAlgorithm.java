import java.lang.RuntimeException;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchAlgorithm {

    /*
       Time Complexity:
                - Best Case: O(1)
                -Worst Case: 0(n)
     */
    public static void main(String[] args) {

        ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList(5, 15, 10, 7, 9, 20, 22));
        int[] nums = {5, 15, 10, 7, 9, 20, 22};
        int target = 7;
        int startIndex = 0;
        int finalIndex = 10;

        //System.out.printf("The target number of %d is at index: %d", target, linearSearchIndex(myArray, target));

        //searchString
        String searchString = "nerenew";
        String stringTarget = "new";
        System.out.printf("The string %s is in %s: %b", stringTarget, searchString, searchString(searchString, stringTarget, startIndex, finalIndex));
    }


    static int linearSearch(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }


    static boolean searchString(String searchString, String target) {

        //if it is impossible for the string to contain the target
        if (target.length() > searchString.length()) {
            return false;
        }

        boolean found = false;
        //check every letter until a match is found.   Technically .contains and charAt could be used but feels like cheating
        for (int i = 0; i < searchString.length(); i++) {

            if (searchString.charAt(i) == target.charAt(0)) {
                found = true;
                // if the first letter of the word is found, check that all following letters match the string
                for (int j = 0; j < target.length(); j++) {

                    // prevents out of bounds error. If remaining string to search is shorter than word to find, impossible anyway
                    if (target.length() > searchString.length() -i) {
                        return false;
                    }

                    // if a letter doesn't match, stop checking for a match
                    if (searchString.charAt(i + j) != target.charAt(j)) {
                        break;
                    }

                    //if we have come to the end of the target string and the word still matches, it has been found
                    if (j == target.length()-1) {
                        //return ensures we don't needlessly check the rest of the string after a match
                        return true;
                    }
                }
            }
        }
        return found;
    }

    static boolean searchString(String searchString, String target, int startIndex) {

        //if it is impossible for the string to contain the target
        if (target.length() > searchString.length() || startIndex < 0 || startIndex > searchString.length() -1) {
            return false;
        }

        boolean found = false;
        //check every letter until a match is found.   Technically .contains and charAt could be used but feels like cheating
        for (int i = startIndex; i < searchString.length(); i++) {

            if (searchString.charAt(i) == target.charAt(0)) {
                found = true;
                // if the first letter of the word is found, check that all following letters match the string
                for (int j = 0; j < target.length(); j++) {

                    // prevents out of bounds error. If remaining string to search is shorter than word to find, impossible anyway
                    if (target.length() > searchString.length() -i) {
                        return false;
                    }

                    // if a letter doesn't match, stop checking for a match
                    if (searchString.charAt(i + j) != target.charAt(j)) {
                        break;
                    }

                    //if we have come to the end of the target string and the word still matches, it has been found
                    if (j == target.length()-1) {
                        //return ensures we don't needlessly check the rest of the string after a match
                        return true;
                    }
                }
            }
        }
        return found;
    }

    static boolean searchString(String searchString, String target, int startIndex, int finalIndex) {

        //if it is impossible for the string to contain the target
        if (target.length() > searchString.length() || startIndex < 0 || startIndex > searchString.length() -1) {
            return false;
        }

        //ensures valid final index
         if (finalIndex > searchString.length() -1) {
             finalIndex = searchString.length() -1;
             //throw new RuntimeException("The final index is out of bounds");
             System.out.println("WARNING: The final index is out of bounds, it has been adjusted to the last index");
         }

        boolean found = false;
        //check every letter until a match is found.   Technically .contains and charAt could be used but feels like cheating
        for (int i = startIndex; i < finalIndex +1; i++) {

            if (searchString.charAt(i) == target.charAt(0)) {
                found = true;
                // if the first letter of the word is found, check that all following letters match the string
                for (int j = 0; j < target.length(); j++) {

                    // prevents out of bounds error. If remaining string to search is shorter than word to find, impossible anyway
                    if (target.length() > searchString.length() -i) {
                        return false;
                    }

                    // if a letter doesn't match, stop checking for a match
                    if (searchString.charAt(i + j) != target.charAt(j)) {
                        break;
                    }

                    //if we have come to the end of the target string and the word still matches, it has been found
                    if (j == target.length()-1) {
                        //return ensures we don't needlessly check the rest of the string after a match
                        return true;
                    }
                }
            }
        }
        return found;
    }


    public static int linearSearchIndex(ArrayList<Integer> myArray, int target) {

        if (myArray.size() == 0) {
            return -1;
        }

        for (int i = 0; i < myArray.size() -1; i++) {
            if (myArray.get(i) == target) {
                return i;
            }
        }

        return -1;
    }
}
