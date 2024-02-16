import java.util.Scanner;
//Task : Find if CreditCard number is valid or invalid 
public class CreditCard
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String CardNum = in.nextLine();

        if(LuhnSeq(CardNum))
        {
            System.out.println("This is a valid Card Number");
        }
        else
        {
            System.out.println("This is NOT a Valid Card Number");
        }
        in.close();
    }

    public static boolean LuhnSeq(String CardNum) // Checking every second digits and *2
    {   
        int CardSum = 0;
        boolean IsSecond = false;


        for(int i = CardNum.length() - 1; i >= 0 ; i-- )
        {
            int dig = CardNum .charAt(i) - '0';
            
            if(IsSecond == true)
            {
                dig = dig * 2;

                CardSum += dig / 10;
                CardSum += dig % 10;

                IsSecond = !IsSecond; 
            }
            else
            {
                CardSum += dig;
                IsSecond = !IsSecond;
            }
        }
        return (CardSum % 10 == 0) ;
    }
}
