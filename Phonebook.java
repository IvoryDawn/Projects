/*Simple Phonebook Application:
Use an array to store contact information (name, phone number).
Implement functions to:
Search for a contact by name (linear search).
Insert a new contact (handle array resizing if necessary).
Delete a contact by name (shift elements after deletion).
Bonus: Sort the contact list alphabetically (insertion sort or selection sort).*/

import java.util.*;

public class Phonebook {

    public static boolean validatePhoneNumber(Scanner sc) {
        System.out.println("Enter phone number: ");
        try {
            long number = sc.nextLong();
            if (String.valueOf(number).length() == 10) {
                return true;
            } else {
                System.out.println("Invalid phone number length! Please enter 10 digits.");
                return false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid phone number format. Please enter a 10-digit number.");
            sc.nextLine(); // Clear the invalid input from buffer
            return false;
        }
    }

    public static void AddContact(int n, String names[], long phno[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Remember to enter contact number/Phone number of 10 digits only.");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter contact name " + (i + 1) + " : ");
            names[i] = sc.nextLine();

            if (!validatePhoneNumber(sc)) {
                System.out.println("Skipping contact due to invalid phone number.");
                i--; // Decrement i to avoid skipping an entry (optional)
            } else {
                phno[i] = sc.nextLong(); // Assuming valid number based on validation function
            }
        }
        sc.close();
    }

    // Search contact phone number using linear search
    public static int SearchContactnumber1(long phno[], long target) {
        for (int i = 0; i < phno.length; i++) {
            if (target == phno[i]) {
                return i; // Returns the index at which the contact number is found
            }
        }
        return -1; // When contact number is not found returns -1
    }

    // Search contact number using binary search
    // public static int SearchContactnumber2(long phno[], long target) {
    // Arrays.sort(phno); // Sorts the array

    // int start = 0;
    // int end = (phno.length - 1);

    // while (start <= end) {
    // int mid = ((start + end) / 2);
    // if (phno[mid] == target) {
    // return mid;
    // } else if (phno[mid] > target) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1; // When contact number is not found returns -1
    // }

    // Search Contact name using String function
    public static int SearchContactName(String names[], String target) {
        for (int i = 0; i < names.length; i++) {
            if (target.equalsIgnoreCase(names[i])) {
                return i; // Returns the index at which the contact name is found
            }
        }
        return -1; // When contact name is not found returns -1
    }

    // To evaluate the response of the user regarding searching any contact name
    public static void WantSearchContactName(String names[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to search any contact name ? (Yes/No) : ");
        String response = sc.nextLine();

        switch (response) {
            case "Yes":
                System.out.println("Enter the contact you want to search : ");
                String target = sc.nextLine();
                int ans = SearchContactName(names, target);
                if (ans == -1) {
                    System.out.println("No Contact found of this name.");
                } else {
                    System.out.println(target + " found at the index " + (ans + 1) + " in the contact list.");
                }
                break;

            case "No":
                System.out.println("Let's explores more features.");
                break;

            default:
                System.out.println("Invalid Responose. Try Again !!!");
        }

        sc.close();
    }

    // To evaluate the response of the user regarding searching any contact number
    public static void WantSearchContactNumber(long phno[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to search any contact number ? (Yes/No) : ");
        String response = sc.nextLine();

        switch (response) {
            case "Yes":
                System.out.println("Enter the contact number you want to search : ");
                long target = sc.nextLong();
                int ans = SearchContactnumber1(phno, target);
                if (ans == -1) {
                    System.out.println("No Contact found of this number.");
                } else {
                    System.out.println(target + " found at the index " + (ans + 1) + " in the contcat list.");
                }
                break;

            case "No":
                System.out.println("Let's explores more features.");
                break;

            default:
                System.out.println("Invalid Responose. Try Again !!!");
        }

        sc.close();
    }

    // To insert a new contact
    public static void InsertNewContact(String names[], long phno[], int n) {
        Scanner sc = new Scanner(System.in);

        String NameList[] = new String[names.length + n];
        System.arraycopy(names, 0, NameList, 0, n);

        long NumList[] = new long[phno.length + n];
        System.arraycopy(phno, 0, NumList, 0, n);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the contact name you want to search : ");
            String NewName = sc.nextLine();
            NameList[names.length + i] = NewName;

            System.out.println("Enter the contact number you want to search : ");
            long NewNumber = sc.nextLong();
            NumList[phno.length + i] = NewNumber;
        }

        names = NameList;
        phno = NumList;

        sc.close();
    }

    // To evaluate the response of the user regarding insertion of any new contact
    public static void WantInsertContact(String names[], long phno[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to insert any contact name ? (Yes/No) : ");
        String response = sc.nextLine();

        switch (response) {
            case "Yes":
                System.out.println("How many contact do you want to insert ? :");
                int n = sc.nextInt();
                InsertNewContact(names, phno, n);

                System.out.println("Your final Contact List : ");
                PrintContactList(names, phno);

            case "No":
                System.out.println("Let's explores more features.");
                break;

            default:
                System.out.println("Invalid Responose. Try Again !!!");
        }

        sc.close();
    }

    // To delete any contact
    public static void DeleteContact(String names[], long phno[], int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the contact name which you want to delete : ");
            String CName = sc.nextLine();
            int found = SearchContactName(names, CName);
            if (found == -1) {
                System.out.println("No such Contact found.");
            } else {
                for (int j = found; j < names.length; j++) {
                    names[j] = names[j + 1];
                    phno[j] = phno[j + 1];
                }
                names[names.length - 1] = null;
                phno[phno.length - 1] = 0;
            }
        }

        sc.close();
    }

    // To evaluate the response of the user regarding deletion of any new contact
    public static void WantDeleteContact(String names[], long phno[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to delete any contact name ? (Yes/No) : ");
        String response = sc.nextLine();

        switch (response) {
            case "Yes":
                System.out.println("How many contact do you want to delete ? :");
                int n = sc.nextInt();
                DeleteContact(names, phno, n);

                System.out.println("Your final contact list : ");
                PrintContactList(names, phno);
            case "No":
                System.out.println("Let's explores more features.");
                break;

            default:
                System.out.println("Invalid Responose. Try Again !!!");
        }

        sc.close();
    }

    public static void PrintContactList(String names[], long phno[]) {
        System.out.println("--------CONTACT LIST--------");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + " " + names[i] + "  :  " + phno[i]);
        }
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For saving contact names
        System.out.print("Enter number of contacts you wanna save : ");
        int n = sc.nextInt();

        // Array to store names
        String names[] = new String[n];

        // Array to store phone numbers of respective contact names
        long phno[] = new long[n];

        // Adding the contacts
        AddContact(n, names, phno);

        // Print the Contact List
        // PrintContactList(names, phno);

        // Search any contact name
        // WantSearchContactName(names);

        // Search any contact number
        // WantSearchContactNumber(phno);

        // Insert any new contact
        // WantInsertContact(names, phno);

        // Delete any contact
        // WantDeleteContact(names, phno);

        sc.close();
    }
}