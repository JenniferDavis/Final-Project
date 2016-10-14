/* FINAL PROJECT
 * Author: Jennifer Davis
 * CST-100 Final Project
 * Last Edited: October 13, 2016
 * 
 * This program allows a coach to draft available players for an NFL team.
 * Players include position and stats.
 * User can add and remove players from the Chosen Players List.
 * Final list is displayed and program exits.
 */

public abstract class NFLPlayer implements Celebrator
{
 	// variables
 	public String name;
 	public String position;

 	// stat variables
 	public int touchdowns;
 	public int interceptions;
 	public double yards;
 	public double rating;
 	public double careerValue;
 	public int receptions;
 	public int gamesPlayed;
 	public int gamesStarted;
 	public int tackles;
	public double sacks;
 	public int forcedFumbles;
 	public double fieldGoalsAttempted;
 	public double fieldGoalsMade;
 	public double longGain;
 	public double averageYardsPerCar;
 	public double averageYardsPerReception;
 	public double percentOfGoalsMade;
 	public String team;
 	public double averageYardsPerGame;
 	public int arrayIndex;
 	
 	//default celebrators
 	public void Celebrate()
	{
 		System.out.println(name + " says thank you to celebrate his draft.");
	}
 	public void celebration1()
 	{
 		System.out.println(name + " dances to celebrate his draft.");
 	}
	public void celebration2()
	{
		System.out.println(name + " blows kisses to celebrate his draft.");
	}
	public void celebration3()
	{
		System.out.println(name + " bows his head to celebrate his draft.");
	}
	public void celebration4()
	{
		System.out.println(name + " claps to celebrate his draft.");
	}
	public void celebration5()
	{
		System.out.println(name + " nods his head to celebrate his draft.");	
	}
 
 	// constructors
 	public NFLPlayer()
 	{	}
 
 	public void NFLPlayer(String newName, String newPosition)
 	{
 		name = newName;
 		position = newPosition;
 	}
 
 	// getters
 	
 	public int getArrayIndex()
 	{
 		return arrayIndex;
 	}
 	public void setArrayIndex(int newArrayIndex)
 	{
 		arrayIndex = newArrayIndex;
 	}
 	public String getName()
 	{
 		return name;
 	}
 
 	public String getPosition()
 	{
 		return position;
 	}
 	
 	public int getTouchdowns()
 	{
 		return touchdowns;
 	}
 	
 	public int getInterceptions()
 	{
 		return interceptions;
 	}
 	
 	public double getYards()
 	{
 		return yards;
 	}
 	
 	public double getRating()
 	{
 		return rating;
 	}
 	
 	public double getCareerValue()
 	{
 		return careerValue;
 	}
 	
 	public double getAverageYardsPerCar()
 	{
 		return averageYardsPerCar;
 	}
 	
 	public int getReceptions()
 	{
 		return receptions;
 	}
 	
 	public double getAverageYardsPerReception()
 	{
 		return averageYardsPerReception;
 	}
 	
 	public int getGamesPlayed()
 	{
 		return gamesPlayed;
 	}
 	
 	public int getGamesStarted()
 	{
 		return gamesStarted;
 	}
 	
 	public int getTackles()
 	{
 		return tackles;
 	}
	
 	public double getSacks()
	{
		return sacks;
	}
 	
 	public int getForcedFumbles()
 	{
 		return forcedFumbles;
 	}
 	
 	public double getFieldGoalsAttempted()
 	{
 		return fieldGoalsAttempted;
 	}
 	
 	public double getFieldGoalsMade()
 	{
 		return fieldGoalsMade;
 	}
 	
 	public double getPercentOfGoalsMade()
 	{
 		return percentOfGoalsMade;
 	}
 	
 	public double getLongGain()
 	{
 		return longGain;
 	}
 	
 	public String getTeam()
 	{
 		return team;
 	}
 	
 	public double getAverageYardsPerGame()
 	{
 		return averageYardsPerGame;
 	}
 	
 	// setters
 	public void setName(String newName)
 	{
 		name = newName;
 	}
 
 	public void setPosition(String newPosition)
 	{
 		position = newPosition;
 	}
 	
 	public void setTouchdowns(int newTouchdowns)
 	{
 		touchdowns = newTouchdowns;
 	}
 	
 	public void setInterceptions(int newInterceptions)
 	{
 		interceptions = newInterceptions;
 	}
 	
 	public void setYards(double newYards)
 	{
 		yards = newYards;
 	}
 	
 	public void setRating(double newRating)
 	{
 		rating = newRating;
 	}
 	
 	public void setCareerValue(double newCareerValue)
 	{
 		careerValue = newCareerValue;
 	}
 	
 	public void setAverageYardsPerCar(double newYards, double newCar)
 	{
 		averageYardsPerCar =  Math.round(newYards / newCar);
 	}
 	
 	public void setReceptions(int newReceptions)
 	{
 		receptions = newReceptions;
 	}
 	
 	public void setAverageYardsPerGame(double newYards)
 	{
 		averageYardsPerGame = Math.round(newYards / 4);
 	}
 	
 	public void setAverageYardsPerReception(double newYards, int newReceptions)
 	{
 		averageYardsPerReception = Math.round(newYards / newReceptions);
 	}
 	
 	public void setGamesPlayed(int newGamesPlayed)
 	{
 		gamesPlayed = newGamesPlayed;
 	}
 	
 	public void setGamesStarted(int newGamesStarted)
 	{
 		gamesStarted = newGamesStarted;
 	}
 	
 	public void setTackles(int newTackles)
 	{
 		tackles = newTackles;
 	}
	
 	public void setSacks(double newSacks)
	{
		sacks = newSacks;
	}
 	
 	public void setForcedFumbles(int newForcedFumbles)
 	{
 		forcedFumbles = newForcedFumbles;
 	}
 	
 	public void setFieldGoalsAttempted(double newFieldGoalsAttempted)
 	{
 		fieldGoalsAttempted = newFieldGoalsAttempted;
 	}
 	
 	public void setFieldGoalsMade(double newFieldGoalsMade)
 	{
 		fieldGoalsMade = newFieldGoalsMade;
 	}
 	
 	public void setPercentOfGoalsMade(double newFieldGoalsMade, double newFieldGoalsAttempted)
 	{
 		percentOfGoalsMade = Math.round(newFieldGoalsMade / newFieldGoalsAttempted * 100);
 	}
 	
 	public void setLongGain(double newLongGain)
 	{
 		longGain = newLongGain;
 	}
 	
 	public void setTeam(String newTeam)
 	{
 		team = newTeam;
 	}
 
 	// display 
 	public String toString()
 	{
 		return (name.toString() + " " + position.toString());
 	}
}
	 