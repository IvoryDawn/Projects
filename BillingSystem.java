import java.util.*;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items : ");
        int items = sc.nextInt();
        int Price = 0;

        for (int i = 0; i < items; i++) {
            System.out.println("Price of the item : ");
            int pr = sc.nextInt();
            Price += pr;
        }

        System.out.println("Total Price : " + Price);
        System.out.println("GST : " + (0.12 * Price));
        System.out.println("Amount to be paid : " + (Price + (0.12 * Price)));
    }
}
