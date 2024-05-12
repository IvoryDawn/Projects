/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean search(char target, String str)
    {
        boolean found = false;
        for(int i = 0; i < str.length(); i++)
        {
            if(target == str.charAt(i))
            {
                found = true;
            }
        }
       return found;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
		    int arr[] = new int[26];
		    for(int i = 0; i < 26; i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    String str = sc.next();
		    // Traverse through string & find the missing alphabets
            char ch = 'a';
            int sum = 0;
		    for(int i = 0 ; i <26; i++)
            {
               if(!search(ch, str))
               {
                 sum += arr[i];
               }
               ch++;
            }
            System.out.println(sum);
		}
        sc.close();
	}
}
