import java.util.Scanner;

public class PrimeRange
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input First Number");
        int num1 = in.nextInt();
        System.out.println("Input Second Number");
        int num2 = in.nextInt();

        System.out.println("Prime numbers within the range : ");
        Prime(num1, num2);

        in.close();
    }

    public static void Prime(int num1, int num2)
    {
        int counter =0;
        for(int i = num1; i <= num2; i++)
        {
            if(isSecond(i))
            {
                System.out.print(i + " ");
                counter += 1;
            }
        }
        System.out.print("\nPrime Counter : " + counter);
    }

    public static boolean isSecond(int n)
    {
        if(n < 2)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i ++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
