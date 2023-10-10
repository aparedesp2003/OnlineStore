package exercise01;
import java.util.Scanner;


public class Driver {
	 public static void main(String[] args) {
	
		 
	 //taking the input from the user
	 Scanner scanner = new Scanner(System.in);
	 
	//Array that save the two input from the user, to it needs to have only 2 index
     Insurance[] InstArray = new Insurance[2]; 
     
     
     boolean ToContinue = true;
     //a loop to keep take the values from the user
     do
     {  
    	 
    //the question to know the insurance type and monthly fee from the user
     System.out.print("What's your insurance type? ");
     String userInput1 = scanner.nextLine();
     
     System.out.print("What's much is your monthly fee? ");
     double userInput2 = scanner.nextDouble();
     scanner.nextLine();
          
     System.out.println();
     

    
     	//if the user input is Life then the object is from the  class life, else is from Health
     	if (userInput1.equalsIgnoreCase("life"))  
     	{
         Life obj1 = new Life(userInput1, userInput2);
         InstArray[0] = obj1;
     	}
     	
     	else if (userInput1.equalsIgnoreCase("health"))
     	{
         Health obj2 = new Health(userInput1, userInput2);
         InstArray[1] = obj2;
     	}
     	
     	
     	//to go outside of the loop 
     	 System.out.print("Do you wanna type more values? yes or no ");
         String outloop = scanner.nextLine();
         System.out.println();
         
         
         //display the array objects
         if(outloop.equalsIgnoreCase("no"))
         {
        	 	//to display the array objects 
   	      		for (Insurance insurance : InstArray) 
   	      		{
		   	    	  if(insurance!=null)
		   	    	  {
		   	    		  insurance.displayInfo();
		   	    		
		   	    	  }
   	      		}
   	      
   	      	ToContinue=false;
         }
     }while(ToContinue);	        
   }
}
