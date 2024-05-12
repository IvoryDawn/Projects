/*Stock Price Tracker:
- Use an array to store daily stock prices.
- Implement functions to:
    - Insert new day's closing price (append to the end of the array).
    - Search for the price on a specific date (linear search).
    - Find the highest and lowest prices within a date range (iterate through the array and compare).
    - Calculate the average price for a period (iterate and sum prices, then divide by the number of days). */

import java.util.*;

public class StockPriceTracker {
    // To store daily stock prices.
    public static void Store(double price[], String date[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < price.length; i++) {
            System.out.println("Enter the date : ");
            date[i] = sc.nextLine();
            System.out.println("Enter the stcock price of " + date[i] + " : ");
            price[i] = sc.nextDouble();
        }
        sc.close();
    }

    // Insert new day's closing price (append to the end of the array).
    public static void Insert(double price[], String date[], int n) {
        Scanner sc = new Scanner(System.in);
        double NPrice[] = new double[price.length + n];
        System.arraycopy(price, 0, NPrice, 0, n);
        String NDate[] = new String[date.length + n];
        System.arraycopy(date, 0, NDate, 0, n);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the date : ");
            NDate[date.length + i] = sc.nextLine();
            System.out.println("Enter the stcock price of " + date[i] + " : ");
            NPrice[price.length + i] = sc.nextDouble();
        }
        price = NPrice;
        date = NDate;
        sc.close();
    }

    // Search for the price on a specific date (linear search).
    public static void SearchTheDate(String date[], String item) {
        int found = -1;
        for (int i = 0; i < date.length; i++) {
            if (date[i].equalsIgnoreCase(item)) {
                found = i;
            }
        }
        if (found == -1) {
            System.out.println("No data found.");
        } else {
            System.out.println("Data found at index " + (found + 1) + " in the list.");
        }
    }

    // Find the highest and lowest prices within a date range (iterate through the
    // array and compare).
    public static void Range(double price[], double start, double end) {
        double low = 0.0;
        double high = 0.0;
        for (int i = 0; i < price.length; i++) {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days : ");
        int days = sc.nextInt();
        double price[] = new double[days];
        String date[] = new String[days];

        sc.close();
    }
}