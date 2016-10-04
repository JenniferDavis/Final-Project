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
	//Quarterbacks
		NFLPlayer.NFLPlayer("Blake Bortles", "QB", 0);
		//	Bortles, Blake	ACT	TDS	7	INT	6	YDS	1,050	RTG	79.4	  JAX
		players.add("Blake Bortles");
		
		NFLPlayer.NFLPlayer("Trevone Boykin", "QB", 0);
		//	Boykin, Trevone	ACT	TDS	1	INT	1	YDS	65	RTG	94.2	SEA
		players.add("Trevone Boykin");
		
		NFLPlayer.NFLPlayer("Sam Bradford", "QB", 0);
		//	Bradford, Sam	ACT	TDS	3	INT	0	YDS	457	RTG	107.8	MIN
		players.add("Sam Bradford");
		
		NFLPlayer.NFLPlayer("Drew Brees", "QB", 0);
		// 	Brees, Drew	ACT	TDS	10	INT	3	YDS	1,269	RTG	98.9	NO
		players.add("Drew Brees");
		
		NFLPlayer.NFLPlayer("Derek Barr", "QB", 0);
		// Carr, Derek	ACT	TDS	9	INT	1	YDS	1,066	RTG	104.6	OAK
		players.add("Derek Barr");
		
		
	// Running Backs
		NFLPlayer.NFLPlayer("Ameer Abdullah", "RB", 7);
		//  Abdullah, Ameer	RES	CAR	18	YDS	101	AVG	5.6	TDS	0	DET
		players.add("Ameer Abdullah");
		
		NFLPlayer.NFLPlayer("Jay Ajayi", "RB", 7);
		//  Ajayi, Jay	ACT	CAR	18	YDS	75	AVG	4.2	TDS	1	MIA
		players.add("Jay Ajayi");
		
		NFLPlayer.NFLPlayer("Javorius Allen", "RB", 7);
		//  Allen, Javorius	ACT	CAR	3	YDS	13	AVG	4.3	TDS	0	BAL
		players.add("Javorius Allen");
		
		NFLPlayer.NFLPlayer("Cameron Artis-Payne", "RB", 7);
		//  Artis-Payne, Cameron	ACT	CAR	18	YDS	59	AVG	3.3	TDS	0	CAR
		players.add("Cameron Artis-Payne");
		
		NFLPlayer.NFLPlayer("Matt Asiata", "RB", 7);
		//  Asiata, Matt	ACT	CAR	16	YDS	42	AVG	2.6	TDS	0	MIN
		players.add("Matt Asiata");
		
	// tight Ends
		NFLPlayer.NFLPlayer("Gary Barnidge", "TE", 5);
		// Barnidge, Gary	ACT	REC	16	YDS	160	AVG	10.0	TDS	0	CLE
		players.add("Gary Barnidge");
		
		NFLPlayer.NFLPlayer("Blake Bell", "TE", 5);
		// Bell, Blake	ACT	REC	1	YDS	6	AVG	6.0	TDS	0	SF
		players.add("Blake Bell");
		
		NFLPlayer.NFLPlayer("Martellus Bennett", "TE", 5);
		// Bennett, Martellus	ACT	REC	15	YDS	247	AVG	16.5	TDS	1	NE
		players.add("Martellus Bennett");
		
		NFLPlayer.NFLPlayer("Brent Celek", "TE", 5);
		// Celek, Brent	ACT	REC	4	YDS	72	AVG	18.0	TDS	0	PHI
		players.add("Brent Celek");
		
		NFLPlayer.NFLPlayer("Garrett Celek", "TE", 5);
		// Celek, Garrett	ACT	REC	10	YDS	131	AVG	13.1	TDS	0	SF
		players.add("Garrett Celek");
		
	// wide receivers 
		NFLPlayer.NFLPlayer("Doug Baldwin", "WR", 6);
		// Baldwin, Doug	ACT	REC	24	YDS	330	AVG	13.8	TDS	2	SEA
		players.add("Doug Baldwin");
		
		NFLPlayer.NFLPlayer("Cole Beasley", "WR", 6);
		// Beasley, Cole	ACT	REC	23	YDS	279	AVG	12.1	TDS	0	DAL
		players.add("Cole Beasley");
		
		NFLPlayer.NFLPlayer("Odell Beckham", "WR", 6);
		// Beckham, Odell	ACT	REC	19	YDS	280	AVG	14.7	TDS	0	NYG
		players.add("Odell Beckham");
		
		NFLPlayer.NFLPlayer("Kelvin Benjamin", "WR", 6);
		// Benjamin, Kelvin	ACT	REC	16	YDS	238	AVG	14.9	TDS	4	CAR
		players.add("Kelvin Benjamin");
		
		NFLPlayer.NFLPlayer("Travis Benjamin", "WR", 6);
		// Benjamin, Travis	ACT	REC	21	YDS	277	AVG	13.2	TDS	2	SD
		players.add("Travis Benjamin");
		
		
	// 	Offensive linebacker	
		NFLPlayer.NFLPlayer("Branden Albert", "OL", 8);
		// Albert, Branden	ACT	G	3	GS	3	MIA
		players.add("Branden Albert");
		
		NFLPlayer.NFLPlayer("Vadal Alexander", "OL", 8);
		// Alexander, Vadal	ACT	G	3	GS	1	OAK
		players.add("Vadal Alexander");
		
		NFLPlayer.NFLPlayer("Allen Barbre", "OL", 8);
		// Barbre, Allen	ACT	G	3	GS	3	PHI
		players.add("Allen Barbre");
		
		NFLPlayer.NFLPlayer("Don Barclay", "OL", 8);
		// Barclay, Don	ACT	G	3	GS	0	GB
		players.add("Don Barclay");
		
		NFLPlayer.NFLPlayer("Tim Barnes", "OL", 8);
		// Barnes, Tim	ACT	G	4	GS	4	LA
		players.add("Tim Barnes");
		
		
	// defensive linebackers
		NFLPlayer.NFLPlayer("Geno Atkins", "DL", 10);
		// Atkins, Geno	ACT	TCKL	11	SCK	2.5	FF	0	INT	--	CIN
		players.add("Geno Atkins");
		
		NFLPlayer.NFLPlayer("Denico Autry", "DL", 10);
		// Autry, Denico	ACT	TCKL	5	SCK	1.0	FF	0	INT	--	OAK
		players.add("Denico Autry");
		
		NFLPlayer.NFLPlayer("Cliff Avril", "DL", 10);
		// Avril, Cliff	ACT	TCKL	10	SCK	2.0	FF	1	INT	--	SEA
		players.add("Cliff Avril");
		
		NFLPlayer.NFLPlayer("Robert Ayers", "DL", 10);
		// Ayers, Robert	ACT	TCKL	4	SCK	1.0	FF	0	INT	--	TB
		players.add("Robert Ayers");
		
		NFLPlayer.NFLPlayer("Jonathan Babineaux", "DL", 10);
		// Babineaux, Jonathan	ACT	TCKL	5	SCK	0.0	FF	0	INT	--	ATL
		players.add("Jonathan Babineaux");
	
	// Linebackers
	
		NFLPlayer.NFLPlayer("D.J. Alexander", "LB", 1);
		// Alexander, D.J.	ACT	TCKL	2	SCK	0.0	FF	0	INT	--	KC
		players.add("D.J. Alexander");
		
		NFLPlayer.NFLPlayer("Lorenzo Alexander", "LB", 1);
		// Alexander, Lorenzo	ACT	TCKL	21	SCK	4.0	FF	2	INT	--	BUF
		players.add("Lorenzo Alexander");
		
		NFLPlayer.NFLPlayer("Kwon Alexander", "LB", 1);
		// Alexander, Kwon	ACT	TCKL	38	SCK	2.0	FF	0	INT	1	TB
		players.add("Kwon Alexander");
		
		NFLPlayer.NFLPlayer("Kiko Alonso", "LB", 1);
		// Alonso, Kiko	ACT	TCKL	38	SCK	0.0	FF	0	INT	--	MIA
		players.add("Kiko Alonso");
		
		NFLPlayer.NFLPlayer("Jonathan Anderson", "LB", 1);
		// Anderson, Jonathan	DEV	TCKL	4	SCK	0.0	FF	0	INT	--	CHI
		players.add("Jonathan Anderson");
		
		
	// Defensive backers
		NFLPlayer.NFLPlayer("Bene' Benwikere", "DB", 1);
		// Benwikere, Bene'	ACT	TCKL	10	SCK	0.0	FF	0	INT	1	CAR
		players.add("Bene' Benwikere");
		
		NFLPlayer.NFLPlayer("Nat Berhe", "DB", 1);
		// Berhe, Nat	ACT	TCKL	14	SCK	0.0	FF	1	INT	--	NYG
		players.add("Nat Berhe");
		
		NFLPlayer.NFLPlayer("Eric Berry", "DB", 1);
		// Berry, Eric	ACT	TCKL	17	SCK	0.0	FF	0	INT	1	KC
		players.add("Eric Berry");
		
		NFLPlayer.NFLPlayer("Antoine Bethea", "DB", 1);
		// Bethea, Antoine	ACT	TCKL	28	SCK	0.0	FF	1	INT	1	SF
		players.add("Antoine Bethea");
		
		NFLPlayer.NFLPlayer("Justin Bethel", "DB", 1);
		// Bethel, Justin	ACT	TCKL	4	SCK	0.0	FF	0	INT	--	ARI
		players.add("Justin Bethel");
		
	// Kickers	
		NFLPlayer.NFLPlayer("Josh Brown", "K", 1);
		// Brown, Josh	ACT	FGA	6	FGM	5	PCT	83.3	LNG	48	NYG
		players.add("Josh Brown");
	
		NFLPlayer.NFLPlayer("Matt Bryant", "K", 1);
		// Bryant, Matt	ACT	FGA	8	FGM	8	PCT	100.0	LNG	53	ATL
		players.add("Matt Bryant");
		
		NFLPlayer.NFLPlayer("Randy Bullock", "K", 1);
		// Bullock, Randy	CUT	FGA	0	FGM	0	PCT	--	LNG	0	NYG
		players.add("Randy Bullock");
		
		NFLPlayer.NFLPlayer("Dan Carpenter", "K", 1);
		// Carpenter, Dan	ACT	FGA	8	FGM	6	PCT	75.0	LNG	45	BUF
		players.add("Dan Carpenter");
		
		NFLPlayer.NFLPlayer("Chandler Catanzaro", "K", 1);
		// Catanzaro, Chandler	ACT	FGA	6	FGM	5	PCT	83.3	LNG	60	ARI
		players.add("Chandler Catanzaro");	
	
	}
	
	//@Override
	public String toString()
	{
		return ("Number of Available Players: " + players.size());
 	}
}
