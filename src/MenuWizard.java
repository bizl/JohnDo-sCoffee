 
/*
 * Menu redesigned with a wizard in mind 
 * The menu can either go forward or backwards depending on the set sequence
 * The menu tree is setup when the class is initialised 
 *  
 * */
public class MenuWizard {
	CoffeeMenu currentMenu=null;
	CoffeeMenu previousMenu=null;
	CoffeeMenu topMenu=null;
	
	
	public MenuWizard(){
		CoffeeMenu milkMenu = new CoffeeMenu("You chose %s milk?\n1. Y\n2. No\n", null, new String[] {"Y","N"} );
		CoffeeMenu sizeMenu = new CoffeeMenu("You chose %s what size?\n1. Small\n2. Medium\n3. Large\n", milkMenu,  new String[] {"Small","Medium", "Large"});
		CoffeeMenu mainMenu = new CoffeeMenu("Enter customer order\n1. Late\n2. Mocha\n3. Black\n", sizeMenu,   new String[] {"Late","Mocha", "Black"});
		
		topMenu = mainMenu; 
		currentMenu = mainMenu;
		ShowMenu ();
	}
 
	private void ShowMenu() {
		if(currentMenu!=null) { 
			if( previousMenu!=null)
				System.out.printf(currentMenu.Data(), previousMenu.GetUserSelection());
			else  
				System.out.printf(currentMenu.Data());
		} 
	}

	public void ShowNextMenu(int selection){
		
		currentMenu.SetUserSelection(selection);
		String entered = currentMenu.GetUserSelection(); 
		if(entered.startsWith("Please enter"))
		{
			System.out.println(entered); 
			return;
		} 
		else {
			previousMenu = currentMenu;
			if( currentMenu.Child() !=null )
			{  
				currentMenu = currentMenu.Child();
				ShowMenu();
			} 
		}  
	}
	
	public boolean ReachedEnd()
	{
		return currentMenu.Child() ==null;
	}
	 
	public CoffeeMenu GetTopMenu()
	{
		return topMenu;
	}
	
	
}


