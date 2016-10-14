// FINAL PROJECT
public class DefensivePlayer extends NFLPlayer implements Celebrator{
	
	@Override
	public String toString()
	{
		if (position.toUpperCase().equals("DL"))
		{
			return ("\nList#\tName\t\tDefPos\tTackles\tSacks\tFF\tTeam\n" +
			arrayIndex + "\t" + name + "\t" + position + "\t" + tackles + "\t" + sacks + "\t" + forcedFumbles + "\t" + team);
		}
		
		else if (position.toUpperCase().equals("LB"))
		{
			return ("\nList#\tName\t\tDefPos\tTackles\tSacks\tFF\tTeam\n" +
			arrayIndex + "\t" + name + "\t" + position + "\t" + tackles + "\t" + sacks + "\t" + forcedFumbles + "\t" + team);
		}
		
		else if (position.toUpperCase().equals("DB"))
		{
			return ("\nList#\tName\t\tDefPos\tTackles\tSacks\tFF\tInt\tTeam\n" +
			arrayIndex + "\t" + name + "\t" + position + "\t" + tackles + "\t" + sacks + "\t" + forcedFumbles + "\t" + interceptions + "\t" + team);
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
		System.out.println(name + " kneels to celebrate his draft.");
	}
	@Override
	public void celebration1()
	{
		System.out.println(name + " jumps to celebrate his draft.");
	}
	@Override
	public void celebration2()
	{
		System.out.println(name + " cries to celebrate his draft.");
	}
	@Override
	public void celebration3()
	{
		System.out.println(name + " sings to celebrate his draft.");
	}
	@Override
	public void celebration4()
	{
		System.out.println(name + " holds arms in a \"V\" to celebrate his draft.");
	}
	@Override
	public void celebration5()
	{
		System.out.println(name + " covers his eyes to celebrate his draft.");	
	}
}
