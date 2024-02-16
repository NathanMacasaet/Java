import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SHA256
{
    public static void main (String [] args)
    {
        var vs = load(new File("./Dune_Saga.txt"));
        for(int i = 0; i < 50; i++)
        {
            System.out.println(vs[i]);
        }
        
    }

    public static String[] load(File file) 
    {
        StringBuilder contents = new StringBuilder();
        BufferedReader input = null;
        try
        {
            input = new BufferedReader(new FileReader(file.getAbsoluteFile() ) );
            String line;
            while((line = input.readLine() ) != null)
                if(!line.isBlank() )
                    contents.append(line)
                    .append(System.getProperty("line.separator") );
            } catch(IOException ex)
            {
                ex.printStackTrace();
            } 
            finally
            {
                try
                {
                    if(input != null)
                        input.close();
                } 
                catch(IOException ex)
                {
                    ex.printStackTrace();
                }
            }
            String[] arr = contents.toString().split("\n");
            for(int i = 0, len = arr.length; i < len; i++)
                arr[i] = arr[i].trim();
            return arr;
    }
}