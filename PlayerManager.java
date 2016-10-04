import java.util.*;

public class PlayerManager extends NFLPlayer{
	
	public static void main(String[] args) {
	
		PlayerManager();
		System.out.println("Number of Available Players: " + players.size());
		//OffensivePlayers offensiveList = new OffensivePlayers();
		//System.out.println("Offensive Players list:\n " + offensiveList.listOffensivePlayers());
	
	}
	
	//constructor automatically creates players list
	public static void PlayerManager()
	{
		CreatePlayer();
	}
	
	// array to hold list of available players
	public static List players = new ArrayList();
	
	// add players to array
	public static void CreatePlayer()
	{
	//Quarterbacks
		PlayerManager blakeBortles = new PlayerManager();
		blakeBortles.NFLPlayer("Blake Bortles", "QB");
		blakeBortles.setYards(1050);
		blakeBortles.setInterceptions(6);
		blakeBortles.setTouchdowns(7);
		blakeBortles.setRating(79.4);
		blakeBortles.setTeam("JAX");
		blakeBortles.setAverageYardsPerGame(blakeBortles.getYards());
		players.add("Blake Bortles");
		
		PlayerManager mattRyan = new PlayerManager();
		mattRyan.NFLPlayer("Matt Ryan", "QB");
		mattRyan.setYards(1473);
		mattRyan.setInterceptions(2);
		mattRyan.setTouchdowns(11);
		mattRyan.setRating(126.3);
		mattRyan.setTeam("ATL");
		mattRyan.setAverageYardsPerGame(mattRyan.getYards());
		players.add("Matt Ryan");
		
		PlayerManager samBradford = new PlayerManager();
		samBradford.NFLPlayer("Sam Bradford", "QB");
		samBradford.setYards(457);
		samBradford.setInterceptions(0);
		samBradford.setTouchdowns(3);
		samBradford.setRating(107.8);
		samBradford.setTeam("MIN");
		samBradford.setAverageYardsPerGame(samBradford.getYards());
		players.add("Sam Bradford");
		
		PlayerManager drewBrees = new PlayerManager();
		drewBrees.NFLPlayer("Drew Brees", "QB");
		drewBrees.setYards(1269);
		drewBrees.setInterceptions(3);
		drewBrees.setTouchdowns(10);
		drewBrees.setRating(98.9);
		drewBrees.setTeam("NO");
		drewBrees.setAverageYardsPerGame(drewBrees.getYards());
		players.add("Drew Brees");
		
		PlayerManager derekCarr = new PlayerManager();
		derekCarr.NFLPlayer("Derek Carr", "QB");
		derekCarr.setYards(1066);
		derekCarr.setInterceptions(1);
		derekCarr.setTouchdowns(9);
		derekCarr.setRating(104.6);
		derekCarr.setTeam("OAK");
		derekCarr.setAverageYardsPerGame(derekCarr.getYards());
		players.add("Derek Carr");
		
		
	// Running Backs
		PlayerManager ameerAbdullah = new PlayerManager();
		ameerAbdullah.NFLPlayer("Ameer Abdullah", "RB");
		ameerAbdullah.setCareerValue(18);
		ameerAbdullah.setYards(101);
		ameerAbdullah.setAverageYardsPerCar(ameerAbdullah.getYards(), ameerAbdullah.getCareerValue());
		ameerAbdullah.setTouchdowns(0);
		ameerAbdullah.setTeam("DET");
		players.add("Ameer Abdullah");
		
		PlayerManager jayAjayi = new PlayerManager();
		jayAjayi.NFLPlayer("Jay Ajayi", "RB");
		jayAjayi.setCareerValue(18);
		jayAjayi.setYards(75);
		jayAjayi.setAverageYardsPerCar(jayAjayi.getYards(), jayAjayi.getCareerValue());
		jayAjayi.setTouchdowns(1);
		jayAjayi.setTeam("MIA");
		players.add("Jay Ajayi");
		
		PlayerManager javoriusAllen = new PlayerManager();
		javoriusAllen.NFLPlayer("Javorius Allen", "RB");
		javoriusAllen.setCareerValue(3);
		javoriusAllen.setYards(13);
		javoriusAllen.setAverageYardsPerCar(javoriusAllen.getYards(), javoriusAllen.getCareerValue());
		javoriusAllen.setTouchdowns(0);
		javoriusAllen.setTeam("BAL");
		players.add("Javorius Allen");
		
		PlayerManager cameronArtisPayne = new PlayerManager();
		cameronArtisPayne.NFLPlayer("Cameron Artis-Payne", "RB");
		cameronArtisPayne.setCareerValue(18);
		cameronArtisPayne.setYards(59);
		cameronArtisPayne.setAverageYardsPerCar(cameronArtisPayne.getYards(), cameronArtisPayne.getCareerValue());
		cameronArtisPayne.setTouchdowns(0);
		cameronArtisPayne.setTeam("CAR");
		players.add("Cameron Artis-Payne");
		
		PlayerManager mattAsiata = new PlayerManager();
		mattAsiata.NFLPlayer("Matt Asiata", "RB");
		mattAsiata.setCareerValue(16);
		mattAsiata.setYards(42);
		mattAsiata.setAverageYardsPerCar(mattAsiata.getYards(), mattAsiata.getCareerValue());
		mattAsiata.setTouchdowns(0);
		mattAsiata.setTeam("MIN");
		players.add("Matt Asiata");
		
	// tight Ends
		PlayerManager garyBarnidge = new PlayerManager();
		garyBarnidge.NFLPlayer("Gary Barnidge", "TE");
		garyBarnidge.setReceptions(16);
		garyBarnidge.setYards(160);
		garyBarnidge.setAverageYardsPerReception(garyBarnidge.getYards(), garyBarnidge.getReceptions());
		garyBarnidge.setTouchdowns(0);
		garyBarnidge.setTeam("CLE");
		players.add("Gary Barnidge");
		
		PlayerManager blakeBell = new PlayerManager();
		blakeBell.NFLPlayer("Blake Bell", "TE");
		blakeBell.setReceptions(1);
		blakeBell.setYards(6);
		blakeBell.setAverageYardsPerReception(blakeBell.getYards(), blakeBell.getReceptions());
		blakeBell.setTouchdowns(0);
		blakeBell.setTeam("SF");
		players.add("Blake Bell");
		
		PlayerManager martellusBennett = new PlayerManager();
		martellusBennett.NFLPlayer("Martellus Bennett", "TE");
		martellusBennett.setReceptions(15);
		martellusBennett.setYards(247);
		martellusBennett.setAverageYardsPerReception(martellusBennett.getYards(), martellusBennett.getReceptions());
		martellusBennett.setTouchdowns(1);
		martellusBennett.setTeam("NE");
		players.add("Martellus Bennett");
		
		PlayerManager brentCelek = new PlayerManager();
		brentCelek.NFLPlayer("Brent Celek", "TE");
		brentCelek.setReceptions(4);
		brentCelek.setYards(72);
		brentCelek.setAverageYardsPerReception(brentCelek.getYards(), brentCelek.getReceptions());
		brentCelek.setTouchdowns(0);
		brentCelek.setTeam("PHI");
		players.add("Brent Celek");
		
		PlayerManager garrettCelek = new PlayerManager();
		garrettCelek.NFLPlayer("Garrett Celek", "TE");
		garrettCelek.setReceptions(10);
		garrettCelek.setYards(131);
		garrettCelek.setAverageYardsPerReception(garrettCelek.getYards(), garrettCelek.getReceptions());
		garrettCelek.setTouchdowns(0);
		garrettCelek.setTeam("SF");
		players.add("Garrett Celek");
		
	// wide receivers
		PlayerManager dougBaldwin = new PlayerManager();
		dougBaldwin.NFLPlayer("Doug Baldwin", "WR");
		dougBaldwin.setReceptions(24);
		dougBaldwin.setYards(330);
		dougBaldwin.setAverageYardsPerReception(dougBaldwin.getYards(), dougBaldwin.getReceptions());
		dougBaldwin.setTouchdowns(2);
		dougBaldwin.setTeam("SEA");
		players.add("Doug Baldwin");
		
		PlayerManager coleBeasley = new PlayerManager();
		coleBeasley.NFLPlayer("Cole Beasley", "WR");
		coleBeasley.setReceptions(23);
		coleBeasley.setYards(279);
		coleBeasley.setAverageYardsPerReception(coleBeasley.getYards(), coleBeasley.getReceptions());
		coleBeasley.setTouchdowns(0);
		coleBeasley.setTeam("DAL");
		players.add("Cole Beasley");
		
		PlayerManager odellBeckham = new PlayerManager();
		odellBeckham.NFLPlayer("Odell Beckham", "WR");
		odellBeckham.setReceptions(19);
		odellBeckham.setYards(280);
		odellBeckham.setAverageYardsPerReception(odellBeckham.getYards(), odellBeckham.getReceptions());
		odellBeckham.setTouchdowns(0);
		odellBeckham.setTeam("NYG");
		players.add("Odell Beckham");
		
		PlayerManager kelvinBenjamin = new PlayerManager();
		kelvinBenjamin.NFLPlayer("Kelvin Benjamin", "WR");
		kelvinBenjamin.setReceptions(16);
		kelvinBenjamin.setYards(238);
		kelvinBenjamin.setAverageYardsPerReception(kelvinBenjamin.getYards(), kelvinBenjamin.getReceptions());
		kelvinBenjamin.setTouchdowns(4);
		kelvinBenjamin.setTeam("CAR");
		players.add("Kelvin Benjamin");
		
		PlayerManager travisBenjamin = new PlayerManager();
		travisBenjamin.NFLPlayer("Travis Benjamin", "WR");
		travisBenjamin.setReceptions(21);
		travisBenjamin.setYards(277);
		travisBenjamin.setAverageYardsPerReception(travisBenjamin.getYards(), travisBenjamin.getReceptions());
		travisBenjamin.setTouchdowns(2);
		travisBenjamin.setTeam("SD");
		players.add("Travis Benjamin");
		
		
	// 	Offensive linebacker	
		PlayerManager brandenAlbert = new PlayerManager();
		brandenAlbert.NFLPlayer("Branden Albert", "OL");
		brandenAlbert.setGamesPlayed(3);
		brandenAlbert.setGamesStarted(3);
		brandenAlbert.setTeam("MIA");
		players.add("Branden Albert");
		
		PlayerManager vadalAlexander = new PlayerManager();
		vadalAlexander.NFLPlayer("Vadal Alexander", "OL");
		vadalAlexander.setGamesPlayed(3);
		vadalAlexander.setGamesStarted(1);
		vadalAlexander.setTeam("OAK");
		players.add("Vadal Alexander");
		
		PlayerManager allenBarbre = new PlayerManager();
		allenBarbre.NFLPlayer("Allen Barbre", "OL");
		allenBarbre.setGamesPlayed(3);
		allenBarbre.setGamesStarted(3);
		allenBarbre.setTeam("PHI");
		players.add("Allen Barbre");
		
		PlayerManager donBarclay = new PlayerManager();
		donBarclay.NFLPlayer("Don Barclay", "OL");
		donBarclay.setGamesPlayed(3);
		donBarclay.setGamesStarted(0);
		donBarclay.setTeam("GB");
		players.add("Don Barclay");
		
		PlayerManager timBarnes = new PlayerManager();
		timBarnes.NFLPlayer("Tim Barnes", "OL");
		timBarnes.setGamesPlayed(4);
		timBarnes.setGamesStarted(4);
		timBarnes.setTeam("LA");
		players.add("Tim Barnes");
		
		
	// defensive linebackers
		PlayerManager genoAtkins = new PlayerManager();
		genoAtkins.NFLPlayer("Geno Atkins", "DL");
		genoAtkins.setTackles(11);
		genoAtkins.setSacks(2.5);
		genoAtkins.setForcedFumbles(0);
		genoAtkins.setTeam("CIN");
		players.add("Geno Atkins");
		
		PlayerManager denicoAutry = new PlayerManager();
		denicoAutry.NFLPlayer("Denico Autry", "DL");
		denicoAutry.setTackles(5);
		denicoAutry.setSacks(1.0);
		denicoAutry.setForcedFumbles(0);
		denicoAutry.setTeam("OAK");
		players.add("Denico Autry");
		
		PlayerManager cliffAvril = new PlayerManager();
		cliffAvril.NFLPlayer("Cliff Avril", "DL");
		cliffAvril.setTackles(10);
		cliffAvril.setSacks(2.0);
		cliffAvril.setForcedFumbles(1);
		cliffAvril.setTeam("SEA");
		players.add("Cliff Avril");
		
		PlayerManager robertAyers = new PlayerManager();
		robertAyers.NFLPlayer("Robert Ayers", "DL");
		robertAyers.setTackles(4);
		robertAyers.setSacks(1.0);
		robertAyers.setForcedFumbles(0);
		robertAyers.setTeam("TB");
		players.add("Robert Ayers");
		
		PlayerManager jonathanBabineaux = new PlayerManager();
		jonathanBabineaux.NFLPlayer("Jonathan Babineaux", "DL");
		jonathanBabineaux.setTackles(5);
		jonathanBabineaux.setSacks(0.0);
		jonathanBabineaux.setForcedFumbles(0);
		jonathanBabineaux.setTeam("ATL");
		players.add("Jonathan Babineaux");
	
	// Linebackers	
		PlayerManager djAlexander = new PlayerManager();
		djAlexander.NFLPlayer("D.J. Alexander", "LB");
		djAlexander.setTackles(2);
		djAlexander.setSacks(0.0);
		djAlexander.setForcedFumbles(0);
		djAlexander.setTeam("KC");
		players.add("D.J. Alexander");
		
		PlayerManager lorenzoAlexander = new PlayerManager();
		lorenzoAlexander.NFLPlayer("Lorenzo Alexander", "LB");
		lorenzoAlexander.setTackles(21);
		lorenzoAlexander.setSacks(4.0);
		lorenzoAlexander.setForcedFumbles(2);
		lorenzoAlexander.setTeam("BUF");
		players.add("Lorenzo Alexander");
		
		PlayerManager kwonAlexander = new PlayerManager();
		kwonAlexander.NFLPlayer("Kwon Alexander", "LB");
		kwonAlexander.setTackles(38);
		kwonAlexander.setSacks(2.0);
		kwonAlexander.setForcedFumbles(0);
		kwonAlexander.setInterceptions(1);
		kwonAlexander.setTeam("TB");
		players.add("Kwon Alexander");
		
		PlayerManager kikoAlonso = new PlayerManager();
		kikoAlonso.NFLPlayer("Kiko Alonso", "LB");
		kikoAlonso.setTackles(38);
		kikoAlonso.setSacks(0.0);
		kikoAlonso.setForcedFumbles(0);
		kikoAlonso.setTeam("MIA");
		players.add("Kiko Alonso");
		
		PlayerManager jonathanAnderson = new PlayerManager();
		jonathanAnderson.NFLPlayer("Jonathan Anderson", "LB");
		jonathanAnderson.setTackles(4);
		jonathanAnderson.setSacks(0.0);
		jonathanAnderson.setForcedFumbles(0);
		jonathanAnderson.setTeam("CHI");
		players.add("Jonathan Anderson");
		
		
	// Defensive backers
		PlayerManager beneBenwikere = new PlayerManager();
		beneBenwikere.NFLPlayer("Bene' Benwikere", "DB");
		beneBenwikere.setTackles(10);
		beneBenwikere.setSacks(0.0);
		beneBenwikere.setForcedFumbles(0);
		beneBenwikere.setInterceptions(1);
		beneBenwikere.setTeam("CAR");
		players.add("Bene' Benwikere");
		
		PlayerManager natBerhe = new PlayerManager();
		natBerhe.NFLPlayer("Nat Berhe", "DB");
		natBerhe.setTackles(14);
		natBerhe.setSacks(0.0);
		natBerhe.setForcedFumbles(1);
		natBerhe.setTeam("NYG");
		players.add("Nat Berhe");
		
		PlayerManager ericBerry = new PlayerManager();
		ericBerry.NFLPlayer("Eric Berry", "DB");
		ericBerry.setTackles(17);
		ericBerry.setSacks(0.0);
		ericBerry.setForcedFumbles(0);
		ericBerry.setInterceptions(1);
		ericBerry.setTeam("KC");
		players.add("Eric Berry");
		
		PlayerManager antoineBethea = new PlayerManager();
		antoineBethea.NFLPlayer("Antoine Bethea", "DB");
		antoineBethea.setTackles(28);
		antoineBethea.setSacks(0.0);
		antoineBethea.setForcedFumbles(1);
		antoineBethea.setInterceptions(1);
		antoineBethea.setTeam("SF");
		players.add("Antoine Bethea");
		
		PlayerManager justinBethel = new PlayerManager();
		justinBethel.NFLPlayer("Justin Bethel", "DB");
		justinBethel.setTackles(4);
		justinBethel.setSacks(0.0);
		justinBethel.setForcedFumbles(0);
		justinBethel.setTeam("ARI");
		players.add("Justin Bethel");
		
	// Kickers	
		PlayerManager joshBrown = new PlayerManager();
		joshBrown.NFLPlayer("Josh Brown", "K");
		joshBrown.setFieldGoalsAttempted(6);
		joshBrown.setFieldGoalsMade(5);
		joshBrown.setPercentOfGoalsMade(joshBrown.getFieldGoalsMade(), joshBrown.getFieldGoalsAttempted());
		joshBrown.setLongGain(48);
		justinBethel.setTeam("NYG");
		players.add("Josh Brown");
	
		PlayerManager dustinHopkins = new PlayerManager();
		dustinHopkins.NFLPlayer("Dustin Hopkins", "K");
		dustinHopkins.setFieldGoalsAttempted(12);
		dustinHopkins.setFieldGoalsMade(12);
		dustinHopkins.setPercentOfGoalsMade(dustinHopkins.getFieldGoalsMade(), dustinHopkins.getFieldGoalsAttempted());
		dustinHopkins.setLongGain(49);
		dustinHopkins.setTeam("WAS");
		players.add("Dustin Hopkins");
		
		PlayerManager mikeNugent = new PlayerManager();
		mikeNugent.NFLPlayer("Mike Nugent", "K");
		mikeNugent.setFieldGoalsAttempted(13);
		mikeNugent.setFieldGoalsMade(12);
		mikeNugent.setPercentOfGoalsMade(mikeNugent.getFieldGoalsMade(), mikeNugent.getFieldGoalsAttempted());
		mikeNugent.setLongGain(47);
		mikeNugent.setTeam("CIN");
		players.add("Mike Nugent");
		
		PlayerManager danCarpenter = new PlayerManager();
		danCarpenter.NFLPlayer("Dan Carpenter", "K");
		danCarpenter.setFieldGoalsAttempted(8);
		danCarpenter.setFieldGoalsMade(6);
		danCarpenter.setPercentOfGoalsMade(danCarpenter.getFieldGoalsMade(), danCarpenter.getFieldGoalsAttempted());
		danCarpenter.setLongGain(45);
		danCarpenter.setTeam("BUF");
		players.add("Dan Carpenter");
		
		PlayerManager chandlerCatanzaro = new PlayerManager();
		chandlerCatanzaro.NFLPlayer("Chandler Catanzaro", "K");
		chandlerCatanzaro.setFieldGoalsAttempted(6);
		chandlerCatanzaro.setFieldGoalsMade(5);
		chandlerCatanzaro.setPercentOfGoalsMade(chandlerCatanzaro.getFieldGoalsMade(), chandlerCatanzaro.getFieldGoalsAttempted());
		chandlerCatanzaro.setLongGain(60);
		chandlerCatanzaro.setTeam("ARI");
		players.add("Chandler Catanzaro");	
	
	}
	
	//@Override
	public String toString()
	{
		return ("Number of Available Players: " + players.size());
 	}
	
	
}
