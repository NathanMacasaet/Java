import java.util.Scanner;
public class Prime
{   //Check for prime numbers in within a range
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("input range");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();
        System.out.println("prime number between :" + num1 + " " + num2);
        PrimeRange(num1 , num2);
    }

    private static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                return false;   
            }
        }
        return true;
    }

    private static void PrimeRange(int start, int end)
    {
        for(int i = start; i < end; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }

}