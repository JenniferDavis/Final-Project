// FINAL PROJECT
import java.util.*;
import java.applet.*;



public class PlayerManager extends Applet{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Create player objects to hold player attributes
	static ArrayList<NFLPlayer> players = new ArrayList<>();
	static ArrayList<NFLPlayer> chosenPlayers = new ArrayList<>();
	
	public void init() {
		startGame();
				
	}

	
	public static void addToChosenList(int x)
	{
		// add to the chosen list
		NFLPlayer y = players.get(x);
		chosenPlayers.add(y);
		y.setArrayIndex(chosenPlayers.indexOf(y));
		// print celebration of draft
		Random r = new Random();
		int randomCelebrator = r.nextInt(5);
		printCelebration(randomCelebrator, x);				
				
		// remove from the available list
		NFLPlayer z = players.get(x);
		players.remove(z);
		// reset index numbers for available list
		for (int i = 0; i < players.size(); i++)
		{
			players.get(i).setArrayIndex(i);
		}			
	}
	
	public static void removeFromChosenList(int x)
	{
		// add to the chosen list
		NFLPlayer y = chosenPlayers.get(x);
		players.add(y);
		y.setArrayIndex(players.indexOf(y));
				
		// remove from the available list
		NFLPlayer z = chosenPlayers.get(x);
		chosenPlayers.remove(z);
		// reset index numbers for available list
		for (int i = 0; i < chosenPlayers.size(); i++)
		{
			chosenPlayers.get(i).setArrayIndex(i);
		}				
	}
	

	@Override
	public String toString()
	{
		return ("This is the toString method in PlayerManager");
	}
 	
	// prints the random celebrations when player is drafted
	public static void printCelebration(int newRandomCelebrator, int newUsersChoice)
	{
		if (newRandomCelebrator == 0)
		{
			players.get(newUsersChoice).celebrate();
		}
		else if (newRandomCelebrator == 1)
		{
			players.get(newUsersChoice).celebration1();
		}
		else if (newRandomCelebrator == 2)
		{
			players.get(newUsersChoice).celebration2();
		}
		else if (newRandomCelebrator == 3)
		{
			players.get(newUsersChoice).celebration3();
		}
		else if (newRandomCelebrator == 4)
		{
			players.get(newUsersChoice).celebration4();
		}
		else if (newRandomCelebrator == 5)
		{
			players.get(newUsersChoice).celebration5();
		}
	}
		
	// get user input from available list
	public static void getAvailableListUserInput()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a player number to add or remove, \"A\", \"C\", or \"F\": ");
		String usersChoice = input.next();
		if (usersChoice.toUpperCase().equals("A"))
		{
			// display the Available Players List
			printAvailablePlayersList();
		}
		else if (usersChoice.toUpperCase().equals("C"))
		{
			// display the Chosen Players List
			printChosenPlayersList();
		}
		else if (usersChoice.toUpperCase().equals("F"))
		{
			// display the finalized list
			printFinalPlayersList();
		}
		else 
		{
			int x = Integer.parseInt(usersChoice);
			if(players.size() <= 0)
			{
				System.out.println("There are no players in this list");
				printAvailablePlayersList();
			}
			else if (x > players.size()-1)
			{
				System.out.println("Invalid choice.  Choose again.");
				printAvailablePlayersList();
			}
			else 
			{	
				addToChosenList(x);
				printAvailablePlayersList();
			}
		}	
	}
	
	
	// get user input from available list
		public static void getChosenListUserInput()
		{
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("\nEnter a player number to add or remove, \"A\", \"C\", or \"F\": ");
			String usersChoice = input.next();
			if (usersChoice.toUpperCase().equals("A"))
			{
				// display the Available Players List
				printAvailablePlayersList();
			}
			else if (usersChoice.toUpperCase().equals("C"))
			{
				// display the Chosen Players List
				printChosenPlayersList();
			}
			else if (usersChoice.toUpperCase().equals("F"))
			{
				// display the finalized list
				printFinalPlayersList();
			}
			else 
			{
				int x = Integer.parseInt(usersChoice);
				if(chosenPlayers.size() <= 0)
				{
					System.out.println("There are no players in this list");
					printAvailablePlayersList();
				}
				else if (x > chosenPlayers.size()-1)
				{
					System.out.println("Invalid choice.  Choose again.");
					printChosenPlayersList();
				}
				else 
				{	
					removeFromChosenList(x);
					printAvailablePlayersList();
				}
				
			}	
		}
		
	//print list of available players
	public static void printAvailablePlayersList()
	{		
		System.out.println("\nNumber of Available Players: " + players.size());
		System.out.println("\nLIST OF AVAILABLE PLAYERS: \n");
		if(players.size() <= 0)
		{
			System.out.println("There are no players in this list");
		}
		if(players.size() > 0)
		{
			System.out.println(players.toString().replace("[", "").replace("]", "").replace(",", "\n"));

		}
		getAvailableListUserInput();
	}
		
	//print list of chosen players
	public static void printChosenPlayersList()
	{	
		System.out.println("\nLIST OF CHOSEN PLAYERS: \n");
		if(chosenPlayers.size() <= 0)
		{
			System.out.println("There are no players in this list");
		}
		if(chosenPlayers.size() > 0)
		{
			System.out.println(chosenPlayers.toString().replace("[", "").replace("]", "").replace(",", "\n"));

		}
		getChosenListUserInput();
	}
		
	//print final list of drafted players
	public static void printFinalPlayersList()
	{
		System.out.println("\nFINAL LIST OF DRAFTED PLAYERS: \n");
		if(chosenPlayers.size() <= 0)
		{
			System.out.println("There are no players in this list");
		}
		if(chosenPlayers.size() > 0)
		{
			System.out.println(chosenPlayers.toString().replace("[", "").replace("]", "").replace(",", "\n"));

		}
		
		// play again or exit game?
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("\nDo you want to play again? Enter \"Y\" to start or \"N\" to end game:");
		String start = input.next();
		System.out.println();
		if(start.equalsIgnoreCase("Y"))
		{
			startGame();
		}
		else
		{
			System.out.println("Game has ended");
			System.exit(0);
		}						
	}

	
	// Opening screen to start game
	public static void startGame()
	{
		// Opening Screen to start game
		players.clear();
		chosenPlayers.clear();
		System.out.println("------NFL DRAFT BOARD------");
		System.out.println("Pick Your Winning Team");
		System.out.println("     ___________________    ");
		System.out.println("   \u2215|                   |\\   ");
		System.out.println("  \u2215||                   ||\\ ");
		System.out.println(" \u2215 ||                   || \\");
		System.out.println("|  ||   |-|-|-|-|-|-|   ||  |");
		System.out.println(" \\ ||                   || /");
		System.out.println("  \\||                   ||/ ");
		System.out.println("   \\|___________________|/   ");
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter \"Y\" to start:");
		String start = input.next();
		System.out.println();
		if(start.equalsIgnoreCase("Y"))
		{
			displayInstructions();
			CreatePlayers();
			printAvailablePlayersList();
		}
		else
		{
			System.out.println("Game has ended");
			System.exit(0);
		}
	}
			
	// display instructions 
	public static void displayInstructions()
	{
		System.out.println("INSTRUCTIONS:\nTo add an Available Player to the Chosen List\n" + 
				"or to remove a player from the Chosen List, enter the player's number.\n" 
				+ "or enter \"C\" to view the Chosen List.  \nOr enter \"A\" to see the Available List. "
				+ "\nOr enter \"F\" to finalize the draft list.");
		System.out.println();
	}		
			
	// Create player objects and attach attributes
	public static void CreatePlayers()
	{		
		//Quarterbacks
		OffensivePlayer blakeBortles = new OffensivePlayer();
		blakeBortles.nFLPlayer("Blake Bortles", "QB");
		blakeBortles.setYards(1050);
		blakeBortles.setInterceptions(6);
		blakeBortles.setTouchdowns(7);
		blakeBortles.setRating(79.4);
		blakeBortles.setTeam("JAX");
		blakeBortles.setAverageYardsPerGame(blakeBortles.getYards());
		players.add(blakeBortles);
		blakeBortles.setArrayIndex (players.indexOf(blakeBortles));
		
		OffensivePlayer mattRyan = new OffensivePlayer();
		mattRyan.nFLPlayer("Matt Ryan", "QB");
		mattRyan.setYards(1473);
		mattRyan.setInterceptions(2);
		mattRyan.setTouchdowns(11);
		mattRyan.setRating(126.3);
		mattRyan.setTeam("ATL");
		mattRyan.setAverageYardsPerGame(mattRyan.getYards());
		players.add(mattRyan);
		mattRyan.setArrayIndex (players.indexOf(mattRyan));
			
		OffensivePlayer samBradford = new OffensivePlayer();
		samBradford.nFLPlayer("Sam Bradford", "QB");
		samBradford.setYards(457);
		samBradford.setInterceptions(0);
		samBradford.setTouchdowns(3);
		samBradford.setRating(107.8);
		samBradford.setTeam("MIN");
		samBradford.setAverageYardsPerGame(samBradford.getYards());
		players.add(samBradford);
		//samBradford.setListNumber(3);
		samBradford.setArrayIndex (players.indexOf(samBradford));
		
		OffensivePlayer drewBrees = new OffensivePlayer();
		drewBrees.nFLPlayer("Drew Brees", "QB");
		drewBrees.setYards(1269);
		drewBrees.setInterceptions(3);
		drewBrees.setTouchdowns(10);
		drewBrees.setRating(98.9);
		drewBrees.setTeam("NO");
		drewBrees.setAverageYardsPerGame(drewBrees.getYards());
		players.add(drewBrees);
		drewBrees.setArrayIndex (players.indexOf(drewBrees));
		
		OffensivePlayer derekCarr = new OffensivePlayer();
		derekCarr.nFLPlayer("Derek Carr", "QB");
		derekCarr.setYards(1066);
		derekCarr.setInterceptions(1);
		derekCarr.setTouchdowns(9);
		derekCarr.setRating(104.6);
		derekCarr.setTeam("OAK");
		derekCarr.setAverageYardsPerGame(derekCarr.getYards());
		players.add(derekCarr);
		derekCarr.setArrayIndex (players.indexOf(derekCarr));
		
		// running backs
		OffensivePlayer ameerAbdullah = new OffensivePlayer();
		ameerAbdullah.nFLPlayer("Ameer Abdullah", "RB");
		ameerAbdullah.setCareerValue(18);
		ameerAbdullah.setYards(101);
		ameerAbdullah.setAverageYardsPerCar(ameerAbdullah.getYards(), ameerAbdullah.getCareerValue());
		ameerAbdullah.setTouchdowns(0);
		ameerAbdullah.setTeam("DET");
		players.add(ameerAbdullah);
		ameerAbdullah.setArrayIndex (players.indexOf(ameerAbdullah));
					
		OffensivePlayer jayAjayi = new OffensivePlayer();
		jayAjayi.nFLPlayer("Jay Ajayi", "RB");
		jayAjayi.setCareerValue(18);
		jayAjayi.setYards(75);
		jayAjayi.setAverageYardsPerCar(jayAjayi.getYards(), jayAjayi.getCareerValue());
		jayAjayi.setTouchdowns(1);
		jayAjayi.setTeam("MIA");
		players.add(jayAjayi);
		jayAjayi.setArrayIndex (players.indexOf(jayAjayi));
			
		OffensivePlayer javoriusAllen = new OffensivePlayer();
		javoriusAllen.nFLPlayer("Javorius Allen", "RB");
		javoriusAllen.setCareerValue(3);
		javoriusAllen.setYards(13);
		javoriusAllen.setAverageYardsPerCar(javoriusAllen.getYards(), javoriusAllen.getCareerValue());
		javoriusAllen.setTouchdowns(0);
		javoriusAllen.setTeam("BAL");
		players.add(javoriusAllen);
		javoriusAllen.setArrayIndex (players.indexOf(javoriusAllen));
		
		OffensivePlayer cameronArtisPayne = new OffensivePlayer();
		cameronArtisPayne.nFLPlayer("Cameron Artis-Payne", "RB");
		cameronArtisPayne.setCareerValue(18);
		cameronArtisPayne.setYards(59);
		cameronArtisPayne.setAverageYardsPerCar(cameronArtisPayne.getYards(), cameronArtisPayne.getCareerValue());
		cameronArtisPayne.setTouchdowns(0);
		cameronArtisPayne.setTeam("CAR");
		players.add(cameronArtisPayne);
		cameronArtisPayne.setArrayIndex (players.indexOf(cameronArtisPayne));
			
		OffensivePlayer mattAsiata = new OffensivePlayer();
		mattAsiata.nFLPlayer("Matt Asiata", "RB");
		mattAsiata.setCareerValue(16);
		mattAsiata.setYards(42);
		mattAsiata.setAverageYardsPerCar(mattAsiata.getYards(), mattAsiata.getCareerValue());
		mattAsiata.setTouchdowns(0);
		mattAsiata.setTeam("MIN");
		players.add(mattAsiata);
		mattAsiata.setArrayIndex (players.indexOf(mattAsiata));
		
		// tight Ends
		OffensivePlayer garyBarnidge = new OffensivePlayer();
		garyBarnidge.nFLPlayer("Gary Barnidge", "TE");
		garyBarnidge.setReceptions(16);
		garyBarnidge.setYards(160);
		garyBarnidge.setAverageYardsPerReception(garyBarnidge.getYards(), garyBarnidge.getReceptions());
		garyBarnidge.setTouchdowns(0);
		garyBarnidge.setTeam("CLE");
		players.add(garyBarnidge);
		garyBarnidge.setArrayIndex (players.indexOf(garyBarnidge));
		
		OffensivePlayer blakeBell = new OffensivePlayer();
		blakeBell.nFLPlayer("Blake Bell", "TE");
		blakeBell.setReceptions(1);
		blakeBell.setYards(6);
		blakeBell.setAverageYardsPerReception(blakeBell.getYards(), blakeBell.getReceptions());
		blakeBell.setTouchdowns(0);
		blakeBell.setTeam("SF");
		players.add(blakeBell);
		blakeBell.setArrayIndex (players.indexOf(blakeBell));
		
		OffensivePlayer martellusBennett = new OffensivePlayer();
		martellusBennett.nFLPlayer("Martellus Bennett", "TE");
		martellusBennett.setReceptions(15);
		martellusBennett.setYards(247);
		martellusBennett.setAverageYardsPerReception(martellusBennett.getYards(), martellusBennett.getReceptions());
		martellusBennett.setTouchdowns(1);
		martellusBennett.setTeam("NE");
		players.add(martellusBennett);
		martellusBennett.setArrayIndex (players.indexOf(martellusBennett));
		
		OffensivePlayer brentCelek = new OffensivePlayer();
		brentCelek.nFLPlayer("Brent Celek", "TE");
		brentCelek.setReceptions(4);
		brentCelek.setYards(72);
		brentCelek.setAverageYardsPerReception(brentCelek.getYards(), brentCelek.getReceptions());
		brentCelek.setTouchdowns(0);
		brentCelek.setTeam("PHI");
		players.add(brentCelek);
		brentCelek.setArrayIndex (players.indexOf(brentCelek));
		
		OffensivePlayer garrettCelek = new OffensivePlayer();
		garrettCelek.nFLPlayer("Garrett Celek", "TE");
		garrettCelek.setReceptions(10);
		garrettCelek.setYards(131);
		garrettCelek.setAverageYardsPerReception(garrettCelek.getYards(), garrettCelek.getReceptions());
		garrettCelek.setTouchdowns(0);
		garrettCelek.setTeam("SF");
		players.add(garrettCelek);
		garrettCelek.setArrayIndex (players.indexOf(garrettCelek));
		
		// wide receivers
		OffensivePlayer dougBaldwin = new OffensivePlayer();
		dougBaldwin.nFLPlayer("Doug Baldwin", "WR");
		dougBaldwin.setReceptions(24);
		dougBaldwin.setYards(330);
		dougBaldwin.setAverageYardsPerReception(dougBaldwin.getYards(), dougBaldwin.getReceptions());
		dougBaldwin.setTouchdowns(2);
		dougBaldwin.setTeam("SEA");
		players.add(dougBaldwin);
		dougBaldwin.setArrayIndex (players.indexOf(dougBaldwin));
		
		OffensivePlayer coleBeasley = new OffensivePlayer();
		coleBeasley.nFLPlayer("Cole Beasley", "WR");
		coleBeasley.setReceptions(23);
		coleBeasley.setYards(279);
		coleBeasley.setAverageYardsPerReception(coleBeasley.getYards(), coleBeasley.getReceptions());
		coleBeasley.setTouchdowns(0);
		coleBeasley.setTeam("DAL");
		players.add(coleBeasley);
		coleBeasley.setArrayIndex (players.indexOf(coleBeasley));
		
		OffensivePlayer odellBeckham = new OffensivePlayer();
		odellBeckham.nFLPlayer("Odell Beckham", "WR");
		odellBeckham.setReceptions(19);
		odellBeckham.setYards(280);
		odellBeckham.setAverageYardsPerReception(odellBeckham.getYards(), odellBeckham.getReceptions());
		odellBeckham.setTouchdowns(0);
		odellBeckham.setTeam("NYG");
		players.add(odellBeckham);
		odellBeckham.setArrayIndex (players.indexOf(odellBeckham));
		
		OffensivePlayer kelvinBenjamin = new OffensivePlayer();
		kelvinBenjamin.nFLPlayer("Kelvin Benjamin", "WR");
		kelvinBenjamin.setReceptions(16);
		kelvinBenjamin.setYards(238);
		kelvinBenjamin.setAverageYardsPerReception(kelvinBenjamin.getYards(), kelvinBenjamin.getReceptions());
		kelvinBenjamin.setTouchdowns(4);
		kelvinBenjamin.setTeam("CAR");
		players.add(kelvinBenjamin);
		kelvinBenjamin.setArrayIndex (players.indexOf(kelvinBenjamin));
		
		OffensivePlayer travisBenjamin = new OffensivePlayer();
		travisBenjamin.nFLPlayer("Travis Benjamin", "WR");
		travisBenjamin.setReceptions(21);
		travisBenjamin.setYards(277);
		travisBenjamin.setAverageYardsPerReception(travisBenjamin.getYards(), travisBenjamin.getReceptions());
		travisBenjamin.setTouchdowns(2);
		travisBenjamin.setTeam("SD");
		players.add(travisBenjamin);
		travisBenjamin.setArrayIndex (players.indexOf(travisBenjamin));
		
		
		// 	Offensive linebacker	
		OffensivePlayer brandenAlbert = new OffensivePlayer();
		brandenAlbert.nFLPlayer("Branden Albert", "OL");
		brandenAlbert.setGamesPlayed(3);
		brandenAlbert.setGamesStarted(3);
		brandenAlbert.setTeam("MIA");
		players.add(brandenAlbert);
		brandenAlbert.setArrayIndex (players.indexOf(brandenAlbert));
		
		OffensivePlayer vadalAlexander = new OffensivePlayer();
		vadalAlexander.nFLPlayer("Vadal Alexander", "OL");
		vadalAlexander.setGamesPlayed(3);
		vadalAlexander.setGamesStarted(1);
		vadalAlexander.setTeam("OAK");
		players.add(vadalAlexander);
		vadalAlexander.setArrayIndex (players.indexOf(vadalAlexander));
		
		OffensivePlayer allenBarbre = new OffensivePlayer();
		allenBarbre.nFLPlayer("Allen Barbre", "OL");
		allenBarbre.setGamesPlayed(3);
		allenBarbre.setGamesStarted(3);
		allenBarbre.setTeam("PHI");
		players.add(allenBarbre);
		allenBarbre.setArrayIndex (players.indexOf(allenBarbre));
		
		OffensivePlayer donBarclay = new OffensivePlayer();
		donBarclay.nFLPlayer("Don Barclay", "OL");
		donBarclay.setGamesPlayed(3);
		donBarclay.setGamesStarted(0);
		donBarclay.setTeam("GB");
		players.add(donBarclay);
		donBarclay.setArrayIndex (players.indexOf(donBarclay));
		
		OffensivePlayer timBarnes = new OffensivePlayer();
		timBarnes.nFLPlayer("Tim Barnes", "OL");
		timBarnes.setGamesPlayed(4);
		timBarnes.setGamesStarted(4);
		timBarnes.setTeam("LA");
		players.add(timBarnes);
		timBarnes.setArrayIndex (players.indexOf(timBarnes));
		
		
		// defensive linebackers
		DefensivePlayer genoAtkins = new DefensivePlayer();
		genoAtkins.nFLPlayer("Geno Atkins", "DL");
		genoAtkins.setTackles(11);
		genoAtkins.setSacks(2.5);
		genoAtkins.setForcedFumbles(0);
		genoAtkins.setTeam("CIN");
		players.add(genoAtkins);
		genoAtkins.setArrayIndex (players.indexOf(genoAtkins));
				
		DefensivePlayer denicoAutry = new DefensivePlayer();
		denicoAutry.nFLPlayer("Denico Autry", "DL");
		denicoAutry.setTackles(5);
		denicoAutry.setSacks(1.0);
		denicoAutry.setForcedFumbles(0);
		denicoAutry.setTeam("OAK");
		players.add(denicoAutry);
		denicoAutry.setArrayIndex (players.indexOf(denicoAutry));
		
		DefensivePlayer cliffAvril = new DefensivePlayer();
		cliffAvril.nFLPlayer("Cliff Avril", "DL");
		cliffAvril.setTackles(10);
		cliffAvril.setSacks(2.0);
		cliffAvril.setForcedFumbles(1);
		cliffAvril.setTeam("SEA");
		players.add(cliffAvril);
		cliffAvril.setArrayIndex (players.indexOf(cliffAvril));
		
		DefensivePlayer robertAyers = new DefensivePlayer();
		robertAyers.nFLPlayer("Robert Ayers", "DL");
		robertAyers.setTackles(4);
		robertAyers.setSacks(1.0);
		robertAyers.setForcedFumbles(0);
		robertAyers.setTeam("TB");
		players.add(robertAyers);
		robertAyers.setArrayIndex (players.indexOf(robertAyers));
		
		DefensivePlayer jonathanBabineaux = new DefensivePlayer();
		jonathanBabineaux.nFLPlayer("Jonathan Babineaux", "DL");
		jonathanBabineaux.setTackles(5);
		jonathanBabineaux.setSacks(0.0);
		jonathanBabineaux.setForcedFumbles(0);
		jonathanBabineaux.setTeam("ATL");
		players.add(jonathanBabineaux);
		jonathanBabineaux.setArrayIndex (players.indexOf(jonathanBabineaux));
	
		// Linebackers	
		DefensivePlayer djAlexander = new DefensivePlayer();
		djAlexander.nFLPlayer("D.J. Alexander", "LB");
		djAlexander.setTackles(2);
		djAlexander.setSacks(0.0);
		djAlexander.setForcedFumbles(0);
		djAlexander.setTeam("KC");
		players.add(djAlexander);
		djAlexander.setArrayIndex (players.indexOf(djAlexander));
		
		DefensivePlayer lorenzoAlexander = new DefensivePlayer();
		lorenzoAlexander.nFLPlayer("Lorenzo Alexander", "LB");
		lorenzoAlexander.setTackles(21);
		lorenzoAlexander.setSacks(4.0);
		lorenzoAlexander.setForcedFumbles(2);
		lorenzoAlexander.setTeam("BUF");
		players.add(lorenzoAlexander);
		lorenzoAlexander.setArrayIndex (players.indexOf(lorenzoAlexander));
		
		DefensivePlayer kwonAlexander = new DefensivePlayer();
		kwonAlexander.nFLPlayer("Kwon Alexander", "LB");
		kwonAlexander.setTackles(38);
		kwonAlexander.setSacks(2.0);
		kwonAlexander.setForcedFumbles(0);
		kwonAlexander.setInterceptions(1);
		kwonAlexander.setTeam("TB");
		players.add(kwonAlexander);
		kwonAlexander.setArrayIndex (players.indexOf(kwonAlexander));
		
		DefensivePlayer kikoAlonso = new DefensivePlayer();
		kikoAlonso.nFLPlayer("Kiko Alonso", "LB");
		kikoAlonso.setTackles(38);
		kikoAlonso.setSacks(0.0);
		kikoAlonso.setForcedFumbles(0);
		kikoAlonso.setTeam("MIA");
		players.add(kikoAlonso);
		kikoAlonso.setArrayIndex (players.indexOf(kikoAlonso));
		
		DefensivePlayer jonathanAnderson = new DefensivePlayer();
		jonathanAnderson.nFLPlayer("Jonathan Anderson", "LB");
		jonathanAnderson.setTackles(4);
		jonathanAnderson.setSacks(0.0);
		jonathanAnderson.setForcedFumbles(0);
		jonathanAnderson.setTeam("CHI");
		players.add(jonathanAnderson);
		jonathanAnderson.setArrayIndex (players.indexOf(jonathanAnderson));
		
		// Defensive backers
		DefensivePlayer beneBenwikere = new DefensivePlayer();
		beneBenwikere.nFLPlayer("Bene' Benwikere", "DB");
		beneBenwikere.setTackles(10);
		beneBenwikere.setSacks(0.0);
		beneBenwikere.setForcedFumbles(0);
		beneBenwikere.setInterceptions(1);
		beneBenwikere.setTeam("CAR");
		players.add(beneBenwikere);
		beneBenwikere.setArrayIndex (players.indexOf(beneBenwikere));
				
		DefensivePlayer natBerhe = new DefensivePlayer();
		natBerhe.nFLPlayer("Nat Berhe", "DB");
		natBerhe.setTackles(14);
		natBerhe.setSacks(0.0);
		natBerhe.setForcedFumbles(1);
		natBerhe.setTeam("NYG");
		players.add(natBerhe);
		natBerhe.setArrayIndex (players.indexOf(natBerhe));
		
		DefensivePlayer ericBerry = new DefensivePlayer();
		ericBerry.nFLPlayer("Eric Berry", "DB");
		ericBerry.setTackles(17);
		ericBerry.setSacks(0.0);
		ericBerry.setForcedFumbles(0);
		ericBerry.setInterceptions(1);
		ericBerry.setTeam("KC");
		players.add(ericBerry);
		ericBerry.setArrayIndex (players.indexOf(ericBerry));
		
		DefensivePlayer antoineBethea = new DefensivePlayer();
		antoineBethea.nFLPlayer("Antoine Bethea", "DB");
		antoineBethea.setTackles(28);
		antoineBethea.setSacks(0.0);
		antoineBethea.setForcedFumbles(1);
		antoineBethea.setInterceptions(1);
		antoineBethea.setTeam("SF");
		players.add(antoineBethea);
		antoineBethea.setArrayIndex (players.indexOf(antoineBethea));
		
		DefensivePlayer justinBethel = new DefensivePlayer();
		justinBethel.nFLPlayer("Justin Bethel", "DB");
		justinBethel.setTackles(4);
		justinBethel.setSacks(0.0);
		justinBethel.setForcedFumbles(0);
		justinBethel.setTeam("ARI");
		players.add(justinBethel);
		justinBethel.setArrayIndex (players.indexOf(justinBethel));
		
	// Kickers	
		OffensivePlayer joshBrown = new OffensivePlayer();
		joshBrown.nFLPlayer("Josh Brown", "K");
		joshBrown.setFieldGoalsAttempted(6);
		joshBrown.setFieldGoalsMade(5);
		joshBrown.setPercentOfGoalsMade(joshBrown.getFieldGoalsMade(), joshBrown.getFieldGoalsAttempted());
		joshBrown.setLongGain(48);
		joshBrown.setTeam("NYG");
		players.add(joshBrown);
		joshBrown.setArrayIndex (players.indexOf(joshBrown));
	
		OffensivePlayer dustinHopkins = new OffensivePlayer();
		dustinHopkins.nFLPlayer("Dustin Hopkins", "K");
		dustinHopkins.setFieldGoalsAttempted(12);
		dustinHopkins.setFieldGoalsMade(12);
		dustinHopkins.setPercentOfGoalsMade(dustinHopkins.getFieldGoalsMade(), dustinHopkins.getFieldGoalsAttempted());
		dustinHopkins.setLongGain(49);
		dustinHopkins.setTeam("WAS");
		players.add(dustinHopkins);
		dustinHopkins.setArrayIndex (players.indexOf(dustinHopkins));
		
		OffensivePlayer mikeNugent = new OffensivePlayer();
		mikeNugent.nFLPlayer("Mike Nugent", "K");
		mikeNugent.setFieldGoalsAttempted(13);
		mikeNugent.setFieldGoalsMade(12);
		mikeNugent.setPercentOfGoalsMade(mikeNugent.getFieldGoalsMade(), mikeNugent.getFieldGoalsAttempted());
		mikeNugent.setLongGain(47);
		mikeNugent.setTeam("CIN");
		players.add(mikeNugent);
		mikeNugent.setArrayIndex (players.indexOf(mikeNugent));
		
		OffensivePlayer danCarpenter = new OffensivePlayer();
		danCarpenter.nFLPlayer("Dan Carpenter", "K");
		danCarpenter.setFieldGoalsAttempted(8);
		danCarpenter.setFieldGoalsMade(6);
		danCarpenter.setPercentOfGoalsMade(danCarpenter.getFieldGoalsMade(), danCarpenter.getFieldGoalsAttempted());
		danCarpenter.setLongGain(45);
		danCarpenter.setTeam("BUF");
		players.add(danCarpenter);
		danCarpenter.setArrayIndex (players.indexOf(danCarpenter));
		
		OffensivePlayer chandlerCatanzaro = new OffensivePlayer();
		chandlerCatanzaro.nFLPlayer("Chandler Catanzaro", "K");
		chandlerCatanzaro.setFieldGoalsAttempted(6);
		chandlerCatanzaro.setFieldGoalsMade(5);
		chandlerCatanzaro.setPercentOfGoalsMade(chandlerCatanzaro.getFieldGoalsMade(), chandlerCatanzaro.getFieldGoalsAttempted());
		chandlerCatanzaro.setLongGain(60);
		chandlerCatanzaro.setTeam("ARI");
		players.add(chandlerCatanzaro);
		chandlerCatanzaro.setArrayIndex (players.indexOf(chandlerCatanzaro));
	}	
			
}