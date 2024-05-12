import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        /*
         * Steps to follow
         * intro message
         * user input
         * perform operations
         */

        // Printing the intro message
        System.out.println(
                "Ditch the dusty old calculator! Get ready to crunch numbers with this sleek and easy-to-use program.");

        // User input of operation to be performed
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter '+' for addition, '-' for subtraction, '/' for division, '*' for multiplication and'%' for modulus.");
        System.out.print("Enter which operation you would like us to perform for you.");
        char Operation = sc.next().charAt(0);
        System.out.println();

        System.out.print("Enter your input limit : ");
        int n = sc.nextInt();
        int arr[] = new int[n]; // Creating array to store inputs

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your input no. " + i + " :");
            arr[i] = sc.nextInt();
        }

        int result = arr[0];
        switch (Operation) {
            case '+':
                for (int i = 1; i < n; i++) {
                    result += arr[i];
                }

                break;

            case '-':
                for (int i = 1; i < n; i++) {
                    result -= arr[i];
                }

                break;

            case '/':
                for (int i = 1; i < n; i++) {
                    result /= arr[i];
                }

                break;

            case '*':
                for (int i = 1; i < n; i++) {
                    result *= arr[i];
                }

                break;

            case '%':
                for (int i = 1; i < n; i++) {
                    result %= arr[i];
                }

                break;

            default:
                System.out.println("Inavalid Operator used. Try again !!!");
                break;
        }

        System.out.println("Your calculation results to : " + result);
    }
}
