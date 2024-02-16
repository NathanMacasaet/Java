import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.random.*;

public class Sudoku 
{
    private static final int Win_Width = 600;
    private static final int Win_Height = 600;
    public static void main(String [] args)
    {
        // final int Win_Width = 600;
        // final int Win_Height = 600;
        SwingUtilities.invokeLater(() -> 
        {
            sudoku();
        });

    }
    public static void sudoku()
    {
        Window Win = new Window(Win_Width, Win_Height, "Nate's Sudoku");
        Win.run(30);
    }
}

class Window
{
    public JFrame WindowFrame;
    public Board Board;
    public TextWindow Numbers;
    public Keyboard keyboard;
    public String sudoku;

    Window(int width, int height, String title)
    {
        Random rand = new Random();
        rand.nextInt(9);
        WindowFrame = new JFrame();
        WindowFrame.setBounds(0, 0, width, height);
        WindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WindowFrame.setTitle(title);
        WindowFrame.setResizable(false);
        WindowFrame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        WindowFrame.setSize(width, height);

        Board = new Board(this);
        WindowFrame.add(Board);
        
        Numbers = new TextWindow(this);
        WindowFrame.add(Numbers);

        keyboard = new Keyboard(this);
        keyboard.setFocusable(true);
        WindowFrame.add(keyboard);

        WindowFrame.getContentPane().setBackground(Color.BLACK);
        WindowFrame.setVisible(true);
    }

    public void run(int n)
    {
        int GamesRun = 0; 
        while(GamesRun != n)
        {
            if(Board.autoEval(sudoku));
                GamesRun++;
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ignored) //Handle InterruptedException if needed
            {
                
            }
        }
        
    }

}
