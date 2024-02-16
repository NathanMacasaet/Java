import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Scrabble
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		Map<Character , Integer> ScrabblePoints = CreateScrabblepoints();

		int calculatedPoints = PointsCalculator(input, ScrabblePoints);
		System.out.println(input + " is " + calculatedPoints + " points.");

		in.close();


	}
	private static Map<Character , Integer> CreateScrabblepoints()
	{
		//Creating List with Points 
		Map<Character , Integer> PointsMap = new HashMap<>();

		//Fill List with Charater & Assigned points 
		PointsMap.put('A', 1);
		PointsMap.put('E', 1);
		PointsMap.put('I', 1);
		PointsMap.put('O', 1);
		PointsMap.put('U', 1);
		PointsMap.put('L', 1);
		PointsMap.put('N', 1);
		PointsMap.put('S', 1);
		PointsMap.put('T', 1);
		PointsMap.put('R', 1);
		PointsMap.put('D', 2);
		PointsMap.put('G', 2);
		PointsMap.put('B', 3);
		PointsMap.put('C', 3);
		PointsMap.put('M', 3);
		PointsMap.put('P', 3);
		PointsMap.put('F', 4);
		PointsMap.put('H', 4);
		PointsMap.put('V', 4);
		PointsMap.put('W', 4);
		PointsMap.put('Y', 4);
		PointsMap.put('K', 5);
		PointsMap.put('J', 8);
		PointsMap.put('X', 8);
		PointsMap.put('Q', 10);
		PointsMap.put('Z', 10);

		return PointsMap;
	}

	private static int PointsCalculator(String input , Map<Character , Integer> pointsMap)
	{
		//create int to store total points 
		int TotalPoints = 0; 
		//make input string all Upper Case
		String in = input.toUpperCase();

		//loop to keep checking every letter in the string
		for(char letter : in.toCharArray())
		{	//containsKey() is being used to see if there is a char in the HashMap
			if(pointsMap.containsKey(letter))
			{	//Calculating the value of the Key 
				TotalPoints += pointsMap.get(letter);
			}
		}
		//Return a int with calculated points
		return TotalPoints;
	}
}