
public abstract class NFLPlayer
{
 	// variables
 	private static String name;
 	private static String position;
 	private static int stats;
 
 	// constructors
 	public NFLPlayer()
 	{	}
 
 	public static void NFLPlayer(String newName, String newPosition, int newStats)
 	{
 		newName = name;
 		newPosition = position;
 		newStats = stats;
 	}
 
 	// getters
 	public static String getName()
 	{
 		return name;
 	}
 
 	public static String getPosition()
 	{
 		return position;
 	}
 
 	public static int getStats()
 	{
 		return stats;
 	}
 
 	// setters
 	public static void setName(String newName)
 	{
 		newName = name;
 	}
 
 	public static void setPosition(String newPosition)
 	{
 		newPosition = position;
 	}
 
 	public static void setStats(int newStats)
 	{
 		newStats = stats;
	}
 
 	// display 
 	public String toString()
 	{
 		return (name + " " + position + " " + stats);
 	}
}
	 