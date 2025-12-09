import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);// alt + enter to auto-import

        /*
        System.out.print("Please enter a number: ");
        int x = Integer.parseInt(scanner.next());
        System.out.printf("YOur number is: %d", x);
        */

        int[] nums = {5, 15, 10, 7, 9, 20, 22};

        System.out.println(nums[-1]);
    }
}