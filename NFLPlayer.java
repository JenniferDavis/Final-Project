/*
 * Author: Jennifer Davis
 * CST-100 Assignment Topic 4
 * Last Edited: October 4, 2016
 * 
 * This program allows a coach to draft available players for an NFL team.
 * Players include position and stats.
 * User can add and remove players from the Chosen Players List.
 * Final list is displayed and program exits.
 */

public abstract class NFLPlayer
{
 	// variables
 	private static String name;
 	private static String position;

 	// stat variables
 	public static int touchdowns = 0;
 	public static int interceptions = 0;
 	public static double yards = 0.0;
 	public static double rating = 0.0;
 	public static double careerValue = 0;
 	public static int receptions = 0;
 	public static int gamesPlayed = 0;
 	public static int gamesStarted = 0;
 	public static int tackles = 0;
	public static double sacks = 0;
 	public static int forcedFumbles = 0;
 	public static double fieldGoalsAttempted = 0;
 	public static double fieldGoalsMade = 0;
 	public static double longGain = 0;
 	public static double averageYardsPerCar;
 	public static double averageYardsPerReception;
 	public static double percentOfGoalsMade;
 	public static String team;
 	public static double averageYardsPerGame;
 	
 	
 	
 	// constructors
 	public NFLPlayer()
 	{	}
 
 	public static void NFLPlayer(String newName, String newPosition)
 	{
 		newName = name;
 		newPosition = position;
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
 	
 	public static int getTouchdowns()
 	{
 		return touchdowns;
 	}
 	
 	public static int getInterceptions()
 	{
 		return interceptions;
 	}
 	
 	public static double getYards()
 	{
 		return yards;
 	}
 	
 	public static double getRating()
 	{
 		return rating;
 	}
 	
 	public static double getCareerValue()
 	{
 		return careerValue;
 	}
 	
 	public static double getAverageYardsPerCar()
 	{
 		return (yards / careerValue);
 	}
 	
 	public static int getReceptions()
 	{
 		return receptions;
 	}
 	
 	public static double getAverageYardsPerReception()
 	{
 		return (yards / receptions);
 	}
 	
 	public static int getGamesPlayed()
 	{
 		return gamesPlayed;
 	}
 	
 	public static int getGamesStarted()
 	{
 		return gamesStarted;
 	}
 	
 	public static int getTackles()
 	{
 		return tackles;
 	}
	
 	public static double getSacks()
	{
		return sacks;
	}
 	
 	public static int getForcedFumbles()
 	{
 		return forcedFumbles;
 	}
 	
 	public static double getFieldGoalsAttempted()
 	{
 		return fieldGoalsAttempted;
 	}
 	
 	public static double getFieldGoalsMade()
 	{
 		return fieldGoalsMade;
 	}
 	
 	public static double getPercentOfGoalsMade()
 	{
 		return (percentOfGoalsMade * 100);
 	}
 	
 	public static double getLongGain()
 	{
 		return longGain;
 	}
 	
 	public static String getTeam()
 	{
 		return team;
 	}
 	
 	public static double getAverageYardsPerGame()
 	{
 		return averageYardsPerGame;
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
 	
 	public static void setTouchdowns(int newTouchdowns)
 	{
 		newTouchdowns = touchdowns;
 	}
 	
 	public static void setInterceptions(int newInterceptions)
 	{
 		newInterceptions = interceptions;
 	}
 	
 	public static void setYards(double newYards)
 	{
 		newYards = yards;
 	}
 	
 	public static void setRating(double newRating)
 	{
 		newRating = rating;
 	}
 	
 	public static void setCareerValue(double newCareerValue)
 	{
 		newCareerValue = careerValue;
 	}
 	
 	public static void setAverageYardsPerCar(double newYards, double newCar)
 	{
 		averageYardsPerCar =  (newYards / newCar);
 	}
 	
 	public static void setReceptions(int newReceptions)
 	{
 		newReceptions = receptions;
 	}
 	
 	public static void setAverageYardsPerGame(double newYards)
 	{
 		averageYardsPerGame = (newYards / 4);
 	}
 	
 	public static void setAverageYardsPerReception(double newYards, int newReceptions)
 	{
 		averageYardsPerReception = (newYards / newReceptions);
 	}
 	
 	public static void setGamesPlayed(int newGamesPlayed)
 	{
 		newGamesPlayed = gamesPlayed;
 	}
 	
 	public static void setGamesStarted(int newGamesStarted)
 	{
 		newGamesStarted = gamesStarted;
 	}
 	
 	public static void setTackles(int newTackles)
 	{
 		newTackles = tackles;
 	}
	
 	public static void setSacks(double newSacks)
	{
		newSacks = sacks;
	}
 	
 	public static void setForcedFumbles(int newForcedFumbles)
 	{
 		newForcedFumbles = forcedFumbles;
 	}
 	
 	public static void setFieldGoalsAttempted(double newFieldGoalsAttempted)
 	{
 		newFieldGoalsAttempted = fieldGoalsAttempted;
 	}
 	
 	public static void setFieldGoalsMade(double newFieldGoalsMade)
 	{
 		newFieldGoalsMade = fieldGoalsMade;
 	}
 	
 	public static void setPercentOfGoalsMade(double newFieldGoalsMade, double newFieldGoalsAttempted)
 	{
 		percentOfGoalsMade = (newFieldGoalsMade / newFieldGoalsAttempted * 100);
 	}
 	
 	public static void setLongGain(double newLongGain)
 	{
 		newLongGain = longGain;
 	}
 	
 	public static void setTeam(String newTeam)
 	{
 		newTeam = team;
 	}
 
 	// display 
 	public String toString()
 	{
 		return (name + " " + position);
 	}
}
	 