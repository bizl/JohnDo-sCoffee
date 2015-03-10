import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;


public class JohnDoBoutique {
	
	 static String _nextLevel = "main";
	 static MenuWizard menuWizard;
	 
	public static void main(String[] args) throws Exception {
		System.out.println("John Do's Boutique\n-------------------"); 
		menuWizard  = new MenuWizard(); 

	    Scanner sc = new Scanner(System.in); 
	    int  whatUserEntered = 0;
          
        while(true )    { 
        	try{
	        	whatUserEntered = sc.nextInt(); 
	        	if(menuWizard.ReachedEnd()) 
	        	{  
	        		System.out.printf("\nTotal price: £%.2f\n\n\n", Pricing.GetCostFromMenus(menuWizard));
	        		menuWizard = new MenuWizard();
	        		whatUserEntered = 0;
	        	}
	        	else 
	        		menuWizard.ShowNextMenu(whatUserEntered);
	        	
        	}
        	catch(Exception ex)
        	{ 	
        		System.out.println(ex.getMessage());
        		sc.next();
        	}
        }
	}

 

}
