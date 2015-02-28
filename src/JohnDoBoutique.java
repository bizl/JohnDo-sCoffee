import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;


public class JohnDoBoutique {
	
	 static String _nextLevel = "main";
	 
	public static void main(String[] args) throws Exception {
		System.out.println("John Do's Boutique\n-------------------");
		PrintMenu(1);

	    Scanner sc = new Scanner(System.in); 
	    int  whatUsersEntered = 0;//sc.nextLine();
          
        while(true )    { 
        	try{
	        	whatUsersEntered = sc.nextInt();
	        	PrintMenu(whatUsersEntered);
        	}
        	catch(Exception ex)
        	{ 	
        		System.out.println(ex.getMessage());
        		sc.next();
        	}
        }
	}

	private static void PrintMenu(int userEntered) { 
		
		if (_nextLevel =="Coffee"){
			 String theMenu=""; 
			 if(userEntered == 1)
			 {
				theMenu =  "You chose Late, what size?\n";
				_nextLevel = "Late";  
			 }
			else if(userEntered ==2)
			{
				theMenu =  "You chose Mocha, what size?\n";
				_nextLevel = "Mocha";  
			}
			else if(userEntered ==3){
				theMenu =  "You chose Black, what size?\n";
				_nextLevel = "Black";  
			}
			System.out.print( theMenu +  "1. Small\n2. Medium\n3. Large\n");
		} 
		else if (_nextLevel =="Black"){
			if(userEntered== 1){ 
				System.out.print(  "You chose Small Black, with milk?\n"
						  +"1. Y\n"
						  +"2. N\n"); 
				_nextLevel = "LateBlack"; 
			} 
			if(userEntered== 2){ 
				System.out.print( "You chose Medium Black, with milk?\n"
						  +"1. Y\n"
						  +"2. N\n"); 
				_nextLevel = "BlackMedium"; 
			} 
			if(userEntered== 3){ 
				System.out.print( "You chose Large Black, with milk?\n"
						  +"1. Y\n"
						  +"2. N\n"); 
				_nextLevel = "BlackLarge"; 
			} 
		} 
		else if (_nextLevel =="Mocha"){
			if(userEntered== 1){ 
				System.out.print(  "You chose Small Mocha, with milk?\n"
						  +"1. Y\n"
						  +"2. N\n"); 
				_nextLevel = "MochaSmall"; 
			} 
			if(userEntered== 2){ 
				System.out.print(  "You chose Medium Mocha, with milk?\n"
						  +"1. Y\n"
						  +"2. N\n"); 
				_nextLevel = "MochaMedium"; 
			} 
			if(userEntered== 3){ 
				System.out.print(  "You chose Large Mocha, with milk?\n"
						  +"1. Y\n"
						  +"2. N\n"); 
				_nextLevel = "MochaLarge"; 
			} 
		} 
		else if (_nextLevel =="Late"){
			if(userEntered== 1){ 
				System.out.print(    "You chose Small Late, with milk?\n"
						  +"1. Y\n"
						  +"2. N\n"); 
					_nextLevel = "LateSmall"; 
			} 
			if(userEntered== 2){ 
				System.out.print(   "You chose Medium Late, with milk?\n"
						  +"1. Y\n"
						  +"2. N\n"); 
					_nextLevel = "LateMedium"; 
			} 
			if(userEntered== 3){ 
				System.out.print(  "You chose Large Late, with milk?\n"
						  +"1. Y\n"
						  +"2. N\n"); 
					_nextLevel = "LateLarge"; 
			} 
		} 
		
		else if (_nextLevel =="BlackSmall"){
			if(userEntered== 1){  
				System.out.printf( "You chose Small Black WITH milk\nTotal £%.2f\n", 2.5 ) ; 
				_nextLevel = "BlackSmallMilk"; 
			}
			if(userEntered== 2){  
				System.out.printf( "You chose Small Black NO milk\nTotal £%.2f\n", 2.5 ) ; 
				_nextLevel = "BlackSmallNoMilk"; 
			}
		} 
		else if (_nextLevel =="BlackMedium"){
			if(userEntered== 1){  
				System.out.printf( "You chose Medium Black WITH milk\nTotal £%.2f\n", 3.5 ) ; 
				_nextLevel = "BlackMediumMilk"; 
			}
			if(userEntered== 2){  
				System.out.printf( "You chose Medium Black NO milk\nTotal £%.2f\n", 3.5 ) ; 
				_nextLevel = "BlackMediumNoMilk"; 
			}
		} 
		else if (_nextLevel =="BlackLarge"){
			if(userEntered== 1){ 
				System.out.printf( "You chose Large Black WITH milk\nTotal £%.2f\n", 3.5 ) ; 
				_nextLevel = "BlackLargeMilk"; 
			}
			if(userEntered== 2){ 
				System.out.printf( "You chose Large Black NO milk\nTotal £%.2f\n", 4.50 ) ; 
				_nextLevel = "BlackLargeNoMilk"; 
			}
		} 
		
		else if (_nextLevel =="MochaSmall"){
			if(userEntered== 1){  
				System.out.printf( "You chose Small Mocha WITH milk\nTotal £%.2f\n", 2.5 ) ; 
				_nextLevel = "MochaSmallMilk"; 
			}
			if(userEntered== 2){  
				System.out.printf( "You chose Small Mocha NO milk\nTotal £%.2f\n", 2.5 ) ; 
				_nextLevel = "MochaSmallNoMilk"; 
			}
		} 
		else if (_nextLevel =="MochaMedium"){
			if(userEntered== 1){  
				System.out.printf( "You chose Medium Mocha WITH milk\nTotal £%.2f\n", 3.5 ) ; 
				_nextLevel = "MochaMediumMilk"; 
			}
			if(userEntered== 2){  
				System.out.printf( "You chose Medium Mocha NO milk\nTotal £%.2f\n", 3.5 ) ; 
				_nextLevel = "MochaMediumNoMilk"; 
			}
		} 
		else if (_nextLevel =="MochaLarge"){
			if(userEntered== 1){ 
				System.out.printf( "You chose Large Mocha WITH milk\nTotal £%.2f\n", 3.5 ) ; 
				_nextLevel = "MochaLargeMilk"; 
			}
			if(userEntered== 2){ 
				System.out.printf( "You chose Large Mocha NO milk\nTotal £%.2f\n", 4.50 ) ; 
				_nextLevel = "MochaLargeNoMilk"; 
			}
		} 
		
		else if (_nextLevel =="LateSmall"){
			if(userEntered== 1){  
				System.out.printf( "You chose Small Late WITH milk\nTotal £%.2f\n", 2.5 ) ; 
				_nextLevel = "LateSmallMilk"; 
			}
			if(userEntered== 2){  
				System.out.printf( "You chose Small Late NO milk\nTotal £%.2f\n", 2.5 ) ; 
				_nextLevel = "LateSmallNoMilk"; 
			}
		} 
		else if (_nextLevel =="LateMedium"){
			if(userEntered== 1){  
				System.out.printf( "You chose Medium Late WITH milk\nTotal £%.2f\n", 3.5 ) ; 
				_nextLevel = "LateMediumMilk"; 
			}
			if(userEntered== 2){  
				System.out.printf( "You chose Medium Late NO milk\nTotal £%.2f\n", 3.5 ) ; 
				_nextLevel = "LateMediumNoMilk"; 
			}
		} 
		else if (_nextLevel =="LateLarge"){
			if(userEntered== 1){ 
				System.out.printf( "You chose Large Late WITH milk\nTotal £%.2f\n", 3.5 ) ; 
				_nextLevel = "LateLargeMilk"; 
			}
			if(userEntered== 2){ 
				System.out.printf( "You chose Large Late NO milk\nTotal £%.2f\n", 4.50 ) ; 
				_nextLevel = "LateLargeNoMilk"; 
			}
		} 
		else {
			System.out.print(   "Enter customer order\n1. Late\n2. Mocha\n3. Black\n" ) ;
			_nextLevel = "Coffee"; 
		} 
		 
	}

}
