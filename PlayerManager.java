/*
 * Author: Jennifer Davis
 * CST-100 Assignment Topic 3
 * Last Edited: September 17, 2016
 * 
 * This class manages the players used in NFLPlayer.java
 */


public class PlayerManager {
	
	public PlayerManager(){
		createPlayers();
	}
	

	// create object from NFLPlayer main class so that I can access the variables already set there.
	NFLPlayer nflPlayer = new NFLPlayer(); 
	
	// create an array to hold the list of available players
	public static String[] Players = new String[10];
	
	//create a method called CreatePlayers to put players into Players array
	public void createPlayers(){
		Players[0] = "Drew Brees";
		Players[1] = nflPlayer.Player2;
		Players[2] = nflPlayer.Player3;
		Players[3] = nflPlayer.Player4;
		Players[4] = nflPlayer.Player5;
		Players[5] = nflPlayer.Player6;
		Players[6] = nflPlayer.Player7;
		Players[7] = nflPlayer.Player8;
		Players[8] = nflPlayer.Player9;
		Players[9] = nflPlayer.Player10;
	}
		
}


