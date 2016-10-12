import java.util.*;

public class DefensivePlayers extends NFLPlayer implements Celebrator
{
		// constructor
		public DefensivePlayers()
		{		}
		
		//implement celebrator
		public void Celebrate()
		{
	 		System.out.println(name + " kneels to celebrate his draft.");
		}
	 	public void celebration1()
	 	{
	 		System.out.println(name + " jumps to celebrate his draft.");
	 	}
		public void celebration2()
		{
			System.out.println(name + " cries to celebrate his draft.");
		}
		public void celebration3()
		{
			System.out.println(name + " sings to celebrate his draft.");
		}
		public void celebration4()
		{
			System.out.println(name + " holds arms in a \"V\" to celebrate his draft.");
		}
		public void celebration5()
		{
			System.out.println(name + " covers his eyes to celebrate his draft.");	
		}
		
		// print list of defensive players
		public String toString()
		{
			return "Player: " + getName() + "\nPosition: " + getPosition();
		}
}
