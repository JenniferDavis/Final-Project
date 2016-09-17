import java.util.*;
/*
 * Author: Jennifer Davis
 * CST-100 Assignment Topic 2
 * Last Edited: September 11, 2016
 * 
 * This program allows a coach to draft available players for an NFL team.
 */


public class NFLPlayer {

	public static void main(String[] args) {
		
		PlayerManager manage = new PlayerManager();
	
		System.out.println("There are " + manage.Players.length + " players to choose from.");
		System.out.println("\nList of Players:\n");
		Arrays.stream(manage.Players).forEach(System.out::println);
	}
	
	//Players 
	String Player1 = "Drew Brees";
	String Player2 = "Kwon Alexander";
	String Player3 = "Lamar Miller";
	String Player4 = "Leonard Williams";
	String Player5 = "A.J. Green";
	String Player6 = "Brandon Carr";
	String Player7 = "Alex Smith";
	String Player8 = "Amari Cooper";
	String Player9 = "Andy Dalton";
	String Player10 = "Danny Woodhead";

	
	//Player stats
	int passingYards = 0;
	int tackles = 0;
	int rushingYards = 0;
	double sacks = 0;
	int receivingYards = 0;
	int interceptions = 0;
	

	//Player positions
	String position1 = "QB";
	String position2 = "RB";
	String position3 = "WR";
	String position4 = "TE";
	String position5 = "OL";
	String position6 = "DL";
	String position7 = "LB";
	String position8 = "DB";
	String position9 = "K";
	String position10 = "P";
	
}
