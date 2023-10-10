package exercise01;

abstract class Insurance {
	
	//variable which describe the insurance and the monthly cost
	public String typeInsurence;
	public double monthlyCost;
	
	//constructor 
	public Insurance(String typeInsurence, double monthlyCost){
		this.typeInsurence =typeInsurence;
		this.monthlyCost = monthlyCost;
	}
	
	//method to get the variables
	public String gettypeInsurence() {
		return typeInsurence;
	}
	
	public double getmonthlyCost(){
		return monthlyCost;
	}
	
	public abstract void setInsuranceCost(double monthlyCost);
	
	public abstract void displayInfo();
	

}
	 class Health extends Insurance{
		
		 //constructor
		public Health(String typeInsurence, double monthlyCost) {
			 super(typeInsurence, monthlyCost);
		}

		
		public void setInsuranceCost(double monthlyCost) {
			this.monthlyCost= monthlyCost;

		}
		
		//display the message included the insurance type and the monthly fee
		public void displayInfo() {
			
			System.out.println("Your insurance type is: " + typeInsurence +  " and your monthly payment is: $" + monthlyCost + "dollars");
			
		}
		
	}

	
	 class Life extends Insurance{
		
		 //constructor
		public Life(String typeInsurence, double monthlyCost) {
			 super(typeInsurence, monthlyCost);
		}

		public void setInsuranceCost(double monthlyCost) {
			this.monthlyCost= monthlyCost;

		}
		
		//display the message included the insurance type and the monthly fee
		public void displayInfo() {
			
			System.out.println("Your insurance type is: " + typeInsurence +  " and your monthly payment is: $" + monthlyCost + " dollar");	
		}
		
	}



