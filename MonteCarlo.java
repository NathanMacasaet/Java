import java.util.Random;

public class MonteCarlo
{
   public static void main(String[] args)
   {
      Random rand = new Random();
      double temp = Math.random();
      rand.nextDouble(1000000);
      simulation(temp);
   }
   public static void simulation(double dub_random)
   {
        int Throw = 0;
        int Success = 0;

        for(int i =0; i <= 1000000; i++)
        {
            double x = dub_random;
            double y = dub_random;
            Throw++;

            if(x*x + y*y <1)
            {
                Success++;
            }

        }
        System.out.println("Pi/4 = " + (double)Success/(double)Throw);
        System.out.println("Pi = " + 4*(double)Success/(double)Throw);
   }
}
