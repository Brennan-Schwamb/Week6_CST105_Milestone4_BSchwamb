//Program: 
//File: NFLplayer.java
//Summary: 
//Author: Brennan M. Schwamb
//Date: October 4, 2018
import java.util.ArrayList;

public class PlayerManager {
	
//ArrayList definition
public static ArrayList Players;
	
//Constructor
public PlayerManager() {
}
	
//Creating toString method
public String toString() {
	return "PlayerManager[" + Players + "]";
}
	    
public static void createPlayers(ArrayList Players) {
	//Creating Players
	Players.add(new DefensivePlayer("Joe Mixon", "Defense", 2, 23, "Cornerback", 22));
	Players.add(new DefensivePlayer("Baker Mayfield", "Defense", 1, 3, "Cornerback", 23));
	Players.add(new DefensivePlayer("Odell Beckham Jr", "Defense", 4, 39, "Cornerback", 25));
	Players.add(new OffensivePlayer("David Johnson", "Offense", 3, 26, "Runningback", 2030, 26));
	Players.add(new OffensivePlayer("Doug Baldwin", "Offense", 7, 44, "Widereciever", 5986, 30));
	Players.add(new OffensivePlayer("Larry Fitzgerald", "Offense", 14, 110, "Widereciever", 15686, 35));
}
//main method	
public static void main(String[] args) {
	
	//Creating ArrayList
	ArrayList Players = new ArrayList();
	createPlayers(Players);
	//Printing list of players
	System.out.println("Players" + Players.toString());

	
}
}
