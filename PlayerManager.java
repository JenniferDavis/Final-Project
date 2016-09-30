import java.util.*;

public class PlayerManager extends NFLPlayer{
	
	public static void main(String[] args) {
	
		PlayerManager();
		//PlayerManager.toString();
		System.out.println("Number of Available Players: " + players.size());
		
	}
	
	// array to hold list of available players
	public static List players = new ArrayList();
	
	//constructor
	public static void PlayerManager()
	{
		CreatePlayer();
	}
	
	// create player method to add players to array
	public static void CreatePlayer()
	{
		NFLPlayer.NFLPlayer("Brandon Allen", "QB", 0);
		players.add("Brandon Allen");
		
		NFLPlayer.NFLPlayer("Clark Davis", "RB", 7);
		players.add("Clark Davis");
		
		NFLPlayer.NFLPlayer("Jody Davis", "TE", 5);
		players.add("Jody Davise");
		
		NFLPlayer.NFLPlayer("Zach Davis", "C", 6);
		players.add("Zach Davis");
		
		NFLPlayer.NFLPlayer("Tristan Davis", "T", 8);
		players.add("Tristan Davis");
		
		NFLPlayer.NFLPlayer("Alex Inniss", "QB", 10);
		players.add("Alex Inniss");
		
		NFLPlayer.NFLPlayer("Joseph Davis", "G", 1);
		players.add("Joseph Davis");
	}
	
	//@Override
	public String toString()
	{
		return ("Number of Available Players: " + players.size());
 	}
}
