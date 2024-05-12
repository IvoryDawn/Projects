import java.util.Scanner;
public class CurrencyConvertor 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 : Rupee");
        System.out.println("Press 2 : Dollar");
        System.out.println("Press 3 : Korean Won");
        System.out.println("Press 4 : Euro");

        System.out.println("Enter the currency choosen :");
        int currency = sc.nextInt();
        System.out.println("Enter the amount of input : ");
        int amt = sc.nextInt();

        switch(currency)
        {
            case 1 : System.out.println("1 Rupee = 0.012 Dollar");
                           System.out.println(amt+" Rupee = " +(amt * 0.012)+ " Dollar");

                           System.out.println("1 Rupee = 16.26 Korean Won");
                           System.out.println(amt+" Rupee = " +(amt * 16.26)+ " Korean Won");

                           System.out.println("1 Rupee = 0.011 Euro");
                           System.out.println(amt+" Rupee = " +(amt * 0.011)+ " Euro");
                           break;
            
            case 2 : System.out.println("1 Dollar = 83.27 Rupee");
                     System.out.println(amt+" Dollar = " +(amt * 83.27)+ " Rupee");

                     System.out.println("1 Dollar = 1_353.76 Korean Won");
                     System.out.println(amt+" Dollar = " +(amt * 1_353.76)+ " Korean Won");

                     System.out.println("1 Dollar = 0.95  Euro");
                     System.out.println(amt+" Dollar = " +(amt * 0.95)+ " Euro");
                     break;

            case 3 : System.out.println("1 Korean Won = 0.062 Rupee");
                     System.out.println(amt+" Korean Won = " +(amt * 0.062)+ " Rupee");

                     System.out.println("1 Korean Won = 0.00074 Dollar");
                     System.out.println(amt+" Korean Won = " +(amt * 0.00074)+ " Dollar");

                     System.out.println("1 Korean Won = 0.00070 Euro");
                     System.out.println(amt+" Korean Won = " +(amt * 0.00070)+ " Euro");
                     break;

            case 4 : System.out.println("1 Euro = 87.75 Rupee");
                     System.out.println(amt+" Euro = " +(amt * 87.75)+ " Rupee");

                     System.out.println("1 Euro = 1.05 Dollar");
                     System.out.println(amt+" Euro = " +(amt * 1.05)+ " Dollar");

                     System.out.println("1 Euro = 1,427.46 Korean Won");
                     System.out.println(amt+" Euro = " +(amt * 1_427.46)+ " Korean Won");
                     break;
            
            default : System.out.println("Invalid input");
        }
        sc.close();
    }    
}
