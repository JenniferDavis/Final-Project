import java.util.*;

public class OffensivePlayers extends NFLPlayer implements Celebrator
{

	//implement celebrator
		public void Celebrate()
		{
	 		System.out.println(name + " does cartwheels to celebrate his draft.");
		}
	 	public void celebration1()
	 	{
	 		System.out.println(name + " shouts to celebrate his draft.");
	 	}
		public void celebration2()
		{
			System.out.println(name + " points upward to celebrate his draft.");
		}
		public void celebration3()
		{
			System.out.println(name + " smiles to celebrate his draft.");
		}
		public void celebration4()
		{
			System.out.println(name + " laughs to celebrate his draft.");
		}
		public void celebration5()
		{
			System.out.println(name + " hugs his mom to celebrate his draft.");	
		}
		
	// get list of offensive positions
	public OffensivePlayers()
	{		
		String position1 = blakeBortles.getPosition();
		if(position1 = "QB")
		{
			System.out.println(blakeBortles);
		}
	}
}
