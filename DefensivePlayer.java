
public class DefensivePlayer extends NFLplayer {
	
	// variable declaration
	private int careerTackles;
	
	//Constructors
	public DefensivePlayer() {
		careerTackles = 0;
	}
		public DefensivePlayer(String name, 
				 			   String playerType, 
				 			   int yearsPro, 
				 			   int age, 
				 			   String playerPosition, 
				 			   int careerTackles) {
			this.careerTackles = careerTackles;			
			this.name = name;
			this.playerType = playerType;
			this.yearsPro = yearsPro;
			this.age = age;
			this.playerPosition = playerPosition;
	}
	// Methods	
		public void setTackle(int newCareerTackles){
			// Set Career Tackles 
			careerTackles = newCareerTackles;
	}
		   public double getAverageTacklesPerYear() {
		        // Returns average tackles per year
		        return (careerTackles / yearsPro);
	}
		      // To string method 
		    public String toString() {

		        return "[" + this.name + ", " + this.playerType + ", " + this.careerTackles + "]";

		    }
}
