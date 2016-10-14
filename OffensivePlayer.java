// FINAL PROJECT
public class OffensivePlayer extends NFLPlayer implements Celebrator{
	
	
	
	@Override
	public String toString()
	{
		if (position.toUpperCase().equals("QB"))
		{
			return ("\nList#\tName\t\tOffPos\tYards\tInts.\tTDs\tRating\tTeam\tAvgYds/Game\n" +
			arrayIndex + "\t" + name + "\t" + position + "\t" + yards + "\t" + interceptions + "\t" + touchdowns + "\t" + rating + "\t" + team + "\t" + averageYardsPerGame);
		}
		
		else if (position.toUpperCase().equals("RB"))
		{
			return ("\nList#\tName\t\tOffPos\tCarVal\tYards\tAvgY/C\tTDs\tTeam\n" + 
					arrayIndex + "\t" + name + "\t" + position + "\t" + careerValue + "\t" + yards + "\t" + averageYardsPerCar + "\t" + touchdowns + "\t" + team);
		}

		else if (position.toUpperCase().equals("TE"))
		{
			return ("\nList#\tName\t\tOffPos\tRecep\tAvgY/R\tTDs\tTeam\n" + 
					arrayIndex + "\t" + name + "\t" + position + "\t" + receptions + "\t" + averageYardsPerReception + "\t" + touchdowns + "\t" + team);
		}
		
		else if (position.toUpperCase().equals("WR"))
		{
			return ("\nList#\tName\t\tOffPos\tRecep\tYards\tAvgY/R\tTDs\tTeam\n" + 
					arrayIndex + "\t" + name + "\t" + position + "\t" + receptions + "\t" + yards + "\t" + averageYardsPerReception + "\t" + touchdowns + "\t" + team);
		}
	
		
		else if (position.toUpperCase().equals("OL"))
		{
			return ("\nList#\tName\t\tOffPos\tRec\tGP\tGS\tTeam\n" + 
					arrayIndex + "\t" + name + "\t" + position + "\t" + receptions + "\t" + averageYardsPerReception + "\t" + touchdowns + "\t" + team);
		}
//	 
		else if (position.toUpperCase().equals("K"))
		{
			return ("\nList#\tName\t\tOffPos\tFGA\tFGM\tPGM\tLG\tTeam\n" + 
					arrayIndex + "\t" + name + "\t" + position + "\t" + fieldGoalsAttempted + "\t" + fieldGoalsMade + "\t" + percentOfGoalsMade + "\t" + longGain + "\t" + team);
		}

		else 
		{
			return null;
		}
		
	}

	//implement celebrator
	@Override
	public void celebrate()
	{
 		System.out.println(name + " does cartwheels to celebrate his draft.");
	}
	@Override
	public void celebration1()
 	{
 		System.out.println(name + " shouts to celebrate his draft.");
 	}
	@Override
	public void celebration2()
	{
		System.out.println(name + " points upward to celebrate his draft.");
	}
	@Override
	public void celebration3()
	{
		System.out.println(name + " smiles to celebrate his draft.");
	}
	@Override
	public void celebration4()
	{
		System.out.println(name + " laughs to celebrate his draft.");
	}
	@Override
	public void celebration5()
	{
		System.out.println(name + " hugs his mom to celebrate his draft.");	
	}
}
