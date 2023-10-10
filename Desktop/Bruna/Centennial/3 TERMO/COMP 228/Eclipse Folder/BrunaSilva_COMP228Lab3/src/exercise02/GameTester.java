package exercise02;


abstract class GameTester {
	
	//variables of the name and the status 
	  private String name;
	  private boolean statusFullTime;

	  //constructor of the class GameTester 
	  public GameTester(String name, boolean statusFullTime){
		  this.name = name;
		  this.statusFullTime = statusFullTime;
	  }
	  
	  //method that will be implement on the other class 
	  public abstract int Salary();
	  
	  //get of the name and Status 
	  public String getName() {
	        return name;
	    }

	    public boolean getStatusFullTime() {
	        return statusFullTime;
	    }
	  
}

class FullTimeGameTester extends GameTester{
	 
	//constructor
	public FullTimeGameTester(String name){
		super(name,true);
	}
	
	//Implementation of the class Salary which one already return 3000 as the salary 
	 public int Salary(){
		return 3000;
		 
	 }

}


class PartTimeGameTester extends GameTester{
	
	//variable to get declare the  hours to calculate the salary
	int hrs;
	 
	//constructor
	public PartTimeGameTester(String name,int hrs){
		super(name,false);
		this.hrs=hrs;
	}
	
	//Implementation of the class Salary which will calculate the hours with 20 and return the salary 
	public int Salary(){
		int salarytotal = hrs*20;
		return salarytotal;
	 }
	
}