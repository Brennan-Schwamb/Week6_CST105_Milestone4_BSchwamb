//Program: 
//File: NFLplayer.java
//Summary: 
//Author: Brennan M. Schwamb
//Date: October 4, 2018


public abstract class NFLplayer 
{

	// variable declaration
	protected String name;
	protected String playerType;   
	protected int yearsPro;
	protected String playerPosition;
	
	protected int age;
	//Constructors	
	public NFLplayer() {
		name = null;
		playerType = null;
		yearsPro = 0;
		age = 0;
	
	}
	public NFLplayer(String name, 
					 String playerType, 
					 int yearsPro, 
					 int age, String playerPosition)
					
					 {
		this.name = name;
		this.playerType = playerType;
		this.yearsPro = yearsPro;
		this.age = age;
	this.playerPosition = playerPosition;
}

	// Methods
		
	public void setName(String newName) {
	// Set Name 
		name = newName;
	}
	public void setType(String newPlayerType){
		// Set Type
		playerType = newPlayerType;
	}
	public void setplayerPosition(String newplayerPosition) {
		//Set player position
		playerPosition = newplayerPosition;
	}
	
	public void setYears(int newYearsPro){
			//Set years Pro
			yearsPro = newYearsPro;
		} 
		public String getName(){
			// Get player name 
			return name;
		}
		public String getPlayerType(){
			// Get player type
			return playerType;
		}
		public int getYearsPro(){
			// Get years Pro
			return yearsPro;
		}
	
		public int getAge(){
			// Get player age 
			return age;
		}
	    public String getplayerPosition() {
	    	return playerPosition;
	    }
		//To String meathod
	    public String toString() {

	        return "[" + this.name + ", " + this.playerType + "]";

	    }
	
}