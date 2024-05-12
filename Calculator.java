import java.util.Scanner;
public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int ans = 0;
        while(true)
        {
            System.out.println("Enter the operation you want to perform : ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op =='%')
            {
                System.out.println("Enter 2 numbers : ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(op == '+')
                {
                    ans = a + b;
                }
                if(op == '-')
                {
                    if(a >= b)
                    {
                      ans = a - b;
                    }
                    else
                    {
                        ans = b - a;
                    }
                }
                if(op == '*')
                {
                    ans = a * b;
                }
                if(op == '/')
                {
                    if(a != 0)
                    {
                      ans = a / b;
                    }
                }
                if(op == '%')
                {
                    ans = a % b;
                }
            }
            else if(op == 'x' || op == 'X')
            {
                break;
            }
            else
            {
                System.out.println("Wrong operation input");
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
