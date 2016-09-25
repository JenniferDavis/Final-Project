import java.util.*;

/*
 * Author: Jennifer Davis
 * CST-100 Assignment Topic 3
 * CST-100 Assignment Topic 4
 * Last Edited: September 24, 2016
 * 
 * This class manages the players used in NFLPlayer.java
 */


public class PlayerManager {
	
	public static String [] players = new String[10];
	public static String [] positions = new String[10];
	public static double [] statistics = new double[6];
	
	//Players 
	public static String player1 = "1. Drew Brees";
	public static String player2 = "2. Kwon Alexander";
	public static String player3 = "3. Lamar Miller";
	public static String player4 = "4. Leonard Williams";
	public static String player5 = "5. A.J. Green";
	public static String player6 = "6. Brandon Carr";
	public static String player7 = "7. Alex Smith";
	public static String player8 = "8. Amari Cooper";
	public static String player9 = "9. Andy Dalton";
	public static String player10 = "10. Danny Woodhead";
	
	//Player positions
	public static String position1 = "QB";
	public static String position2 = "RB";
	public static String position3 = "WR";
	public static String position4 = "TE";
	public static String position5 = "OL";
	public static String position6 = "DL";
	public static String position7 = "LB";
	public static String position8 = "DB";
	public static String position9 = "K";
	public static String position10 = "P";
	
	//Player stats
	public static double passingYards = 0.0;
	public static double tackles = 0;
	public static double rushingYards = 0;
	public static double sacks = 0;
	public static double receivingYards = 0;
	public static double interceptions = 0;
	
	public PlayerManager()
	{
		createPlayers();
		createPositions();
		statistics();
	}
	
	// instructions, display Available Players List, and request user input
	public static void startGame()
	{
		displayInstructions();
		availablePlayersList();
		getUserInput();
	}

	// display instructions 
	public static void displayInstructions()
	{
		System.out.println("INSTRUCTIONS:\nTo add an Available Player to the Chosen List, enter the player's number.\n" 
				+ "Enter \"C\" to view the Chosen List.  \nEnter \"A\" to see the Available List. "
				+ "\nEnter \"F\" to finalize the draft list.");
		System.out.println();
	}
	
	// display Available Players List
	public static void availablePlayersList()
	{
		System.out.println("AVAILABLE PLAYERS LIST:");
		Arrays.stream(players).forEach(System.out::println); // will have to change array to available array
		System.out.println();
	}
	
	// display Chosen Players List
	public static void chosenPlayersList()
	{
		System.out.println("CHOSEN PLAYERS LIST:");
		Arrays.stream(players).forEach(System.out::println); // will have to change array to available array
		System.out.println();
	}
		
	// display Finalized List
	public static void displayFinalizedList()
	{
		System.out.println("FINALIZED PLAYER DRAFT LIST:");
		Arrays.stream(players).forEach(System.out::println); // will have to change array to available array
		System.out.println();
	}
	
	// get user input
	public static void getUserInput()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a player number, \"A\", \"C\", or \"F\": ");
		String usersChoice = input.next();
		if (usersChoice == "A")
		{
			// display the Available Players List
		}
		else if (usersChoice == "C")
		{
			// display the Chosen Players List
		}
		else if (usersChoice == "F")
		{
			// display the finalized list
		}
		else 
		{
			// either add or remove (switch) the player depending on which list user is on
		}	
	}
	
	// put players into Players array
	public static void createPlayers(){
		players[0] = player1;
		players[1] = player2;
		players[2] = player3;
		players[3] = player4;
		players[4] = player5;
		players[5] = player6;
		players[6] = player7;
		players[7] = player8;
		players[8] = player9;
		players[9] = player10;
	}
	public static void createPositions(){
		positions[0] = position1;
		positions[1] = position2;
		positions[2] = position3;
		positions[3] = position4;
		positions[4] = position5;
		positions[5] = position6;
		positions[6] = position7;
		positions[7] = position8;
		positions[8] = position9;
		positions[9] = position10;
	}
	
	public static void statistics(){
		statistics[0] = passingYards;
		statistics[1] = tackles;
		statistics[2] = rushingYards;
		statistics[3] = sacks;
		statistics[4] = receivingYards;
		statistics[5] = interceptions;
	}
	

	public String getPlayer(int i)
	{
	    return players[i];
	}
	
	public void setPlayer(int i, String value)
	{
	     players[i] = value;
	}
	public String getPosition(int i)
	{
	    return positions[i];
	}
	
	public void setPosition(int i, String value)
	{
	     positions[i] = value;
	}
	public double getPassingYards(double i)
	{
	    return statistics[(int)i];
	}
	
	public void setPassingYards(double i, double value)
	{
		statistics[(int)i] = value;
	}
	public double getTackles(double i)
	{
	    return statistics[(int)i];
	}
	
	public void setTackles(double i, double value)
	{
		statistics[(int)i] = value;
	}
	public double getRushingYards(double i)
	{
	    return statistics[(int)i];
	}
	
	public void setRushingYards(double i, double value)
	{
		statistics[(int)i] = value;
	}
	public double getSacks(double i)
	{
	    return statistics[(int)i];
	}
	
	public void setSacks(double i, double value)
	{
		statistics[(int)i] = value;
	}
	public double getReceivingYards(double i)
	{
	    return statistics[(int)i];
	}
	
	public void setReceivingYards(double i, double value)
	{
		statistics[(int)i] = value;
	}
	public double getInterceptions(double i)
	{
	    return statistics[(int)i];
	}
	
	public void setInterceptions(double i, double value)
	{
		statistics[(int)i] = value;
	}	
	
}


