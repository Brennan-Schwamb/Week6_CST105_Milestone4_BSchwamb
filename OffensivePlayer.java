
public class OffensivePlayer extends NFLplayer 
{
	// variable declaration
	private int careerTD;
	private double careerYards;

	//Constructors	
	public OffensivePlayer() {
		careerTD = 0;
		careerYards = 0;
	}
	public OffensivePlayer(String name, 
			 			   String playerType, 
			               int yearsPro, 
			               int age, 
			               String playerPosition, 
			               int careerTD,
						   double careerYards) {

		this.careerTD = careerTD;
		this.careerYards = careerYards;
		this.name = name;
		this.playerType = playerType;
		this.yearsPro = yearsPro;
		this.age = age;
		this.playerPosition = playerPosition;	
	}
	// Methods
	public void setTD(int newCareerTD){
		//Set Career TD's 
		careerTD = newCareerTD;
	}
	public void setYards(int newCareerYards){
		// Set Career Yards
		careerYards = newCareerYards;
	}
	public int getCareerTD(){
		// Get career TD's
		return careerTD;
	}
	public double getCareerYards(){
		// Get career Yards
		return careerYards;
	}
	   public double getAverageTDPerYear(){
	        // Get Average Touchdowns 
	        return (careerTD / yearsPro);
	}
	    public double getAverageYardsPerYear(){
	        // Returns average yards per year 
	        return (careerYards / yearsPro);
	}
	      // To string method 
		    public String toString() {

		        return "[" + this.name + ", " + this.playerType + ", " + this.careerTD+ "]";

		    }
}
