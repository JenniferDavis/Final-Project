import java.util.*;
/*
 * Author: Jennifer Davis
 * CST-100 Assignment Topic 4
 * Last Edited: September 24, 2016
 * 
 * This program allows a coach to draft available players for an NFL team.
 * Players include position and stats.
 * User can add and remove players from the Chosen Players List.
 * Final list is displayed and program exits.
 */


public class NFLPlayer {

	public static void main(String[] args) {
		// Create PlayerManager object
		PlayerManager manage = new PlayerManager();
		
		// Opening Screen to start game
		System.out.println("------NFL DRAFT BOARD------");
		System.out.println("Pick Your Team");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter \"Y\" to start:");
		String start = input.next();
		System.out.println();
		if(start.equalsIgnoreCase("Y"))
		{
			PlayerManager.startGame();
		}
		else
		{
			System.exit(0);
		}
	
		/*
		System.out.println("There are " + manage.Players.length + " players to choose from.");
		System.out.println("\nList of Players:\n");
		Arrays.stream(manage.Players).forEach(System.out::println);
		*/
	}
	
}
